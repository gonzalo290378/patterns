package main.composite.ejemplo;

import main.composite.Archivo;
import main.composite.Directorio;

public class EjemploComposite {

    public static void main(String[] args) {
        Archivo file1 = new Archivo("file1.txt");
        Archivo file2 = new Archivo("file2.txt");

        Directorio myFolder1 = new Directorio("myFolder1");
        myFolder1.addComponente(file1);
        myFolder1.addComponente(file2);

        Archivo file3 = new Archivo("file3.txt");
        Archivo file4 = new Archivo("file3.txt");

        Directorio myFolder2 = new Directorio("myFolder2");
        myFolder2.addComponente(file3);
        myFolder2.addComponente(file4);

        System.out.println(myFolder1.mostrar());
        System.out.println(myFolder2.mostrar());
    }
}
