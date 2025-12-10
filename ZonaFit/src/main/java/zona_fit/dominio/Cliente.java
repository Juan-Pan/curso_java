package zona_fit.dominio;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int membresia;
    //constructor

    public Cliente()
    {

    }
    public Cliente(int id)
    {
        this.id = id;
    }
    public Cliente(String nombre, String apellido, int membresia)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.membresia  = membresia;
    }
    public Cliente(int id, String nombre, String apellido, int membresia)
    {
        this(nombre, apellido, membresia);
        this.id = id;
    }

    //getters y setters

    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
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
    public int getMembresia()
    {
        return this.membresia;
    }
    public void setMembresia(int membresia)
    {
        this.membresia = membresia;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellido);
        hash = 59 * hash + this.membresia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.membresia != other.membresia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", membresia=").append(membresia);
        sb.append('}');
        return sb.toString();
    }


}
