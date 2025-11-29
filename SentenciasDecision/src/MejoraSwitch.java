
import java.util.Scanner;

public class MejoraSwitch {
    public static void main(String[] args) {
        try (Scanner consola = new Scanner (System.in))
        {
        System.out.print("Proporciona el dia de la semana: ");
        int diaSemana = Integer.parseInt(consola.nextLine());
        switch(diaSemana)
        {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia erroneo, colocó: " + diaSemana);  
        }
        }
    }
    
}
