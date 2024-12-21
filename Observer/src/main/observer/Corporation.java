package main.observer;

//Este es el Observable
public class Corporation extends Observable{

    private String nombre;
    private Integer precio;
    public Corporation(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void modificaPrecio(Integer precio){
        this.precio = precio;
        this.notifyObservers();
    }
    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Actualizavion de accciones {" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
