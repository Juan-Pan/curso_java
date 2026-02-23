package com.education.springbooticai.controlador;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class ExcepcionClienteIncorrecto extends RuntimeException {

    private final List<FieldError> erroresClientes;

    public ExcepcionClienteIncorrecto(BindingResult result ){
        this.erroresClientes = result.getFieldErrors();
    }

    public List<FieldError> getErroresClientes() {
        return erroresClientes;
    }

}
