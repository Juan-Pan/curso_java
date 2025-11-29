public class SentenciasDecision {
    public static void main(String[] args) throws Exception {
       //Sentencias Decision If/else
       boolean llueve = false;
       boolean nublado = true;

       if(llueve)
       {
        System.out.println("Llevar paraguas");
       }
       else if(nublado)
       {
        System.out.println("LLevar impermeable");
       }
       else{
        System.out.println("Dejar paraguas e impermeable en casa");
       }
    }
}
