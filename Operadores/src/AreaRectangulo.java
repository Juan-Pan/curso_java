
import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        //Calculo area de un rectangulo
        int base, altura;
        try (Scanner consola = new Scanner(System.in))
        {
            System.out.print("Ingrese la base del rectangulo: ");
            base = Integer.parseInt(consola.nextLine());
            System.out.print("Ingrese la altura del rectangulo: ");
            altura = Integer.parseInt(consola.nextLine());
        }
        //operacion

        int area = base * altura;

        System.out.println("El area del rectangulo es: " + area);

        //Caluclo perimetro
        int  perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
    
}
