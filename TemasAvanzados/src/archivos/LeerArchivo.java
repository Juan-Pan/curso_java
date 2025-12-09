package archivos;

import java.io.*;

public class LeerArchivo {
    // leer el archivo

    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";

        File archivo = new File(nombreArchivo);
        
        try{
            System.out.println("Contenido del archivo: ");
            //abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //leemos linea a linea el archivo
            String linea = entrada.readLine();
            while(linea != null)
            {
                System.out.println(linea);;
                //antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            // Cerramos archivo
            entrada.close();
        }catch(Exception e)
        {
            System.out.println("Error al leer el archivo: "+ e);
        }
    }

}
