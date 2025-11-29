
import java.util.Scanner;

public class IdentificarEstacion {
    public static void main(String[] args) {
        try(Scanner consola = new Scanner (System.in))
        {
            System.out.print("Ingresa un valor numerico para ingresar la estacion del año: ");
            int estacion = Integer.parseInt(consola.nextLine());

            //Condicional 

            if(estacion == 1 || estacion ==2 || estacion == 12)
            {
                System.out.println("Invierno");
            }
            else if(estacion == 3 || estacion == 4 || estacion == 5)
            {
                System.out.println("Primavera");
            }
            else if (estacion == 6 || estacion == 7 || estacion == 8)
            {
                System.out.println("Verano");
            }
            else if(estacion == 9 || estacion == 10 || estacion == 11)
            {
                System.out.println("Otoño");
            }
            else
            {
                System.out.println("Estacion desconocida");
            }
        }

    }
    
}
