

public class LargoCadena {
    public static void main(String[] args) {
        //Obtener el largo de una cadena
        String hola = "Hola mundo";
        int largo = hola.length();
        System.out.println("El largo de la cadena "+hola+" es: "+largo);

        //recorrer la cadena
        for (int i = 0; i < hola.length(); i++)
        {
            System.out.println(i+" "+hola.charAt(i));
        }
    }
    
}
