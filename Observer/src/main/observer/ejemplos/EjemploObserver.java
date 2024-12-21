package main.observer.ejemplos;

import main.observer.Corporation;

public class EjemploObserver {

    public static void main(String[] args) {
        Corporation google = new Corporation("Google: ", 1000);

        google.addObserver(observable -> {
            System.out.println("John: " + observable);
        });

        google.addObserver(observable -> {
            System.out.println("Andres: " + observable);
        });

        google.addObserver(observable -> {
            System.out.println("Gonzalo: " + observable);
        });

        google.modificaPrecio(2000);
    }
}
