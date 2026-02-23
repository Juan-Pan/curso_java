package com.education.springbooticai.modelo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ModeloCliente(
        @NotBlank
        String dni,
        @NotBlank
        String nombre,
        @Email @NotBlank
        String email
) {
}
