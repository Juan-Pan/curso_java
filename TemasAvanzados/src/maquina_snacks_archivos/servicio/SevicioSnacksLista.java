package maquina_snacks_archivos.servicio;
import java.util.*;
import maquina_snacks_archivos.dominio.Snack;

public class SevicioSnacksLista implements IServicioSnacks{
    private static final List <Snack> snacks;

    //Bloque static inicializador
    static{
        snacks = new ArrayList<>();
        SevicioSnacksLista.snacks.add(new Snack("Papas", 70)); //se puede asi
        snacks.add(new Snack ("Gaseosa", 12.20)); // o asi
        snacks.add(new Snack("Uvas", 20.20));
    }
    @Override
    public void agragarSnack(Snack snack)
    {
        snacks.add(snack);
    }
    @Override
    public void mostrarSnacks()
    {
        String inventarioSnack = "";
        for(Snack snack: snacks)
        {
            inventarioSnack = snack.toString() + inventarioSnack + "\n"; 
        }
        System.out.println("---Snacks en el Inventario---");
        System.out.print(inventarioSnack);
    }
    @Override
    public List<Snack> getSnacks()
    {
        return snacks;
    }
}
