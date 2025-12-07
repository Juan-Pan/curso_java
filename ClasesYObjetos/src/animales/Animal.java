package animales;

public class Animal {

    public void hacerSonido()
    {
        System.out.println("El animal hace un sonido");
    }
    
}
// fin Clase Animal

class Perro extends Animal{

    @Override
    public void hacerSonido()
    {
        System.out.println("El perro hace guau");
    }
   
        
}
class Gato extends Animal
{
    @Override
    public void hacerSonido()
    {
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal
{
    public static void main(String[] args) {
        System.out.println("***Ejemplo de herencia***");
        System.out.println("Clase padre, soy un animal");

        Animal animal1 = new Animal();
        animal1.hacerSonido();

        Animal perro = new Perro(); //polimorfismo

        System.out.println("\nClase hija, soy un Perro");
        perro.hacerSonido(); //metodo heredado de la clase hija

        Animal gato = new Gato();

        gato.hacerSonido();

        
        


    }
}

