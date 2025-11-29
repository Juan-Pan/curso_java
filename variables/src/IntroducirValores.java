import java.util.Scanner; // Importa la clase Scanner para leer datos desde la consola

public class IntroducirValores {
    public static void main(String[] args) {
        // Para leer datos desde la consola, se utiliza Scanner.
        // El uso de try con Scanner es recomendable porque Scanner implementa la interfaz AutoCloseable,
        // lo que permite cerrar automáticamente el recurso al finalizar el bloque try.
        // Esto ayuda a evitar fugas de recursos (por ejemplo, dejar abierto el flujo de entrada).
        try (var consola = new Scanner(System.in)) { // Crea un objeto Scanner para leer desde la entrada estándar (teclado)
            System.out.println("Escribe tu nombre: "); // Solicita al usuario que escriba su nombre
            String nombre = consola.nextLine(); // Lee la línea completa que el usuario escribe y la guarda en la variable 'nombre'
            System.out.println("Nombre: "+ nombre); // Muestra el nombre ingresado por el usuario
        }
        // Al salir del bloque try, el objeto Scanner se cierra automáticamente.
    }
    
}
