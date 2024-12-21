package main.factory.producto;

import main.factory.PizzaProducto;

public class PizzaNewYorkVegetarianaConcreta extends PizzaProducto {

    public PizzaNewYorkVegetarianaConcreta() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa Integral Vegana";
        salsa = "Salsa de tomates";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en rebanadas cuadradas");

    }
}
