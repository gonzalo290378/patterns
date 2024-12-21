package main.decorador;

import main.decorador.decorador.MayusculaDecorador;
import main.decorador.decorador.ReversaDecorador;
import main.decorador.decorador.SubrayadoDecorador;

public class EjemploDecorador {

    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andres");
        MayusculaDecorador mayusculaDecorador = new MayusculaDecorador(texto);
        System.out.println(mayusculaDecorador.darFormato());
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculaDecorador);
        System.out.println(reversaDecorador.darFormato());
        SubrayadoDecorador subrayadoDecorador = new SubrayadoDecorador(reversaDecorador);
        System.out.println(subrayadoDecorador.darFormato());
    }
}
