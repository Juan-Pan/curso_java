
import java.util.Scanner;

public class Presentacion {
    public static void main(String[] args) {
        try(Scanner consola = new Scanner (System.in))
        {
            System.out.print("Ingresa tu nombre: ");
            var nombre = consola.nextLine();
            System.out.print("Ingresa tu edad: ");
            var edad = consola.nextLine();
            var edadInt = Integer.parseInt(edad);
            System.out.print("Eres hijo unico? (escribe True o False): ");
            var hijo = Boolean.parseBoolean(consola.nextLine());
            System.out.print("Escribe tu bebida favorita: ");
            var bedida =consola.nextLine();
            System.out.print("Precio bebida favorita: ");
            var precio = consola.nextLine();
            var precioFloat = Float.parseFloat(precio);

            //Salida en pantalla

            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+ edadInt);
            System.out.println("Hijo unico: "+ hijo);
            System.out.println("Bebidad favorita: "+ bedida);
            System.out.println("Precio de la bebida: "+ precioFloat);
            


        }
    }
}
