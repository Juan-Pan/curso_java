public class Aritmetica {
    int operando1;
    int operando2;
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
        System.out.println("Operador this: " + this);
    }

    //Creacion de metodos

   int suma()
   {
   
    resultado = operando1 + operando2;
    return resultado;
   }
   int resta()
   {
    resultado = operando1 - operando2;
    return resultado;
   }

   int multi()
   {
    resultado = operando1 * operando2;
    return resultado;
   }
   int division()
   {
    resultado = operando1/operando2;
    return resultado; 
   }
   public static void main(String[] args) {
    //Instanciamos los objetos 
    Aritmetica operacion1 = new Aritmetica(5, 7);
 
    Aritmetica operacion2 = new Aritmetica(4,4 );


   

    //llamamos a lo metodos

    int resultadoObtenido = operacion1.suma();
    System.out.println(resultadoObtenido);

    System.out.println(operacion1.resta());

    System.out.println(operacion1.multi());

    System.out.println(operacion1.division());

    //comprobamos la direccion de memoria

    System.out.println("Direccion de memoria: "+ operacion1);

    // metodos de segundo obejeto
    System.out.println(); 
    resultadoObtenido = operacion2.suma();
    System.out.println(resultadoObtenido);

    System.out.println(operacion2.resta());

    System.out.println(operacion2.multi());

    System.out.println(operacion2.division());

    Aritmetica operacion3 = new Aritmetica();

    System.out.println(operacion3.suma());


   }
    
}

