package org.example.strategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService (PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void processPayment(int amount){
        strategy.pay(amount);
    }
}
