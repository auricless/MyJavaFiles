package com.example.java;

public class Main {

    public static void main(String[] args) {

        CreditCard card = new PredatoryCreditCard("Aron", "Security Bank", "5391 0375 9387 5309", 20_000, 5_000, 5);
        card.processMonth(); // This cannot be called because the reference var is unknown to the instance

    }
}
