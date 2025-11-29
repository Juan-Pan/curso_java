import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        final var MAYOR_EDAD = 18;
        try (Scanner consola = new Scanner (System.in))
        {
            System.out.print("Ingrese su nombre: ");
            String nombre = consola.nextLine();
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(consola.nextLine());

            if(edad >= MAYOR_EDAD)
            {
                System.out.println(nombre + " es mayor de edad tiene: " + edad +" años");
            }
            else
            {
                System.out.println(nombre + " es menor de edad tiene: " + edad +" años");
            }
        }
    }
    
}
