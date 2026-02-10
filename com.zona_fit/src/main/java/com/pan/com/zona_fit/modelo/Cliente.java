package com.pan.com.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * Clase entidad Cliente que representa a un cliente en el sistema Zona Fit.
 * Esta clase se mapea automáticamente a una tabla en la base de datos
 * y contiene información sobre el cliente, como nombre, apellido y tipo de membresía.
 * Anotaciones Lombok utilizadas:
 * - @Data: genera automáticamente getters, setters, equals(), hashCode() y toString()
 * - @NoArgsConstructor: genera un constructor sin argumentos
 * - @AllArgsConstructor: genera un constructor con todos los campos como parámetros
 * - @ToString: genera el método toString()
 * - @EqualsAndHashCode: genera los métodos equals() y hashCode()
 * Anotación @Entity: indica que esta clase es una entidad JPA que se mapea a una tabla en la BD
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cliente {

	/**
	 * Identificador único del cliente.
	 * Anotación @Id: indica que este es el campo clave primaria
	 * Anotación @GeneratedValue: especifica que el ID se genera automáticamente
	 * en la base de datos con estrategia IDENTITY (auto-incremento)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * Nombre del cliente.
	 * Este campo almacena el nombre propio del cliente registrado en el sistema.
	 */
	private String nombre;

	/**
	 * Apellido del cliente.
	 * Este campo almacena el apellido del cliente registrado en el sistema.
	 */
	private String apellido;

	/**
	 * Tipo de membresía del cliente.
	 * Este campo almacena el tipo de membresía (puede ser 1=básica, 2=premium, etc.)
	 * que el cliente tiene contratada en el gimnasio.
	 */
	private Integer membresia;
}
