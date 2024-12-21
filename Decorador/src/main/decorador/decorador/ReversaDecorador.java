package main.decorador.decorador;

import main.decorador.Formateable;

public class ReversaDecorador extends TextoDecorador{
    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuffer sb = new StringBuffer(texto.darFormato());
        return sb.reverse().toString();
    }
}
