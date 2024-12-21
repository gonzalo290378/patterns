package main.factory.producto;

import main.factory.PizzaProducto;

public class PizzaNewYorkPepperoniConcreta extends PizzaProducto {

    public PizzaNewYorkPepperoniConcreta() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa Delgada a la piedra";
        salsa = "Salsa de tomates";
        ingredientes.add("Queso mozarella");
        ingredientes.add("Extra Pepperoni");
        ingredientes.add("Aceitunas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en triangulos");

    }
}
