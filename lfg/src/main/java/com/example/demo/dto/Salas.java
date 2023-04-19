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
@Table(name = "salas") // en caso que la tabla sea diferente
public class Salas {

	// Atributos de entidad Cajas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name = "id")
	private long id;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salas")
	private List<Usuarios> usuarios;
	
	@ManyToOne
	@JoinColumn(name = "juego") // poner bien... Falta el OneToMany
	private Juegos juego;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salas")
	private List<Mensajes> mensajes;

	// Constructores
	/**
	 * 
	 */
	public Salas() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param almacen
	 */
	public Salas(long id, String nombre, Usuarios almacen, Juegos juego) {
		// super();
		this.id = id;
		this.nombre = nombre;
		this.juego = juego;
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
	 * @return the usuario
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<Usuarios> getUsuario() {
		return usuarios;
	}

	/**
	 * @return the juego
	 */
	public Juegos getJuego() {
		return juego;
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
	 * @param usuario the usuario to set
	 */
	public void setUsuario(List<Usuarios> usuario) {
		this.usuarios = usuario;
	}

	/**
	 * @param juego the juego to set
	 */
	public void setJuego(Juegos juego) {
		this.juego = juego;
	}

	/**
	 * @return the mensajes
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensajes")
	public List<Mensajes> getMensajes() {
		return mensajes;
	}

	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(List<Mensajes> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public String toString() {
		return "Salas [id=" + id + ", nombre=" + nombre + ", usuario=" + usuarios + ", juego=" + juego + ", mensajes="
				+ mensajes + "]";
	}

}