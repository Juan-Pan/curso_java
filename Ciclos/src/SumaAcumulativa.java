public class SumaAcumulativa {
    public static void main(String[] args) {
        //Sumar los primeros 5 numeros 
        int suma = 0;
        for(int contador = 1; contador <= 5; contador++)
        {
            suma = contador + suma;
            System.out.println("Suma en cada iteracion: "+ suma);
        }
        System.out.println("Suma total: "+suma);
    }
    
}
