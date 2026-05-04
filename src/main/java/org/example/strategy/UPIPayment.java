package org.example.strategy;

public class UPIPayment implements PaymentStrategy {

    public void pay (int amount){
        System.out.println("paying via UPI" + amount);
    }
}
