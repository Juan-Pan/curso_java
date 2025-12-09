package maquina_snacks_archivos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import maquina_snacks_archivos.dominio.Snack;

public class SevicioSnacksArchivos implements IServicioSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //Crear la lista de snacks
    private List <Snack> listaSnacks = new ArrayList<>();
    //constructor de la clase
    public SevicioSnacksArchivos(){
        //Creamos el archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        Boolean existe = false;
        
        try{
            existe = archivo.exists();
            if(existe)
            {
                this.listaSnacks = obtenerSnacks();
            }
            else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // guarda el contenido del archivo en disco 
                System.out.println("Se ha creado el archivo");
            }

        }catch(Exception e)
        {
            System.out.println("Error al crear el archivo: " + e.getMessage());

        }
        //Si no existe, cargamos algunos snacks iniciales
        if(!existe)
        {
            cargarSnacksIniciales();
        }

    }
    private void cargarSnacksIniciales()
    {
       this.agregarSnack(new Snack("Papas", 80.2));
       this.agregarSnack(new Snack("Refresco", 2.20));
       this.agregarSnack(new Snack("Fideos", 10.12));
    }
    
    @Override
    public void agregarSnack(Snack snack) {
      
        //Agregamos el nuevo snack, 1. A la lista en memoria
        this.listaSnacks.add(snack);

        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List <String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String[] lineaSnack = linea.split(","); //parseo separado por una coma
                int idSnack = Integer.parseInt(lineaSnack[0]); //no se usa
                String nombre = lineaSnack[1];
                double precio = Double.parseDouble(lineaSnack[2]);
                Snack snack = new Snack(nombre, precio);
                snacks.add(snack); //Agregamos el snack leido a la lista
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo de snacks: "+ e.getMessage());
        }
        return snacks;
    }

    private void agregarSnackArchivo(Snack snack)
    {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);

        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close(); // se escribe la info al archivo

        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
      System.out.println("--- Snacks en el inventario ---");
      //Mostramos la lista de snacks en el archivo
      String inventarioSnack = "";
      for(var snack: this.listaSnacks)
      {
        inventarioSnack += snack.toString() + "\n";
      }
      System.out.println(inventarioSnack);
      
    }

    @Override
    public List<Snack> getSnacks() {
        
      return this.listaSnacks;
    }


    
}
