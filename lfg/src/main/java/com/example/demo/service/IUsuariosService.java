package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Usuarios;

public interface IUsuariosService {

	// Metodos del CRUD
	public List<Usuarios> listarUsuarios(); // Listar All

	public Usuarios guardarUsuario(Usuarios fabricante); // CREATE

	public Usuarios usuarioXID(String id); // READ

	public Usuarios actualizarUsuario(Usuarios almacen); // UPDATE

	public void eliminarUsuario(String id);// DELETE

}