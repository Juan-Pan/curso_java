import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


/**
 * Clase que genera un ID único a partir de nombre, apellido, año y un número aleatorio de 4 dígitos.
 * Demuestra el uso de Scanner para entrada de datos, Random para generar números aleatorios y manejo de cadenas.
 */
public class GeneradorID {

    /**
     * Solicita una cadena por consola y la retorna en mayúsculas.
     * @return Cadena ingresada en mayúsculas
     */
    static String generarID() {
        Scanner consola = new Scanner(System.in);
        String cadena = consola.nextLine();
        return cadena.toUpperCase();
    }
    

    /**
     * Método principal que solicita datos al usuario, genera subcadenas y un número aleatorio,
     * y muestra un ID único formado por estos elementos.
     */
    public static void main(String[] args) {
        // Solicitar y procesar el nombre
        System.out.print("Escribe tu nombre: ");
        String nombre = generarID();

        // Solicitar y procesar el apellido
        System.out.print("Escribe tu apellido: ");
        String apellido = generarID();

        // Tomar subcadenas de los primeros dos caracteres
        String idnombre = nombre.substring(0,2);
        String idapellido = apellido.substring(0,2);

        // Solicitar y procesar el año de nacimiento
        System.out.print("Escribe tu año de nacimiento: ");
        String año = generarID();
        // Tomar subcadena de los caracteres 2 y 3 del año
        String idAño = año.substring(2,4);

        // Generar número aleatorio de 4 dígitos
        Random cuatroDigitos = new Random();
        int valorAleatorio = cuatroDigitos.nextInt(10000); // 0 a 9999

        // Formatear el número aleatorio a 4 dígitos con ceros a la izquierda
        var decimalFormat = new DecimalFormat("####");
        var numeroFormato = decimalFormat.format(valorAleatorio);

        // Mostrar el ID único generado
        System.out.println("ID Unico -> " + idnombre + idapellido + idAño + numeroFormato);
    }
    }
