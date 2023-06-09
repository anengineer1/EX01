package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Mensajes;
import com.example.demo.dto.Salas;
/**
 * @author Francisco
 *
 */

public interface IMensajesService {

	// Metodos del CRUD
	public List<Mensajes> listarMensajes(); // Listar All

	public Mensajes guardarMensaje(Mensajes fabricante); // CREATE

	public Mensajes mensajeXID(long id); // READ

	public Mensajes actualizarMensaje(Mensajes almacen); // UPDATE

	public void eliminarMensaje(long id);// DELETE

	List<Mensajes> listarMensajesXSala(Salas sala); // READ by sala

}