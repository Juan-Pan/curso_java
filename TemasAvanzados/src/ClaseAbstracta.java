public class ClaseAbstracta {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); //Esto provoca error (no se puede instanciar)
        FiguraGeometrica figura = new Rectangulo();
        figura.dibujar();

        figura =new Circulo(); // puede cambiar de tipo de subclase una misma instancia

        figura.dibujar();

        
    }
    //Clase abstracta

   

}

 abstract class FiguraGeometrica{ //no se pueden instanciar
        public abstract void dibujar();

    }
    class Rectangulo extends FiguraGeometrica{
        @Override
        public void dibujar(){
            System.out.println("Se dibuja un rectangulo");
        }
    }
     class Circulo extends FiguraGeometrica{
        @Override
        public void dibujar(){
            System.out.println("Se dibuja un circulo");
        }

    }