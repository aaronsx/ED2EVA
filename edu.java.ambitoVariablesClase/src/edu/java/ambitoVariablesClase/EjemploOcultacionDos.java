package edu.java.ambitoVariablesClase;

public class EjemploOcultacionDos {

    static int z = 2; 
    static void metodo(){
         double z;  
         z = 6.2;
         pintar();

    }
    static void pintar() {
        System.out.println("Ocultación Dos pintar: " + z);
    }

}
