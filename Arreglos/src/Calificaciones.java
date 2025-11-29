
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.print("""
                ***Promedio de calificaciones**
                Cuantas calificaciones desea agregar?: """);
        try(Scanner consola = new Scanner (System.in)){
            
            int largo = Integer.parseInt(consola.nextLine());
            double calificaciones[]= new double[largo];
            for(int i = 0; i < largo; i++)
            {
                System.out.print("Calificacion "+(i+1)+": ");
                calificaciones[i] = Double.parseDouble(consola.nextLine());
            }
            //sacamos del arreglo
            double suma = 0;
            for(int i = 0; i< largo; i++)
            {
                suma = calificaciones[i] + suma;
            }
            double promedio;
            promedio = suma / largo;
            System.out.println("Promedio de las calificaciones: "+promedio);

        }
    }
    
}
