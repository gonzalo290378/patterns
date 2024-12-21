package main.factory.main;

import main.factory.PizzaProducto;
import main.factory.PizzeriaCaliforniaFactory;
import main.factory.PizzeriaNewYorkFactory;
import main.factory.PizzeriaZonaAbstractFactory;

public class EjemploAbstract {

        public static void main(String[] args) {
            PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
            PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

            PizzaProducto pizza = california.ordenarPizza("queso");
            System.out.println("Bruce ordena la pizza " + pizza.getNombre());

            pizza = california.ordenarPizza("pepperoni");
            System.out.println("Luis ordena la pizza " + pizza.getNombre());

            pizza = ny.ordenarPizza("italiana");
            System.out.println("Andres ordena la pizza " + pizza.getNombre());

            pizza = ny.ordenarPizza("vegetariana");
            System.out.println("Luis ordena la pizza " + pizza.getNombre());
        }

}
