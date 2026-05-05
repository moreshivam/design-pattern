package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void setNews(String news){
        this.news = news ;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update(news);
        }
    }
}
