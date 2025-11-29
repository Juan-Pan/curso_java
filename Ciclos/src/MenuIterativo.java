import java.util.Scanner;

public class MenuIterativo {

    public static void main(String[] args) {
        try (Scanner consola = new Scanner(System.in)) {
            int opcion; // Declarar fuera del ciclo
            do {
                System.out.println("*** Sistema de Administracion de Cuentas ***");
                System.out.println("Menu:");
                System.out.print("1. Crear cuenta\n2. Eliminar cuenta \n3. Salir del sistema\n");
                System.out.print("Escoge una opcion: ");

                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1 -> System.out.println("Creando cuenta...");
                    case 2 -> System.out.println("Eliminando cuenta...");
                    case 3 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Error, solo puede ingresar numeros del 1 al 3");
                }

            } while (opcion != 3);
        }
    }

}
