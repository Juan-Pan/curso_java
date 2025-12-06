package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica
{
    public static void main(String[] args) {
    System.out.println("** Ejemplo de operacopm aritmetica");
    //Instanciamos los objetos 
    Aritmetica operacion1 = new Aritmetica(5, 7);
 
    System.out.println("Con el get operacion 1: " + operacion1.getOperando1());

    operacion1.setOperando1(1);

    System.out.println("Modificacion utilizando el set: "+operacion1.getOperando1());

    System.out.println("Resultado operación suma: " + operacion1.suma());
   


   }

}