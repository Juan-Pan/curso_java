

// Importa la clase DecimalFormat para formatear números decimales
import java.text.DecimalFormat;

/**
 * Clase de ejemplo para mostrar cómo redondear y formatear números decimales en Java.
 * 
 * Demuestra el uso de Math.round para redondear y DecimalFormat para mostrar un número con un patrón específico.
 */
public class Redondeo {

   
    public static void main(String[] args) {
        // Ejemplo de redondeo: si la parte decimal es mayor o igual a 0.5, redondea hacia arriba
        double numero = 8.5;
        double redondeo = Math.round(numero); // Redondea el número al entero más cercano
        System.out.println("Valor " + numero + " redondeado: " + redondeo);

        // Ejemplo de formato: muestra el número con un solo decimal usando un patrón
        var patron = "#"; // Patrón para mostrar solo un decimal
        var decimalFormat = new DecimalFormat(patron); // Crea el formateador con el patrón
        var numeroFormato = decimalFormat.format(numero); // Aplica el formato al número
        System.out.println("Valor " + numero + " con formato: " + numeroFormato);
    }
}
