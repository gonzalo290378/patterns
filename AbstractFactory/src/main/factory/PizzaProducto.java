package main.factory;

import java.util.ArrayList;
import java.util.List;
 public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;


    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    //Orden de la preparacion del comienzo a fin
    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agredando ingredientes");
        this.ingredientes.forEach(System.out::println);
    }

    public abstract void cocinar();
    public abstract void cortar();
    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja");
    }

     public String getNombre() {
         return nombre;
     }

     @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
