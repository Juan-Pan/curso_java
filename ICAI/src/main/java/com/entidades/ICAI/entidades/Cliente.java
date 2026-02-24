package com.entidades.ICAI.entidades;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, unique = true)
    public String dni;

    @Column(nullable = false)
    public String nombre;

    @Column(nullable = false)
    public String email;
}
