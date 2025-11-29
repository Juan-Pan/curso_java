import java.util.Scanner;
public class EjemploUsuario {
    public static void main(String[] args) {
        
        //Revisar si el usuario y password son correctos
        try(Scanner consola = new Scanner (System.in))
        {
            System.out.print("Ingrese su usuario: ");
            String usuario = consola.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = consola.nextLine();

            //Revisar si es usuario = admin y password = 123

            String usuarioValido = "admin";
            String passwordValido = "123";

            if(usuario.equals(usuarioValido) && contraseña.equals(passwordValido))
            {
                System.out.println("Bienvenido al sistema");
            }
            else if (usuario.equals(usuarioValido))
            {
                System.out.println("Contraseña incorrecta");
            }
            else if (contraseña.equals(passwordValido))
            {
                System.out.println("Usuario incorrecto");
            }
            else
            {
                System.out.println("Contraseña y usuario incorrectos");
            }
        }
    }
    
}
