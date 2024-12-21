package main.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: this.observers) {
            observer.update(this);
        }
    }
}
