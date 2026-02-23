package com.education.springbooticai.controlador;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class ExcepcionProductoIncorrecto extends RuntimeException {
    private final List<FieldError> errores;
    // Contructor
    public ExcepcionProductoIncorrecto(BindingResult result) {
        this.errores = result.getFieldErrors();
    }
    // Get
    public List<FieldError> getErrores() {
        return errores;
    }
}