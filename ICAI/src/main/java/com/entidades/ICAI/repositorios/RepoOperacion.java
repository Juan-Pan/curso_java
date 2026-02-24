package com.entidades.ICAI.repositorios;

import com.entidades.ICAI.entidades.Cliente;
import com.entidades.ICAI.entidades.Operacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoOperacion extends CrudRepository<Operacion,Long> {
    List<Operacion> findOperacionByCliente(Cliente cliente);

}
