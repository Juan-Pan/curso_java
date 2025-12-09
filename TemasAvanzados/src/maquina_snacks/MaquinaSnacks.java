package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {

    public static void main(String[] args) {
        maquinaSnacks();

    }

    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner console = new Scanner(System.in);

        // Creamos la lista de productos tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); // mostrar inventario

        while (!salir) {
            try {
                int opcion = mostrarMenu(console);
                salir = ejecutarOpciones(opcion, console, productos);

            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println(); // imprime un salto de linea con cada iteracion
            }

        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar Snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elije una opcion:\s""");

        // Leemos y retornamos
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos) {
        boolean salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> salir = true;
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.print("Que snack quieres comprar(id)?: ");
        int idSnack = Integer.parseInt(consola.nextLine());
        boolean snackEncontrado = false;
        for (Snack snack : Snacks.getSnakcs()) {
            if (idSnack == snack.getIdSnack()) {
                // agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }

        }
        if (snackEncontrado == false) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos) {
        String ticket = "***Ticket de Venta***";
        double total = 0.0f;
        for (Snack snack : productos) {
            ticket = ticket + "\n\t- " + snack.getNombre() + " - $" + snack.getPrecio();
            total = snack.getPrecio() + total;
        }
        ticket += "\n\tTotal -> " + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola) {
        System.out.print("Nombre del Snack: ");
        String nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        double precio = Double.parseDouble(consola.nextLine());
        Snacks.agragarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnacks();
    }
}
