package com.entidades.ICAI.repositorios;

import com.entidades.ICAI.entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface RepoCliente extends CrudRepository<Cliente,Long> {

    Cliente findByDni(String dni);
}
