import java.util.*;


public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("apellido", "Florez");
        persona.put("nombre", "Diego");
        persona.put("Edad", "31");
        System.out.println("Valores del mapa");
        persona.entrySet().forEach(System.out::println);
        persona.put("Edad", "35");

        System.out.println("Nuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        System.out.println("Quitando el apellido: ");
        persona.remove("apellido");
        persona.entrySet().forEach(System.out::println);

        //iterar sobre los elementos del mapa por separado
        System.out.println("Iterando los elementos (llave, valor)");

        persona.forEach((llave, valor) -> {
            System.out.println("LLave: " + llave + ", Valor: "+ valor);
        });

    }
    
}
