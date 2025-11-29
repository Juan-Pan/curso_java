import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        //Declaracion de variables limites
        final int MINIMO = 0;
        final int MAXIMO = 5;
        // Solicitamos un valor entre 0 y 5
        try (Scanner consola = new Scanner(System.in))
        {
            System.out.print("Proporciona un valor entre 0 y 5: ");
            //verificar si el dato esta dentro del rango
            int numero = Integer.parseInt(consola.nextLine()); //consola.nextInt()
            boolean verificar = numero >= MINIMO && numero <= MAXIMO;

            System.out.println("El numero ingresado esta en el rango dicho: " + verificar);
        }

    }
    
}
