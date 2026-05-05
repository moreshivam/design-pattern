package org.example.observer;

public class EmailUser implements Observer{

    public void update(String message){
        System.out.println("email user received message" + message);
    }

}
