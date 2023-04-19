package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios") // en caso que la tabla sea diferente
public class Usuarios {

	// Atributos de entidad almacenes
	@Id
	@Column(name = "username")
	private String username;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios")
	private List<Juegos> juegos;

	@ManyToOne
	@JoinColumn(name = "sala")
	private Salas sala;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios")
	private List<Mensajes> mensajes;

	// Constructores
	public Usuarios() {

	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Usuarios(String id, String nombre) {
		// super();
		this.username = id;
		this.email = nombre;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the juegos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Juegos")
	public List<Juegos> getJuegos() {
		return juegos;
	}

	/**
	 * @return the salas
	 */
	public Salas getSala() {
		return sala;
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
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param juegos the juegos to set
	 */
	public void setJuegos(List<Juegos> juegos) {
		this.juegos = juegos;
	}

	/**
	 * @param salas the salas to set
	 */
	public void setSala(Salas sala) {
		this.sala = sala;
	}

	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(List<Mensajes> mensajes) {
		this.mensajes = mensajes;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Usuarios [username=" + username + ", email=" + email + ", juegos=" + juegos + ", salas=" + sala
				+ ", mensajes=" + mensajes + "]";
	}
	
}