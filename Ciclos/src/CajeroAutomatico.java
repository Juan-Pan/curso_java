
import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        try (Scanner consola = new Scanner(System.in)) {
            int opcion;
            double dinero = 1000.0;
            do {
             
                System.out.print(
                        "***Cajero automatico***\nmenu:\n1. Consultar saldo\n2. Retirar\n3. Deposita\n4. Salir\nEscoge una opcion: "
                );
                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1 ->
                        System.out.println("Saldo disponible: " + dinero+ "\n");
                    case 2 -> {
                        System.out.print("Cuanto dinero desea retirar: ");
                        double retirar = Double.parseDouble(consola.nextLine());
                        if (retirar > dinero) {
                            System.out.println("No tiene suficiente saldo para retirar... Saldo disponible: " + dinero+"\n");
                        } else {
                            dinero = dinero - retirar;
                            System.out.println("Su nuevo saldo es: " + dinero+"\n");
                        }
                    }
                    case 3 -> {
                        System.out.print("Cuando dinero desea depositar ");
                        double depositar = Double.parseDouble(consola.nextLine());
                        dinero = dinero + depositar;
                        System.out.println("Su nuevo saldo es: "+dinero+"\n");
                    }
                    case 4-> {
                        System.out.println("Saliendo del sistema...");
                    }
                    default -> System.out.println("Error, debe ingresar un numero del 1 al 4. Intente nuevamente...\n");

                }

            } while (opcion != 4);
        }
    }
}
