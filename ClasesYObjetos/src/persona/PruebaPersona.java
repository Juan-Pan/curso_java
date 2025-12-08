package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("***Creacion de objetos de la clase persona***");
        //intanciamos un nuevo objeto
        System.out.println("Variable estatica: "+ Persona.getContadorPersonas());
        Persona persona1 = new Persona("Juan","Pedrin");
        System.out.println(persona1); //de manera automatica se muestra el metodo toString

        // instanciamos un segundo objeto
        Persona persona2 = new Persona("Juan", "Perez");
        System.out.println(persona2);

        System.out.println("Valor contador: "+ Persona.getContadorPersonas() );

        persona1.setApellido("Lopez");

        System.out.println("Persona con el set modificado: "+ persona1.getApellido());
       
    }
    
}
