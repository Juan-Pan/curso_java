package com.pan.com.zona_fit.repositorio;

import com.pan.com.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz ClienteRepositorio que extiende JpaRepository.
 * Proporciona métodos CRUD (Create, Read, Update, Delete) automáticos
 * para gestionar la entidad Cliente en la base de datos.
 *
 * El tipo genérico &lt; Cliente, Integer&gt; indica que:
 * - Cliente: es la entidad que se va a persistir en la BD
 * - Integer: es el tipo de dato de la clave primaria (ID del cliente)
 */
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    // Esta interfaz hereda los métodos básicos de JpaRepository:
    // - save(): guardar o actualizar un cliente
    // - findById(): buscar un cliente por su ID
    // - findAll(): obtener todos los clientes
    // - delete(): eliminar un cliente
    // - deleteById(): eliminar un cliente por su ID
    // - count(): contar el total de clientes
    //
    // Aquí se pueden agregar métodos de consulta personalizados si es necesario
}
