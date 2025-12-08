
import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Lara");  
        System.out.println(persona);

        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Apellido: "+ persona.getApellido());
    }
}
class Persona implements Serializable{ //El seriarizable es para enviarlo por la red
    private String nombre;
    private String apellido;
    public Persona(){}

    //geters y setters
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return this.apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    //metodo toString
    @Override
    public String toString()
    {
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido;
    }

}