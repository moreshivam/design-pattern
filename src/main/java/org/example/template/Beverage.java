package org.example.template;

public abstract class Beverage {

    public final void prepare(){
        boilWater();
        addMainIngredient();
        addSugar();
        serve();
    }
    public void boilWater(){
        System.out.println("Water is Boiling");
    }

    abstract void addMainIngredient();

    public void addSugar(){
        System.out.println("Adding Sugar");
    }

    public void serve(){
        System.out.println("Serving the beverage");
    }
}
