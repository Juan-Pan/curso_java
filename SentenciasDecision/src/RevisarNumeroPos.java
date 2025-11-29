
import java.util.Scanner;

public class RevisarNumeroPos {
    public static void main(String[] args) {
        // REvisar si un numero es positivo o negativo
        try(Scanner consola = new Scanner (System.in))
        {
            System.out.print("Ingresa un numero: ");
            int num = Integer.parseInt(consola.nextLine());
            if(num > 0)
            {
                System.out.println("El numero: " + num + " es positivo" );
            }
            else if(num < 0)
            {
                System.out.println( "El numero: " + num + " es negativo");
            }
            else if(num == 0)
            {
                System.out.println("El numero es cero");
            }
            else
            {
                System.out.println("Error, no es un numero");
            }
        } 
    }
    
}
