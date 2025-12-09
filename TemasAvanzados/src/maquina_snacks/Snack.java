package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnacks=0;
    private String nombre;
    private double precio;
     private int idSnack;

    public Snack()
    {
        Snack.contadorSnacks ++;
        this.idSnack = Snack.contadorSnacks;
    }
    public Snack (String nombre, double precio)
    {
        this(); //Llamada al contructor vacio para utilizar el contador con el id y debe ser la primera linea
        this.nombre = nombre;
        this.precio = precio;
        
    }
    //getters y setters 
    public int getContadorSnack()
    {
        return Snack.contadorSnacks;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    public int getIdSnack()
    {
        return this.idSnack;
    }

    // Metodo toString()
    @Override
    public String toString()
    {
        return "Snack{"+ "IdSnack: "+this.idSnack+", Nombre: "+"\'"+ this.nombre + "\'" + ", Precio: " + this.precio + "}\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 97 * hash + this.idSnack;
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
        final Snack other = (Snack) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.idSnack != other.idSnack) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }



}
