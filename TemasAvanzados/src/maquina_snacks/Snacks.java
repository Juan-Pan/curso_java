package maquina_snacks;
import java.util.*;

public class Snacks {
    private static final List <Snack> snacks;

    //Bloque static inicializador
    static{
        snacks = new ArrayList<>();
        Snacks.snacks.add(new Snack("Papas", 70)); //se puede asi
        snacks.add(new Snack ("Gaseosa", 12.20)); // o asi
        snacks.add(new Snack("Uvas", 20.20));
    }
    public static void agragarSnack(Snack snack)
    {
        snacks.add(snack);
    }
    public static void mostrarSnacks()
    {
        String inventarioSnack = "";
        for(Snack snack: snacks)
        {
            inventarioSnack = snack.toString() + inventarioSnack + "\n"; 
        }
        System.out.println("---Snacks en el Inventario---");
        System.out.print(inventarioSnack);
    }
    public static List<Snack> getSnakcs()
    {
        return snacks;
    }
}
