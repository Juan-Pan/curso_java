package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        try {
            //Revisar si el archivo exixte
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            //Guardamos la informacion en el archivo
            salida.close();
            System.out.println("Se agregó contenido al archivo...");
        } catch (Exception e) {

            System.out.println("Error al escribir al archivo: "+ e.getMessage());
        }
    }
}
