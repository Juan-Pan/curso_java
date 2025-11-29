public class Subcadenas {
    public static void main(String[] args) {
        //Subcadenas
        String cadena = "Hola mundo";
        //Subcadenas Hola y mundo

        //substring(indice_inicio, indice_fin)
        String subcadena1= cadena.substring(0,4);
        System.out.println("Subcadena1: "+subcadena1);

        //subcadena mundo
        String subcadena2 = cadena.substring(5,10);
        System.out.println("Subcadena2: "+subcadena2);
    }
    
}
