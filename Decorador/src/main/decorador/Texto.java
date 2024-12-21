package main.decorador;
public class Texto implements Formateable {

    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String darFormato() {
        return this.getTexto();
    }

    public String getTexto() {
        return texto;
    }
}
