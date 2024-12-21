package main.decorador.decorador;

import main.decorador.Formateable;

//Decorador Padre
public abstract class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
