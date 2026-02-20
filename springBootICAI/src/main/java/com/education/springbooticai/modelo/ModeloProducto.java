package com.education.springbooticai.modelo;
import jakarta.validation.constraints.NotBlank;

public record ModeloProducto(
        @NotBlank(message = "EL nombre no puede estar vacio")
        String nombre,
        Double precio,
        Long id) {
}
