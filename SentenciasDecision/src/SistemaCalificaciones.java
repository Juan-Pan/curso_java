import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        try (Scanner consola = new Scanner (System.in))
        {
            System.out.print("Ingresa una calificacion numerica (Entre 0 y 10): ");
            int calificacion = Integer.parseInt(consola.nextLine());

            if(calificacion >= 9 && calificacion <= 10)
            {
                System.out.println("Calificacion: A");
            }
            else if(calificacion >= 8 && calificacion < 9)
            {
                System.out.println("Calificacion: B");
            }
            else if(calificacion >= 7 && calificacion < 8)
            {
                System.out.println("Calificacion: C");
            }
            else if (calificacion >= 6 && calificacion < 7)
            {
                System.out.println("Calificacion: D");
            }
            else if (calificacion>= 0  && calificacion < 6)
            {
                System.out.println("Calificacion: F");
            }
            else
            {
                System.out.println("Valor desconocido");
            }
        }
    }
    
}
