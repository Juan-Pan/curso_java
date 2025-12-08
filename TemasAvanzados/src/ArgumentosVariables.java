public class ArgumentosVariables {
    public static void main(String[] args) throws Exception {
        
       VariosParametros("Juan", 1,2,3,4,5);
    }
    static void VariosParametros(String nombre, int...numeros)
    {
        System.out.println("Nombre: " +nombre);
        imprimirNumeros(numeros);
    }
    static void imprimirNumeros(int...numero1)
    {
        for (int i = 0; i < numero1.length; i++)
        {
            System.out.println(numero1[i]);
        }

    }
}
