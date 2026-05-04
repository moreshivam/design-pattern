package org.example;

import org.example.adapter.OldPaymentSystem;
import org.example.adapter.Payment;
import org.example.adapter.PaymentAdapter;
import org.example.factory.PaymentFactory;
import org.example.factory.Payments;
import org.example.strategy.CreditCard;
import org.example.strategy.PaymentService;
import org.example.strategy.PaymentStrategy;
import org.example.strategy.UPIPayment;
import org.example.template.Beverage;
import org.example.template.Tea;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //singleton pattern
        Singleton instance = Singleton.getInstance();

        //factory pattern
        PaymentFactory payment = Payments.getPayment("credit");
          payment.pay();

         //adapter pattern
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();
        Payment adapter = new PaymentAdapter(oldPaymentSystem);
        adapter.pay(5000);

        //template pattern
        Beverage tea = new Tea();
        tea.prepare();


        //strategy pattern
        PaymentStrategy strategy = new CreditCard();

        PaymentService service = new PaymentService(strategy);

        service.processPayment(1000);
    }
}

