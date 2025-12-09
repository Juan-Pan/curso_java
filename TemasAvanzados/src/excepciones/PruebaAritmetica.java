package excepciones;
public class PruebaAritmetica{
    public static void main(String[] args) {
        try {
            int resultado = Aritmetica.division(10, 0);
            System.out.println("Resultado: "+ resultado);
        } catch (Exception e) {
            System.out.println("Hubo un error: " + e);
        }
    }
}