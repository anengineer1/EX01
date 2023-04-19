package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegos") // en caso que la tabla sea diferente
public class Juegos {

	// Atributos de entidad Cajas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	@Column(name = "id")
	private long id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "juego")
	private List<Salas> salas;

	// Constructores
	/**
	 * 
	 */
	public Juegos() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param almacen
	 */
	public Juegos(long id, String nombre) {
		// super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the salas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Salas")
	public List<Salas> getSalas() {
		return salas;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param salas the salas to set
	 */
	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Juegos [id=" + id + ", nombre=" + nombre + ", salas=" + salas + "]";
	}

}