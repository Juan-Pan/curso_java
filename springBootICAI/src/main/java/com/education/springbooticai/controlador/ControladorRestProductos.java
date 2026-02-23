package com.education.springbooticai.controlador;
import com.education.springbooticai.modelo.ModeloProducto;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api/productos")
public class ControladorRestProductos {

    // Nuestra "nevera" didáctica: Almacenamiento en memoria, rápido y directo.
    // Usamos ConcurrentHashMap porque es seguro si nos llegan muchas peticiones a la vez.
    private final Map<String, ModeloProducto> productos = new ConcurrentHashMap<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Devuelve un código 201 si tiene éxito
    public ModeloProducto crea(@Valid @RequestBody ModeloProducto productoNuevo,
                               BindingResult bindingResult) {

        // 1. Comprobamos si las reglas del 'record' han fallado (ej: el precio era negativo)
        if (bindingResult.hasErrors()) {
            // El estilo del profesor es lanzar una excepción personalizada
            throw new ExcepcionProductoIncorrecto(bindingResult);
        }

        // 2. Comprobamos si el producto ya existe en nuestra "nevera"
        if (productos.get(productoNuevo.nombre()) != null) {
            // Regla del profesor: Si hay conflicto por duplicado, devolver 409 (CONFLICT)
            throw new ResponseStatusException(HttpStatus.CONFLICT, "El producto ya existe");
        }

        // 3. Si todo está correcto, guardamos el producto y lo devolvemos
        productos.put(productoNuevo.nombre(), productoNuevo);
        return productoNuevo;
    }
    @GetMapping
    @RequestMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ModeloProducto> lista() {
        return new ArrayList<>(productos.values());
    }


}