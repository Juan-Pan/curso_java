package com.entidades.ICAI.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(nullable = false, name = "cliente_id")
    private Cliente cliente;

    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private Date fecha;

    //setters

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
}
