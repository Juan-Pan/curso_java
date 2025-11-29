

public class FuncionesRecursivas {
    //imprimir 5 al 1

    //funcion recursiva
    static void funcionRecursiva(int numero){
        //Caso base
        if(numero == 1)
        {
            System.out.println(numero);
        }
        else{
            //caso Recursivo
            System.out.print(numero+ " ");
            funcionRecursiva(numero - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 5;
        funcionRecursiva(numero);
        
    }
}
