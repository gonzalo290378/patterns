package main.factory;

import main.factory.producto.PizzaCaliforniaPepperoniConcreta;
import main.factory.producto.PizzaCaliforniaQuesoConcreta;
import main.factory.producto.PizzaCaliforniaVegetarianaConcreta;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    protected PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        return switch (tipo){
            case "queso" -> producto = new PizzaCaliforniaQuesoConcreta();
            case "pepperoni" -> producto = new PizzaCaliforniaPepperoniConcreta();
            case "vegetariana" -> producto = new PizzaCaliforniaVegetarianaConcreta();
            default -> null;
        };
    }
}
