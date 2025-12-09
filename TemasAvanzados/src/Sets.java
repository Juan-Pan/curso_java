import java.util.*;
public class Sets {
    public static void main(String[] args) {
        //Set: no permite elementos duplicados
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("ELementos del set");
        conjunto.forEach(System.out::println);

        //Remover elemento

        conjunto.remove("Karla");
        System.out.println("\n Nuevos elementos del set");

        conjunto.forEach(System.out::println);
    }
    
}
