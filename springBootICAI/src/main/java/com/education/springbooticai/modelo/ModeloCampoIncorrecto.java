package com.education.springbooticai.modelo;

public record ModeloCampoIncorrecto(
        String mensaje,
        String campo,
        Object error
) {
}
