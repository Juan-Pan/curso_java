public class Variables {
    public static void main(String[] args) {
        //
        int edad = 30;
        double sueldo = 20300.50;
        String nombre = "Juan";

        //acceder a lo valores
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Nombre: " + nombre);

        //modificar el valor de las variables
        edad = 35;
        sueldo = 300.80;
        nombre = "Carlos";
        System.out.println("Edad modificada: " + edad);
        System.out.println("Sueldo modificado: " + sueldo);
        System.out.println("Nombre modificado: "+ nombre);

        //inferir variables

        var edad1 = 5;
        var sueldo1 = 10.44;
        var nombre1 = "Juliana";

        System.out.println(edad1);
        System.out.println(sueldo1);
        System.out.println(nombre1);

    }
}
