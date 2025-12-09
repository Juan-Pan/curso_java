package excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws Exception
    {
        if( denominador == 0)
        {
            throw new RuntimeException ("Division por cero");
        }
        return numerador / denominador;
    }
}
