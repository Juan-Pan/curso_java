
import java.util.Scanner;

public class CompararCadenas {

    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        //Comparacion de cadenas en Java
        String cadena1 = "Juan";
      

        try (Scanner consola = new Scanner(System.in)) {
            System.out.print("Ingresa una cadena: ");
            String cadena3 = consola.nextLine();

            if (cadena1 == cadena3) {
                System.out.println("Las cadenas son iguales (En referencia de memoria...)");
            } else {
                System.out.println("Las cadenas no son iguales(en referencia de memoria)");
            }
            //Comparacion usando el metodo equals
            if(cadena1.equals(cadena3))
            {
                System.out.println("Las cadenas son iguales (en contenido)");
            }
            else{
                System.out.println("Las cadenas son iguales (en contenido)");
            }
        }

    }

}
