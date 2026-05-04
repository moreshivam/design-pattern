package org.example.strategy;

public class CreditCard implements PaymentStrategy {

    public void pay (int amount){
        System.out.println("paying via credit card" + amount);
    }
}
