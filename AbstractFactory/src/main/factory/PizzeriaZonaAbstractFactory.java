package main.factory;
public abstract class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando la pizza " + pizza.getNombre() + " ------------");
        pizza.preparar();
        pizza.cocinar();
        pizza.empaquetar();
        return pizza;
    }

    //Este metodo es protected solo de la clase (Solo la clase abstracta PizzeriaZonaAbstractFactory puede crear una pizza)
    protected abstract PizzaProducto crearPizza(String tipo);
}
