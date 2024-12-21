package main.factory.producto;

import main.factory.PizzaProducto;

public class PizzaCaliforniaVegetarianaConcreta extends PizzaProducto {

    public PizzaCaliforniaVegetarianaConcreta() {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa Delgada Light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjenas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en rebanadas rectangulares");

    }
}
