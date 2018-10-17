package com.budgetBuddy.bank;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class BankParser {

    public static List<BankTransaction> parseBankTransactions(final Reader in) throws IOException {
        final List<BankTransaction> bankTransactions = new ArrayList<>();

        final Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
        for (CSVRecord record : records) {
            final String date = record.get("Date");
            final String description = record.get("Description");
            final String debit = record.get("Debit");
            final String credit = record.get("Credit");

            final BankTransaction bankTransaction = new BankTransaction(date, description, debit.length() == 0 ? 0
                    : Double.parseDouble(debit), credit.length() == 0 ? 0 : Double.parseDouble(credit));
            bankTransactions.add(bankTransaction);
        }
        return bankTransactions;
    }
}
