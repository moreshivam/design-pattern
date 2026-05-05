package org.example.observer;



public class MobileUser implements Observer {

    public void update(String message){
        System.out.println("mobile user received message" + message);
    }
}
