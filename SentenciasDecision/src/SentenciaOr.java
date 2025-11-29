public class SentenciaOr {
    public static void main(String[] args) {
        //sentencia if y operador logico or
        /*
         Sergio quiere asistir al juego de su hijo pero solo puede asistir si tiene vacaciones o es un dia de descanso
         */
        boolean diaDescanso = true;
        boolean vacaciones = false;

        if (diaDescanso || vacaciones)
        {
            System.out.println("Sergio puede asistir al juego de mateo...");
        }
        else
        {
            System.out.println("Sergio no puede asistir al juego de mateo...");
        }
    }
    
}
