package com.budgetbuddy.bank;

public class BankTransaction {

    private final String date;
    private final String description;
    private final double debit;
    private final double credit;

    public BankTransaction(String date, String description, double debit, double credit) {
        this.date = date;
        this.description = description;
        this.debit = debit;
        this.credit = credit;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                '}';
    }
}