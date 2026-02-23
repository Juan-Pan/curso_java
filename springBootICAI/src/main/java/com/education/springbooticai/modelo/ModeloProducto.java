package com.education.springbooticai.modelo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ModeloProducto(
        @NotBlank(message = "EL nombre no puede estar vacio")
        String nombre,
        @NotNull(message = "El precio no puede ser nulo")
        @Positive(message = "El precio debe ser positivo")
        Double precio,
        Long id) {
}
