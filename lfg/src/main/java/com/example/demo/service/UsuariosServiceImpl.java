package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuariosDAO;
import com.example.demo.dto.Salas;
import com.example.demo.dto.Usuarios;

@Service
public class UsuariosServiceImpl implements IUsuariosService {
	
	@Autowired
	IUsuariosDAO iUsuariosDAO;
	
	@Override
	public List<Usuarios> listarUsuarios() {
		
		return iUsuariosDAO.findAll();
	}

	@Override
	public Usuarios guardarUsuario(Usuarios almacen) {
		
		return iUsuariosDAO.save(almacen);
	}

	@Override
	public Usuarios usuarioXID(String id) {
		
		return iUsuariosDAO.findById(id).get();
	}

	@Override
	public Usuarios actualizarUsuario(Usuarios almacen) {
		
		return iUsuariosDAO.save(almacen);
	}

	@Override
	public void eliminarUsuario(String id) {
		
		iUsuariosDAO.deleteById(id);
		
	}
	
	@Override
	public List<Usuarios> usuarioXSala(Salas sala) {

	return iUsuariosDAO.findBySala(sala);
	}
}