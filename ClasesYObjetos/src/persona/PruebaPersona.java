package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("***Creacion de objetos de la clase persona***");
        //intanciamos un nuevo objeto
        Persona persona1 = new Persona("Juan","Pedrin");
        System.out.println("Persona 1: " + persona1.getnombre() +" "+ persona1.getApellido());
    }
    
}
