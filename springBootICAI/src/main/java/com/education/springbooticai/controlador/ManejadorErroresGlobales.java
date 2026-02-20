package com.education.springbooticai.controlador;
import com.education.springbooticai.controlador.ExcepcionProductoIncorrecto;
import com.education.springbooticai.modelo.ModeloCampoIncorrecto;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ManejadorErroresGlobales {
    @ExceptionHandler(ExceptionProductoIncorrecto.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public List<ModeloCampoIncorrecto> productoIncorrecto(ExceptionProductoIncorrecto ex) {
        return ex.getErrores().stream()
                .map(error -> new ModeloCampoIncorrecto(
                        error.getDefaultMessage(),
                        error.getField(),
                        error.getRejectedValue()))
                .toList();
    }
}
