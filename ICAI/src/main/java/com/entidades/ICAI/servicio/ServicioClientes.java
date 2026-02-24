package com.entidades.ICAI.servicio;

import com.entidades.ICAI.entidades.Cliente;
import com.entidades.ICAI.entidades.Operacion;
import com.entidades.ICAI.entidades.Usuario;
import com.entidades.ICAI.repositorios.RepoCliente;
import com.entidades.ICAI.repositorios.RepoOperacion;
import com.entidades.ICAI.repositorios.RepoUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import java.util.Date;

@Service
public class ServicioClientes {
    //Inyeccion de dependencias
    @Autowired
    RepoUsuario repoUsuario;
    @Autowired
    RepoCliente repoCliente;
    @Autowired
    RepoOperacion repoOperacion;

    private Logger logger = (Logger) LoggerFactory.getLogger(getClass());

    public Usuario autentica(String credenciales) {
        logger.info("ServicioClientes: intentando autentificar con: " + credenciales);
        Usuario usuario = repoUsuario.findByCredenciales(credenciales);
        if (usuario == null) {
            logger.warn("ServicioClientes: usuario no encontrado");
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Credenciales incorrectas");
        }
        return usuario;
    }

    @Transactional
    public Cliente crea(Cliente clienteNuevo, Usuario usuario) {
        // 1. Validar duplicados
        if (repoCliente.findByDni(clienteNuevo.dni) != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "DNI existente");
        }
        //2. Guardar el cliente
        Cliente clienteGuardado = repoCliente.save(clienteNuevo);

        //3. Registro de auditoria
        Operacion operacion = new Operacion();
        operacion.setCliente(clienteGuardado);
        operacion.setUsuario(usuario);
        operacion.setTipo("Creacion");
        operacion.setFecha(new Date());
        repoOperacion.save(operacion);

        // 4. Devolver
        return clienteGuardado;
    }

    public Cliente lee(String dni, Usuario usuario) {
        Cliente cliente = repoCliente.findByDni(dni);
        if (cliente == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DNI inexistente");
        }
        // Toca registar toda operacion por mas minima que sea
        Operacion operacion = new Operacion();
        operacion.setCliente(cliente);
        operacion.setUsuario(usuario);
        operacion.setTipo("Leer");
        operacion.setFecha(new Date());
        repoOperacion.save(operacion);
        return cliente;
    }

    @Transactional(rollbackFor = Exception.class)
    public void borra(Cliente cliente, Usuario usuario) throws Exception {
        try {
            //1. Borramos el cliente
            repoCliente.delete(cliente);
            //2. Registramos el borrado (siempre queda un registro)
            Operacion operacion = new Operacion();
            operacion.setCliente(cliente);
            operacion.setUsuario(usuario);
            operacion.setTipo("Eliminar");
            operacion.setFecha(new Date());
            repoOperacion.save(operacion);
        } catch (Exception e) {
            throw new Exception("Error al realizar la operación de borrado");
        }
    }

    }
