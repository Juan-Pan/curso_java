package com.entidades.ICAI.repositorios;

import com.entidades.ICAI.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface RepoUsuario extends CrudRepository<Usuario, Long > {
    Usuario findByCredenciales(String credenciales);

}
