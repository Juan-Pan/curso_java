package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;
    int resultado;

    //Constructor (cuando son mas de dos contructores se dice que es una sobrecarga de constructores)
    // this (variable que representa el atributo de la clase para tener los mismos parametros de la funcion ya que apunta a la misma direccion de memoria del objeto)
    public Aritmetica()
    {

    }
    public Aritmetica(int  operando1, int operando2)
    {
        this.operando1 = operando1;
        this.operando2 = operando2;
       // System.out.println("Operador this: " + this);
    }
    //encapsulamiento 
    //para operacion1
    public int getOperando1() //leer informacion
    {
        return this.operando1;
    }

    public void setOperando1(int operando1) // Modificar informacion
    {
        this.operando1 = operando1;
    }
    //para operacion2
     public int getOperando2() //leer informacion
    {
        return this.operando1;
    }

    public void setOperando2(int operando2) // Modificar informacion
    {
        this.operando2 = operando2;
    }

    //Creacion de metodos

   public int suma()
   {
   
    resultado = operando1 + operando2;
    return resultado;
   }
   public int resta()
   {
    resultado = operando1 - operando2;
    return resultado;
   }

   public int multi()
   {
    resultado = operando1 * operando2;
    return resultado;
   }
   public int division()
   {
    resultado = operando1/operando2;
    return resultado; 
   }
  
    
}
