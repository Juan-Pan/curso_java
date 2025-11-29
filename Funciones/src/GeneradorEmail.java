
import java.util.Scanner;

public class GeneradorEmail {
    static String contructor(){
        Scanner consola = new Scanner (System.in);
        String cadena = consola.nextLine();
        return cadena.toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println("***Generador Email***");
        System.out.print("Ingresa tu nombre: ");
        String nombre = contructor();
        System.out.print("Ingresa tu apellido: ");
        String apellido = contructor();

        System.out.println("Felicidades! Tu email es: "+nombre+"."+apellido+"@globalmentoring.com.mx");

    }
    
}
