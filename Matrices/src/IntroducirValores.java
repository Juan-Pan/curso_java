
import java.util.Scanner;

public class IntroducirValores {

    public static void main(String[] args) {
        //Introducir valores a una matriz
        int filas, columnas, i = 1;
        try (Scanner consola = new Scanner(System.in)) {
            System.out.print("Propociona el numero de filas: ");
            filas = Integer.parseInt(consola.nextLine());
            System.out.print("Proporciona el numero de columnas: ");
            columnas = Integer.parseInt(consola.nextLine());
            int[][] matriz = new int[filas][columnas];
            //solicitar los valores
            for (int fila = 0; fila < filas; fila++) {
                for (int col = 0; col < columnas; col++) {
                    System.out.print("ingresa el valor " + i + "= ");
                    matriz[fila][col] = Integer.parseInt(consola.nextLine());
                    i++;

                }
            }
            i = 1;
            for (int[] rFilas : matriz) {
                for (int valores : rFilas) {
                    System.out.println("Valor " + i  +"= " + valores);
                    i++;
                }
            }
        }
    }

}
