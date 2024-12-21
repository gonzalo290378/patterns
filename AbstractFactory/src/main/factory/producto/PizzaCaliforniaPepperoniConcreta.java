package main.factory.producto;

import main.factory.PizzaProducto;

public class PizzaCaliforniaPepperoniConcreta extends PizzaProducto {

    public PizzaCaliforniaPepperoniConcreta() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la Piedra Gruesa";
        salsa = "Salsa de tomate";
        ingredientes.add("Extra Queso Mozarella");
        ingredientes.add("Aceitunas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min. a 55 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en pequeños rectangulos");

    }
}
