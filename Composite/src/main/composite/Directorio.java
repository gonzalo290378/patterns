package main.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

    private List<Componente> hijos;
    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente componente){
        this.hijos.add(componente);
        return this;
    }

    public void remove(Componente componente){
        this.hijos.remove(componente);
    }
    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre)
                .append("/")
                .append("\n");
        for (Componente hijo: this.hijos) {
            sb
                .append(" - ")
                .append(hijo.mostrar()).append("\n");

        }
        return sb.toString();

    }
}
