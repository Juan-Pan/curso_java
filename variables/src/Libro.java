
import java.util.Scanner;

public class Libro {
    public static void main(String[] args) {
        System.out.println("Ingresar informacion de un libro");
        try(Scanner consola = new Scanner(System.in);)
        {
             System.out.print("Ingresa el titulo del libro: ");
             String titulo = consola.nextLine();
             System.out.print("Ingresa el nombre del autor: ");
             String autor = consola.nextLine();
             //String resultado = titulo " Fue escrito por " + autor;

             System.out.println( titulo + " fue escrito por " + autor);
        }
        
    }
}
