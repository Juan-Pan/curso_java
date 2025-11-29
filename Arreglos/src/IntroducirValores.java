
import java.util.Scanner;

public class IntroducirValores {
    public static void main(String[] args) {
        //introducir valores
        try(Scanner consola = new Scanner(System.in)){
            System.out.print("Proporciona el largo del arreglo: ");
            int largo = Integer.parseInt(consola.nextLine());
            //Creamos de manera dinamica el arreglo
            int[] enteros = new int[largo];
            //Solicitamos los valores del arreglo
            for(int i = 0; i < largo; i++)
            {
                
                System.out.print("Propociona el entero (pos" +(i+1)+ ")"+ " = " );
                enteros[i] = Integer.parseInt(consola.nextLine());
          
            }
            //mostrar numeros
            for(int i = 0; i < enteros.length; i++)
            {
               
                System.out.println("Valor "+(i+1)+" ingresado: "+enteros[i]);
                
            }
        }
    }
    
}
