import java.util.Scanner;

public class NumeroPar {
    //funcon para saber si es un numero par
    static boolean esPar(int numero){
        if(numero %2 ==0){
            boolean esPar = true;
            return esPar;
        }
        else
        {
            return false;
        }
        
    }

    public static void main(String[] args) {

        try(Scanner consola = new Scanner(System.in))
        {
            System.out.print("Introduce un número:");
            int numero = Integer.parseInt(consola.nextLine());
           if(esPar(numero)){
            System.out.println("El número " + numero + " es par");
           }
           else{
            System.out.println("El número " + numero + " no es par");   
           }
            
        }
        
    }
    
}
