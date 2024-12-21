package main.observer;

@FunctionalInterface
public interface Observer {
    void update(Observable observable);
}
