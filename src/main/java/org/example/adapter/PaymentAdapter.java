package org.example.adapter;

public class PaymentAdapter implements Payment{

    private OldPaymentSystem oldPaymentSystem;
    public PaymentAdapter(OldPaymentSystem oldPaymentSystem){
        this.oldPaymentSystem = oldPaymentSystem;
    }
   public void pay(int amount){
        oldPaymentSystem.pay(String.valueOf(amount));
    }
}
