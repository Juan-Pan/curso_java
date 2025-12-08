package persona;



public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;


    // constructor

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }

    //toString
    @Override
    public String toString(){
        return "Id Persona: "+this.idPersona+ " Nombre: " + this.nombre + ", Apellido: "+ this.apellido + ", direccion de memoria: "+ super.toString();
    }

    // metodos
    public String getnombre() // lee informacion y la retorna
    {
        return this.nombre;
    }

    public void setNombre(String nombre) // modifica informacion
    {
        this.nombre = nombre;
    }

    public String getApellido() // lee informacion y la retorna
    {
        return this.apellido;
    }

    public void setApellido(String apellido) // modifica informacion
    {
        this.apellido = apellido;
    }

    // metodos adicionales
    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido);
    }
    public static int getContadorPersonas()
    {
        return Persona.contadorPersonas;
    }
}
