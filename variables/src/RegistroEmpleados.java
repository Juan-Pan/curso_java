
import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        System.out.println("** Registro Empleados **");
        try(Scanner consola = new Scanner(System.in)){
            System.out.print("Proporciona tu nombre: ");
            var nombre = consola.nextLine();
            System.out.print("Proporciona tu edad: ");
            var edad = Integer.parseInt(consola.nextLine());
            System.out.print("Proporciona tu sueldo (USD): ");
            var sueldo = Float.parseFloat(consola.nextLine());
            System.out.print("Eres un empleado de confianza? (true/false): ");
            var confianza = Boolean.parseBoolean(consola.nextLine());

            //salida en pantalla

            System.out.println("La informacion proporcionada es: ");
            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Sueldo: "+ sueldo);
            System.out.println("Empleado de confianza: "+ confianza);

        }
    }
}
