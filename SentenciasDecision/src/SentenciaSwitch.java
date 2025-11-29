
import java.util.Scanner;

public class SentenciaSwitch {

    public static void main(String[] args) {

        try (Scanner consola = new Scanner(System.in)) {
            System.out.print("Ingresa un valor numerico para ingresar la estacion del año: ");
            int estacion = Integer.parseInt(consola.nextLine());

            //Condicional 
            switch (estacion) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Invierno");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Primavera");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Verano");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Otoño");
                    break;
                default:
                    System.out.println("Estacion desconocida");
            }

        }

    }

}
