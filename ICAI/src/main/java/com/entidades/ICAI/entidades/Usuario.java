package com.entidades.ICAI.entidades;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false,  unique = true)
    public String email;

    @Column
    public String credenciales;



}
