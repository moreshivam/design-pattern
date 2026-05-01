package org.example;

public class Singleton {

    private final static Singleton instance = new Singleton();

    private static boolean instanceCreated = false;
    
    private Singleton(){
        if (instanceCreated){
            throw new RuntimeException(" use getInstance() method");
        }
        instanceCreated = true;
    }

    public static Singleton getInstance(){
        return instance;
    }
}
