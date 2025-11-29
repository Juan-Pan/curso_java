
import java.util.Scanner;

public class SumaDiagonal {

    public static void main(String[] args) {
        try (Scanner consola = new Scanner(System.in)) {
            //Definir constantes
            final int FILAS = 3;
            final int COLUMNAS = 3;
            int suma = 0;
            //Definamos la matriz
            int[][] matriz = new int[FILAS][COLUMNAS];
            //llenamos la matriz
            for (int fila = 0; fila < FILAS; fila++) {
                for (int col = 0; col < COLUMNAS; col++) {
                    System.out.print("Ingresa el valor[" + fila + "][" + col + "]= ");
                    matriz[fila][col] = Integer.parseInt(consola.nextLine());
                }
            }
            //Sumar los valores de la diagonal
            for (int fila = 0; fila < FILAS; fila++) {
                for (int col = 0; col < COLUMNAS; col++) {
                    if (fila == col) {
                        suma = suma + matriz[fila][col];
                        System.out.println("Valor[" + fila + "][" + col + "]= " + matriz[fila][col]);
                        System.out.println("Suma=" + suma);
                    }
                }
            }

        }
    }

}
