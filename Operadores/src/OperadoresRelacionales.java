public class OperadoresRelacionales {
    public static void main(String[] args) {
        //Operadores relacionales (Comparacion)
        int a = 3, b = 2;

        //Igualdad == 

        var resultado = a == b;

        System.out.println("Resultado a == b : " + resultado);

        //Distinto
        resultado = a != b;
        System.out.println("Resultado a != b: " +resultado);

        //mayor que

        resultado = a>b;
        System.out.println("Resultado a>b: "+resultado);

        //mayor o igual que
        System.out.println("Resultado a>=b: " + resultado);

        //menor que
        resultado = a<b;
        System.out.println("Resultado a<b: "+resultado);

        //menor o igual que
        resultado = a<=b;
        System.out.println("Resultado a<=b: "+resultado);

    }
}
