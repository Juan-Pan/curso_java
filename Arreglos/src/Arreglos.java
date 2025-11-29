public class Arreglos {
    public static void main(String[] args) throws Exception {
      //declarar un arreglo
      int[] enteros;
      //inicializamos
      enteros = new int [5];
      //declarlo e inicializarlo
      int[] numeros = new int [3];

      //modificacion de valores

      enteros [0] = 13;
      enteros [1] = 21;
      enteros [4] = 62;
      numeros [2] = 3;

      //leemos algunos valores
      System.out.println("Valor 3" + numeros[2]);
      System.out.println("Valor 1" + enteros[0]);

      //sintaxis simplificadda de arreglos
      int[] arreglo = {100,200,300,400,500};

      //accedemos a los elementos  
      System.out.println("Valor 1= " + arreglo[0]);
      System.out.println("Valor 2= " + arreglo[1]);
      System.out.println("Valor 3= " + arreglo[2]);
      System.out.println("Valor 4= " + arreglo[3]);
      System.out.println("Valor 5= " + arreglo[4]);

    }
}
