package com.pan.com.zona_fit.servicio;

import com.pan.com.zona_fit.modelo.Cliente;
import com.pan.com.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase ClienteServicio que implementa IClienteServicio.
 * Esta clase es un servicio de Spring que contiene la lógica de negocio
 * para gestionar las operaciones CRUD de la entidad Cliente.
 * Anotación @Service: indica que esta clase es un servicio de Spring
 * y será gestionada automáticamente por el contenedor de inyección de dependencias.
 */
@Service
public class ClienteServicio implements IClienteServicio {

    /**
     * Inyección de dependencia del repositorio ClienteRepositorio.
     * Anotación @Autowired: permite que Spring inyecte automáticamente
     *             una instancia de ClienteRepositorio en esta variable
     */
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    /**
     * Método que obtiene la lista de todos los clientes registrados en la base de datos.
     * Utiliza el repositorio para hacer una consulta a la BD y retorna todos los registros.
     *
     * @return List&lt;Cliente&gt; - una lista con todos los clientes de la BD
     *         Si no hay clientes, retorna una lista vacía
     */
    @Override
    public List<Cliente> listarClientes() {
        // Retornamos todos los clientes obtenidos de la BD mediante findAll()
        return clienteRepositorio.findAll();
    }


    /**
     * Método que busca un cliente específico por su ID (identificador único).
     * Consulta la base de datos para encontrar el cliente con el ID proporcionado.
     *
     * @param id - el identificador único del cliente a buscar (tipo Integer)
     * @return Cliente - el cliente encontrado, o null si no existe un cliente con ese ID
     *         El método findById() retorna un Optional, por eso usamos orElse(null)
     *         para retornar null en caso de que no se encuentre el cliente
     */
    @Override
    public Cliente buscarClientePorId(Integer id) {
        // Llamamos a findById() que retorna un Optional<Cliente>
        // orElse(null) retorna el Cliente si existe, o null si no existe
        return clienteRepositorio.findById(id).orElse(null);
    }


    /**
     * Método que guarda un cliente nuevo o actualiza uno existente en la base de datos.
     * Si el cliente no tiene ID (es nuevo), se crea un nuevo registro.
     * Si el cliente ya tiene ID (existe), se actualiza su información.
     *
     * @param cliente - el objeto Cliente que contiene los datos a guardar o actualizar
     *                  Este objeto debe tener al menos los campos básicos completos
     */
    @Override
    public void guardarCliente(Cliente cliente) {
        // Llamamos al método save() del repositorio para guardar o actualizar el cliente
        // save() es smart: si el ID es null crea uno nuevo, si existe actualiza el existente
        clienteRepositorio.save(cliente);
    }


    /**
     * Método que elimina un cliente de la base de datos.
     * Extrae el ID del cliente proporcionado y lo utiliza para eliminar
     * el registro correspondiente de la base de datos.
     *
     * @param cliente - el objeto Cliente que contiene el ID del cliente a eliminar
     *                  Solo se utiliza el atributo ID de este cliente para la eliminación
     */
    @Override
    public void borrarCliente(Cliente cliente) {
        // Obtenemos el ID del cliente
        // Llamamos a deleteById() del repositorio para eliminar el cliente por su ID
        clienteRepositorio.deleteById(cliente.getId());
    }
}
