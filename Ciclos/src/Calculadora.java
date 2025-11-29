// ...existing code...

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int num1, num2, opcion;
        try (Scanner consola = new Scanner(System.in)) {
            do {
                System.out.print("""
                ***Calculadora***
                Menu:
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                Escoge una opcion:\s""");
                opcion = Integer.parseInt(consola.nextLine());
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingresa un numero: ");
                        num1 = Integer.parseInt(consola.nextLine());
                        System.out.print("Ingresa otro numero: ");
                        num2 = Integer.parseInt(consola.nextLine());
                        double suma = num1 + num2;
                        System.out.println("La suma de los numeros es: " + suma);

                    }
                    case 2 -> {
                        System.out.print("Ingresa un numero: ");
                        num1 = Integer.parseInt(consola.nextLine());
                        System.out.print("Ingresa otro numero: ");
                        num2 = Integer.parseInt(consola.nextLine());
                        double resta = num1 - num2;
                        System.out.println("La resta de los numeros es: " + resta);
                    }
                    case 3 -> {
                        System.out.print("Ingresa un numero: ");
                        num1 = Integer.parseInt(consola.nextLine());
                        System.out.print("Ingresa otro numero: ");
                        num2 = Integer.parseInt(consola.nextLine());
                        double multi = num1 * num2;
                        System.out.println("La multiplicacion de los numeros es: " + multi);
                    }
                    case 4 -> {
                        System.out.print("Ingresa un numero: ");
                        num1 = Integer.parseInt(consola.nextLine());
                        System.out.print("Ingresa otro numero: ");
                        num2 = Integer.parseInt(consola.nextLine());
                        if (num2 != 0) {
                            double division = num1 / num2;
                            System.out.println("La division de los numeros es: " + division);
                        }
                        else {
                            System.out.println("El segundo numero no puede ser cero, da error");
                        }

                    }
                    case 5 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Error, debe ingresar un numero entre 1 y 5. Intente de nuevo...");
                }
            } while (opcion != 5);
        }

    }
}
