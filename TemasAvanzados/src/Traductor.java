public interface Traductor {
    //public y abstract 

    void traducir();

    //metodos con implementacion por default

    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
    
}
class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");
    }


}

class Frances implements Traductor{
    @Override
    public void traducir()
    {
        System.out.println("Traduzco a frances");
    }
    @Override
    public void iniciarTraductor()
    {
        System.out.println("Iniciando traductor en frances...");
    }
}
class PruebaTraductor{
    public static void main(String[] args) {
        //Traductor ingles = new Traductor(); // No se puede instanciar una interface 

        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        //intanciamos traductor frances

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
        
        
    }
}
