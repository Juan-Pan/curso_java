package maquina_snacks_archivos.servicio;
import java.util.*;
import maquina_snacks_archivos.dominio.Snack;

public interface IServicioSnacks{
    void agragarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}