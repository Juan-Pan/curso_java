package com.pan.com.zona_fit.servicio;

import com.pan.com.zona_fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarClientePorId(Integer id);
    public void guardarCliente(Cliente cliente);
    public void borrarCliente(Cliente cliente);

}
