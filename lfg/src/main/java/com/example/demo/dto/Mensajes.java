package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajes") // en caso que la tabla sea diferente
public class Mensajes {

	// Atributos de entidad Cajas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name = "id")
	private long id;
	@Column(name = "contenido")
	private String contenido;

	@ManyToOne
	@JoinColumn(name = "usuario") // poner bien... Falta el OneToMany
	private Usuarios usuario;
	
	@ManyToOne
	@JoinColumn(name = "sala") // poner bien... Falta el OneToMany
	private Salas sala;

	// Constructores
	/**
	 * 
	 */
	public Mensajes() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param almacen
	 */
	public Mensajes(long id, String nombre, Usuarios almacen, Salas juego) {
		// super();
		this.id = id;
		this.contenido = nombre;
		this.usuario = almacen;
		this.sala = juego;
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
	public String getContenido() {
		return contenido;
	}

	/**
	 * @return the usuario
	 */
	public Usuarios getUsuario() {
		return usuario;
	}

	/**
	 * @return the sala
	 */
	public Salas getSala() {
		return sala;
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
	public void setContenido(String nombre) {
		this.contenido = nombre;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(Salas sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Mensajes [id=" + id + ", nombre=" + contenido + ", usuario=" + usuario + ", sala=" + sala + "]";
	}

}