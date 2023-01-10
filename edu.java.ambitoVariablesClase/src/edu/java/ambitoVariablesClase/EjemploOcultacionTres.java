package edu.java.ambitoVariablesClase;

public class EjemploOcultacionTres {

   public int z=2; 
 
	public void metodo(){
         double z;   
         z = 6.2;
          System.out.println("Ocultación Tres metodo con this: " + this.z);
    }
}