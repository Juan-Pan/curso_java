package persona;

public class Persona {
    private String nombre;
    private String apellido;

    // constructor

    public Persona(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //metodos
    public String getnombre() // lee informacion y la retorna
    {
        return this.nombre;
    }

    public void setNombre(String nombre) //modifica informacion
    {
        this.nombre = nombre;
    }
    public String getApellido() // lee informacion y la retorna
    {
        return this.apellido;
    }
    public void setApellido(String apellido) //modifica informacion
    {
        this.apellido = apellido;
    }
}

