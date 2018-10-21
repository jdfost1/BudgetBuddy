package com.budgetBuddy.bank;

import java.util.Map;

public class BankTransaction {

    private final String date;
    private final String description;
    private final double amount;
    private final Map<String, String> metadata;

    public BankTransaction(String date, String description, double amount, Map<String, String> metadata) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.metadata = metadata;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", metadata=" + metadata +
                '}';
    }
}