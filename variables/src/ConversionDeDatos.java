
import java.util.Scanner;

public class ConversionDeDatos {
    public static void main(String[] args) {
        //conversion de tipo de datos
        try(Scanner consola = new Scanner(System.in)){
            System.out.print("Ingrese un numero: ");
            var numero1 = consola.nextLine();
            System.out.print("Ingrese otro numero: ");
            var numero2 = consola.nextLine();

            var resultado = Integer.parseInt(numero1)+Integer.parseInt(numero2);
            System.out.println("Resultado: " + resultado);
            var concatenacion = numero1 + numero2;
            System.out.println("Concatenacion: "+ concatenacion);
        }
    }
    
}
