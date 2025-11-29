
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //Funcion Numeros Aleatorios

        Random aleatorio = new Random();
        //Generar los valores entre 0 y 100 (no se incluye el valor limite)

        int valorAleatorio = aleatorio.nextInt(100+1);
        System.out.println("Valor aleatorio (0 y 100): "+ valorAleatorio);
        // Numero aleatorio entre 100 y 200

        int min = 100, max = 200;
        int valorAleatorio2 = aleatorio.nextInt(min, (max +1));
        System.out.println("Valor aleatorio entre 100 y 200: "+ valorAleatorio2);
    }
    
}
