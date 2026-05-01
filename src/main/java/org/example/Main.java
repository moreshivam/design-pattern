package org.example;

import org.example.factory.PaymentFactory;
import org.example.factory.Payments;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Singleton instance = Singleton.getInstance();

        PaymentFactory payment = Payments.getPayment("credit");
          payment.pay();

    }
}

