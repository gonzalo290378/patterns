package main.factory.producto;

import main.factory.PizzaProducto;

public class PizzaCaliforniaQuesoConcreta extends PizzaProducto {

    public PizzaCaliforniaQuesoConcreta() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la Piedra Delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra Queso Mozarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso Azul");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min. a 100 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en pequeños triangulos");

    }
}
