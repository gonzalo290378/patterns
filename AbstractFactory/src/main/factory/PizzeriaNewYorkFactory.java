package main.factory;

import main.factory.producto.PizzaNewYorkItalianaConcreta;
import main.factory.producto.PizzaNewYorkPepperoniConcreta;
import main.factory.producto.PizzaNewYorkVegetarianaConcreta;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    protected PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto;
        return switch (tipo){
            case "vegetariana" -> producto = new PizzaNewYorkVegetarianaConcreta();
            case "pepperoni" -> producto = new PizzaNewYorkPepperoniConcreta();
            case "italiana" -> producto = new PizzaNewYorkItalianaConcreta();
            default -> null;
        };
    }
}
