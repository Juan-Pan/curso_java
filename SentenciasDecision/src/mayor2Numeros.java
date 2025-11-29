import java.util.Scanner;
public class mayor2Numeros {
    public static void main(String[] args) {
        //Saber el mayor de dos numero dados por el usuario 

        try(Scanner consola = new Scanner(System.in))
        {
            System.out.print("Ingrese el primer numero: ");
            int num1 = Integer.parseInt(consola.nextLine());
            System.out.print("Ingrese el segundo numero: ");
            int num2 = Integer.parseInt(consola.nextLine());
            // if(num1 > num2)
            // {
            //     System.out.println("El numero mayor es: "+ num1 );
            // }
            // else if (num2 > num1) {
            //     System.out.println("El numero mayor es el: "+num2);
            // }
            // else
            // {
            //     System.out.println("Los numero son iguales");
            // }
            
            //Operador ternario
            System.out.println(num1>num2 ? num1:num2);
        }
    }
    
}
