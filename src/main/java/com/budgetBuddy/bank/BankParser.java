package com.budgetBuddy.bank;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class BankParser {

    public static List<BankTransaction> parseBankTransactions(final Reader in) throws IOException {
        final List<BankTransaction> bankTransactions = new ArrayList<>();

        final CSVParser parser = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
        final List<CSVRecord> records = parser.getRecords();

        final String dateColumn = detectDateColumn(records.get(0));
        final String descriptionColumn = detectDescriptionColumn(records);
        final String amountColumn = detectAmountColumn(records.get(0));
        for (CSVRecord record : records) {
            final Map<String, String> metadata = record.toMap();
            final String date = metadata.remove(dateColumn);
            final String description = metadata.remove(descriptionColumn);
            final double amount = Double.parseDouble(formatAmount(metadata.remove(amountColumn)));

            final BankTransaction transaction = new BankTransaction(date, description, amount, metadata);
            bankTransactions.add(transaction);
        }

        return bankTransactions;
    }

    /**
     * Detects which column in a record is the date column by matching the column values to a regex expression
     * representing the date format.
     *
     * @param record The record being used to detect the date column.
     * @return The detected date column.
     */
    private static String detectDateColumn(final CSVRecord record) {
        for (Map.Entry<String, String> entry : record.toMap().entrySet())
            if (entry.getValue().matches("[0-9]{1,2}(/|-)[0-9]{1,2}(/|-)[0-9]{4}")
                    || entry.getValue().matches("[0-9]{4}(/|-)[0-9]{1,2}(/|-)[0-9]{1,2}"))
                return entry.getKey();
        return null;
    }

    /**
     * Detects which column in a list of records is the description column by finding the longest average alphabetic
     * string column value.
     *
     * @param records The list of records being used to find the description column.
     * @return The detected description column.
     */
    private static String detectDescriptionColumn(final List<CSVRecord> records) {
        final Map<String, Integer> map = new HashMap<>();
        for (final CSVRecord record : records)
            for (Map.Entry<String, String> entry : record.toMap().entrySet())
                if (entry.getValue().chars().anyMatch(Character::isAlphabetic))
                    map.put(entry.getKey(), map.getOrDefault(entry.getValue(), 0) + entry.getValue().length());
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (maxEntry == null || entry.getValue() > maxEntry.getValue())
                maxEntry = entry;
        return maxEntry.getKey();
    }

    /**
     * Detects which column in a record is the amount column by attempting to parse the column values to a double.
     *
     * @param record The record being used to detect the amount column.
     * @return The detected amount column.
     */
    private static String detectAmountColumn(final CSVRecord record) {
        for (final Map.Entry<String, String> entry : record.toMap().entrySet())
            if (entry.getValue().length() < 15)
                try {
                    Double.parseDouble(formatAmount(entry.getValue()));
                    return entry.getKey();
                } catch (final NumberFormatException e) {
                }
        return null;
    }

    /**
     * Formats the specified amount value by removing the dollar sign and any commas.
     *
     * @param amount The amount value to be formatted.
     * @return The formatted amount value.
     */
    private static String formatAmount(String amount) {
        amount = amount.replace("$", "").replace(",", "").trim();
        return amount.length() == 0 ? "0" : amount;
    }
}
