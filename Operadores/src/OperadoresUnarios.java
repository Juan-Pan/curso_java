public class OperadoresUnarios {
    public static void main(String[] args) {
        // Operadores unarios
        int a = 3, b = -2, resultado;
        boolean c= true;
        //Operador unario -
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = "+ resultado);

        //Operador Unario ++ (Incremento en uno)
        a = 3;
        resultado = ++a; // Pre-Incremento
        System.out.println("Pre-Incremento ++a= " + resultado);
        a = 3;

        resultado = a++; //Post-Incremento

        System.out.println("Post-Incremento a++ = "+resultado);
        System.out.println("a=" + a);
        System.out.println("Resultado=" +resultado);

        //Operador Unario -- (Decrementa en uno)
    
        resultado = --b; // Pre-decremento 
        System.out.println("Pre-decremento: "+resultado);
        b = -2; 
        resultado = b--; //Post-decremento
        System.out.println("Post-decremento: "+ resultado);
        System.out.println("b= "+ b);

        //Negacion ! (Invierte el valor logico)
        boolean resultado2 = !c;
        System.out.println("Negacion !c= "+ resultado2);



    }
}
