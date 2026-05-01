package org.example.factory;


class CreditCardPayment implements PaymentFactory {
    public void pay() {
        System.out.println("payment via creditcard");
    }
}
class UPIPayment implements PaymentFactory{
    public void pay(){
        System.out.println("payment via upi ");
    }
}

 public class Payments {
    public static PaymentFactory getPayment(String type){
        if(type == null){
            throw new IllegalArgumentException("type cannot be null or empty");
        }
        if(type.equalsIgnoreCase("CREDIT")){
            return new CreditCardPayment();
        }
        if(type.equalsIgnoreCase("UPI")){
            return new UPIPayment();
        }
        return null;
    }
}