public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: "+ apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de objetos de la clase persona");
        // intanciar = crear nuevo objeto
        Persona objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        System.out.println("Persona 1");

        objeto1.mostrarPersona();
        System.out.println( );

        System.out.println("Persona 2");
        Persona objeto2 = new Persona();
        objeto2.nombre = "Daniela";
        objeto2.apellido = "Cardona";

        
        objeto2.mostrarPersona();
    }
}
