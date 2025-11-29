public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Logicos
        boolean a = true, b = false;
        //and (Regresar true si ambos valores son true)
        var resultado = a && b;
        System.out.println("Resultado: a && b = "+ resultado);

        //Or (regresa true si cualquier valor es true)
        resultado = a || b;
        System.out.println("Resultado: a || b = "+ resultado);

        // ! (not) ( Invierte el valor logico)
        resultado  = !a;
        System.out.println("Resultado: !a = " + resultado);
    }
    
}
