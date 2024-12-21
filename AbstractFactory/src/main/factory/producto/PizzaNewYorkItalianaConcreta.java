package main.factory.producto;

import main.factory.PizzaProducto;

public class PizzaNewYorkItalianaConcreta extends PizzaProducto {

    public PizzaNewYorkItalianaConcreta() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa Gruesa";
        salsa = "Salsa de tomates italiana carne";
        ingredientes.add("Queso mozarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 120 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en triangulos grandes");

    }
}
