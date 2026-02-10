package com.pan.com.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
// Clase entidad que representa a un cliente en el sistema de gestión de gimnasio.
// Esta clase se mapea a una tabla en la base de datos y contiene información sobre el cliente, como su nombre, apellido y tipo de membresía.
@Entity
@Data // getter and setters
@NoArgsConstructor //constructor vacío
@AllArgsConstructor // constructor con todos los campos
@ToString
@EqualsAndHashCode
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;
}
