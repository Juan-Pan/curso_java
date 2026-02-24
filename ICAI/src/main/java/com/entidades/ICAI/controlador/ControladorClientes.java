package com.entidades.ICAI.controlador;

import com.entidades.ICAI.entidades.Cliente;
import com.entidades.ICAI.entidades.Usuario;
import com.entidades.ICAI.servicio.ServicioClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ControladorClientes {
    @Autowired
    private ServicioClientes servicioClientes;

    // endpoint Crear

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente crear(@RequestBody Cliente cliente, @RequestHeader("Authorization") String credenciales)
    {
        // se autentica primero
        Usuario usuario = servicioClientes.autentica(credenciales);

        return servicioClientes.crea(cliente, usuario);
    }
    //End Point Leer
    @GetMapping("/{dni}")
    public Cliente leer(@PathVariable String dni, @RequestHeader("Autorizacion") String autorizacion)
    {
        Usuario usuario = servicioClientes.autentica(autorizacion);
        return servicioClientes.lee(dni,usuario);
    }
    // End point
    @DeleteMapping("/{dni}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrar(@PathVariable String dni, @RequestHeader("Autorizacion") String autorizacion) throws Exception {
        Usuario usuario = servicioClientes.autentica(autorizacion);
        Cliente cliente = servicioClientes.lee(dni,usuario);
        servicioClientes.borra(cliente, usuario);
    }
}