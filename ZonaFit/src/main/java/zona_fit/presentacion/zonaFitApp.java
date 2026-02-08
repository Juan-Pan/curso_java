package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.List;
import java.util.Scanner;

public class zonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();

    }

    private static void zonaFitApp() {
        // variables para el menu
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        // Creamos un objeto de la clase Cliente DAO para manejar las operaciones de la base de datos
        ClienteDAO clienteDao = new ClienteDAO();
        while (!salir) {
            try {
                int opcion = mostrarMenu(scanner);
                salir = ejecutarOpciones(scanner, opcion, clienteDao);


            } catch (Exception e) {
                System.out.println("Error al intentar salir: " + e.getMessage());
            }
            System.out.println();
        }


    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print(
                """
                        ***Zona Fit (GYM) ***
                        1. Listar Clientes
                        2. Buscar Cliente
                        3. Agregar Cliente
                        4. Modificar Cliente
                        5. Eliminar Cliente
                        6. Salir
                        Elije una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDao) {
        boolean salir = false;
        switch (opcion) {
            case 1 -> {
                // listar clientes
                System.out.println("---Listado de clientes---");
                var clientes = clienteDao.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                // Buscar clientes
                System.out.println("---Buscar Cliente---");
                System.out.print("Ingrese el id de cliente que desea buscar: ");
                try {
                    int id = Integer.parseInt(consola.nextLine());
                    Cliente clienteBuscar = new Cliente(id);
                    boolean encontrado = clienteDao.buscarClientePorId(clienteBuscar);
                    if (encontrado) {
                        System.out.println("Cliente encontrado: " + clienteBuscar);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                } catch (Exception e) {
                    System.out.println("Solo puede ingresar un numero (que es el id): " + e.getMessage());
                }
            }
            case 3 -> {
                // Agregar Clientes
                System.out.println("---Agregar Cliente---");
                try {
                    System.out.print("Ingrese el nombre de la persona que desea agregar: ");
                    String nombre = consola.nextLine();
                    System.out.print("Ingrese el apellido que desea agregar: ");
                    String apellido = consola.nextLine();
                    System.out.print("Ingrese el valor de la membresía: ");
                    int membresia = Integer.parseInt(consola.nextLine());
                    Cliente clienteAgregar = new Cliente(nombre, apellido, membresia);
                    boolean agregado = clienteDao.agregarCliente(clienteAgregar);
                    if (agregado) {
                        System.out.println("Cliente agregado: " + clienteAgregar);
                        System.out.println("---Lista de clientes actualizada---");
                        List<Cliente> clientes = clienteDao.listarClientes();
                        clientes.forEach(System.out::println);
                    } else {
                        System.out.println("Cliente no agregado");
                    }
                } catch (Exception e) {
                    System.out.println("Error al ingresar algún dato: " + e.getMessage());
                }


            }
            case 4 -> {
                System.out.println("---Modificar Cliente---");
                try {
                    System.out.print("Ingrese el id del cliente que desea modificar: ");
                    int id = Integer.parseInt(consola.nextLine());
                    Cliente clienteModificar = new Cliente(id);
                    boolean encontrado = clienteDao.modificarCliente(clienteModificar);
                    if (encontrado) {
                        System.out.println("Cliente encontrado para modificar");

                        System.out.print("Ingrese el nuevo nombre: ");
                        String nombre = consola.nextLine();
                        System.out.print("Ingrese el nuevo apellido: ");
                        String apellido = consola.nextLine();
                        System.out.print("Ingrese el nuevo valor de la membresía: ");
                        int membresia = Integer.parseInt(consola.nextLine());
                        Cliente clienteModificado = new Cliente(id, nombre, apellido, membresia);
                        boolean modificado = clienteDao.modificarCliente(clienteModificado);
                        if (modificado) {
                            System.out.println("Cliente modificado correctamente " + clienteModificado);
                        } else {
                            System.out.println("Cliente no modificado");
                        }

                    } else {
                        System.out.println("No se encontró el cliente para modificar");
                    }

                } catch (Exception e) {
                    System.out.println("Error al ingresar algún tipo de dato: " + e.getMessage());
                }

            }
            case 5 -> {
                System.out.println("--- Eliminar Cliente---");
                try {
                    System.out.print("Ingrese el id del cliente que desea eliminar: ");
                    int id = Integer.parseInt(consola.nextLine());
                    Cliente clienteEliminar = new Cliente(id);
                    boolean eliminado = clienteDao.eliminarCliente(clienteEliminar);
                    if (eliminado) {
                        System.out.println("Cliente eliminado correctamente");
                    } else {
                        System.out.println("Cliente no eliminado/no existe");
                    }

                } catch (Exception e) {
                    System.out.println("Error al ingresar algun dato: " + e.getMessage());
                }


            }
            case 6 -> {
                System.out.println("Saliendo, gracias por usar el programa...");
                salir = true;
            }
        }
        return salir;
    }
}
