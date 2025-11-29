public class Matrices {
    public static void main(String[] args) throws Exception {
       // Definir constantes
       final int RENGLONES = 2;
       final int COLUMNAS =3;

       //Definamos la matriz
       int[][] matriz = new int [RENGLONES][COLUMNAS];
       
       //lenar la matriz
       matriz[0][0] = 100;
       matriz[0][1] = 200;
       matriz[0][2] = 300;
       matriz[1][0] = 400;
       matriz[1][1] = 500;
       matriz[1][2] = 600;

       //Accedemos a los valores 
       System.out.println("Valor 1 [0][0]= "+matriz[0][0]);
       System.out.println("Valor 5 [1][1]= "+matriz[1][1]);
       System.out.println("Valor 6 [1][2]= "+matriz[1][2]);

       //Recorrer los renglones
       for(int ren = 0; ren < RENGLONES; ren++)
       {
        // Recorrer las columnas
        for(int col = 0; col < COLUMNAS; col++)
        {
            System.out.println("Matriz["+ren+"]"+"["+col+"]= " + matriz[ren][col]);
        }
       }
    }
}
