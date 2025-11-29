
public class MatricesSimplificada {

    public static void main(String[] args) {
        //definimos la matriz
        int[][] matriz = {{100, 200, 300}, {400, 500, 600}};
        //recorrer los renglones
        int i = 1;
        for (int[] fila : matriz) {
            //recorrer las columnas
            for (int valor : fila) {
                System.out.println("Valor " + i + "= " + valor);
                i++;
            }
        }
    }

}
