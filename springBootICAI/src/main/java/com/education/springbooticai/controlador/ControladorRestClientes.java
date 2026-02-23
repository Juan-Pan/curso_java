package com.education.springbooticai.controlador;

import com.education.springbooticai.modelo.ModeloCliente;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.education.springbooticai.modelo.ModeloCliente;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequestMapping("/api/clientes")
@RestController
public class ControladorRestClientes {
    private final Map<String, ModeloCliente> clientemap = new ConcurrentHashMap<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloCliente registrarCliente(@Valid @RequestBody ModeloCliente cliente, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ExcepcionClienteIncorrecto(bindingResult);
        }
        if (clientemap.get(cliente.dni()) != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Cliente ya existe");
        }
        // no hay que usar else pq el throw lo hace parar
        clientemap.put(cliente.dni(), cliente);
        return cliente;
    }

    @GetMapping("/{dni}")
    public ModeloCliente buscarCliente(@PathVariable String dni) {
        if (clientemap.containsKey(dni)) {
            return clientemap.get(dni);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no encontrado");
        }
    }


}
