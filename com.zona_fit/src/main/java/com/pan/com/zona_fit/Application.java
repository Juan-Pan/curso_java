package com.pan.com.zona_fit;

import com.pan.com.zona_fit.modelo.Cliente;
import com.pan.com.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

/**
 * Clase Application - Punto de entrada de la aplicación Zona Fit.
 * Esta es la clase principal que inicializa la aplicación Spring Boot.
 * Implementa CommandLineRunner para ejecutar código personalizado después
 * de que la aplicación se haya iniciado completamente.
 * Anotación @SpringBootApplication: combina las anotaciones:
 * - @Configuration: permite definir beans
 * - @ComponentScan: escanea componentes automáticamente
 * - @EnableAutoConfiguration: activa la configuración automática de Spring
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    /**
     * Inyección de dependencia del servicio de clientes.
     * Anotación @Autowired: Spring inyecta automáticamente una instancia
     * de IClienteServicio cuando la aplicación se inicia.
     */
    @Autowired
    private IClienteServicio clienteServicio;

    /**
     * Logger estático para registrar eventos de la aplicación.
     * Se utiliza para mostrar mensajes informativos en la consola.
     */
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    String nl = System.lineSeparator(); // Salto de línea para los loggers

    /**
     * Método main - Punto de entrada de la JVM.
     *
     * @param args argumentos de línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {
        logger.info("========================================");
        logger.info("Iniciando la aplicación Zona Fit...");
        logger.info("========================================");

        // SpringApplication.run() levanta la fábrica de Spring Boot
        // crea el contexto de la aplicación y ejecuta todos los beans
        SpringApplication.run(Application.class, args);

        logger.info("========================================");
        logger.info("¡Aplicación finalizada correctamente!");
        logger.info("========================================");
    }

    /**
     * Método run - Se ejecuta después de que Spring Boot ha iniciado.
     * Este método es llamado automáticamente por CommandLineRunner.
     *
     * @param args argumentos pasados a la aplicación
     */
    @Override
    public void run(@Nullable String... args) {
        zonaFitApp();
    }

    private void zonaFitApp() {
        logger.info("***Aplicacion Zona Fit ***\n");


        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (!salir) {
           try{
               opcion = mostrarMenu(scanner);
               salir = ejecutarOpciones(scanner, opcion);
           }catch (Exception e){
               logger.error(e.getMessage());
           }
        }


    }

    private int mostrarMenu(Scanner consola) {
            logger.info(nl + "***Menu Zona Fit ***" + nl);
            logger.info("1. Listar Clientes" + nl);
            logger.info("2. Buscar Cliente" + nl);
            logger.info("3. Crear Cliente" + nl);
            logger.info("4. Borrar Cliente" + nl);
            logger.info("5. Editar Cliente" + nl);
            logger.info("6. Salir" + nl);
            logger.info("Ingrese su opcion: ");
            int opcion = Integer.parseInt(consola.nextLine());
            return opcion;

    }

    private boolean ejecutarOpciones(Scanner consola, int opcion) {
        boolean salir = false;
        switch (opcion) {
            case 1 -> {
                // Listar clientes
                List<Cliente> clientes = clienteServicio.listarClientes();
                logger.info(nl + "***Clientes***" + nl);
                clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
            }
            case 2 -> {
                // Buscar clientes
                logger.info(nl + "***Buscar Cliente***" + nl);
                try {
                    logger.info(nl + "Ingrese el Id del Cliente a buscar: ");
                    Cliente cliente = clienteServicio.buscarClientePorId(Integer.parseInt(consola.nextLine()));
                    if (cliente != null) {
                        logger.info(nl + "Cliente encontrado: " + cliente);
                    } else {
                        logger.info(nl + "Cliente no encontrado: ");
                    }
                } catch (Exception e) {
                    logger.error("Error al buscar Cliente: " + e.getMessage());
                }
            }
            case 3 -> {
                // Crear clientes
                logger.info(nl + "***Crear Cliente***" + nl);
                logger.info("Ingrese el nombre del cliente: ");
                String nombre = consola.nextLine();
                logger.info(nl + "Ingrese el apellido del cliente: ");
                String apellido = consola.nextLine();
                logger.info(nl + "Ingrese le mensualidad: ");
                int mensualidad = Integer.parseInt(consola.nextLine());
                Cliente cliente = new Cliente();
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setMembresia(mensualidad);
                clienteServicio.guardarCliente(cliente);
                logger.info(nl + "Cliente guardado: " + cliente);
            }
            case 4 -> {
                // borrar cliente
                logger.info(nl + "*** Borrar cliente ***" + nl);
                logger.info("Ingrese el Id del Cliente a borrar: ");
                int id = Integer.parseInt(consola.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(id);
                if(cliente != null) {
                    clienteServicio.borrarCliente(cliente);
                    logger.info(nl + "Cliente borrado: " + cliente);

                }
                else
                {
                    logger.info(nl + "Cliente no encontrado para borrar");
                }
            }
            case 5 -> {
                logger.info(nl + "*** Editar Cliente ***" + nl);
                logger.info("Ingrese el id del Cliente a editar: ");
                int id = Integer.parseInt(consola.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(id);
                if(cliente != null) {
                    logger.info("Cliente encontrado para editar: " + cliente);
                    logger.info(nl +  "Escriba el nombre del cliente: ");
                    cliente.setNombre(consola.nextLine());
                    logger.info("Escriba el apellido del cliente: ");
                    cliente.setApellido(consola.nextLine());
                    logger.info("Escriba el menmbresia del cliente: ");
                    cliente.setMembresia(Integer.parseInt(consola.nextLine()));
                    clienteServicio.guardarCliente(cliente);
                }
                else
                {
                    logger.info(nl + "Cliente no encontrado para editar");
                }
            }
            case 6 -> {
                logger.info(nl + "Gracias por usar la APP" + nl);
                salir = true;
            }
            default -> logger.info(nl + "Opción no reconocida, intente de nuevo" + nl);
        }
        return salir;
    }
}
