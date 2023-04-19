package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMensajesDAO;
import com.example.demo.dto.Mensajes;

@Service
public class MensajesServiceImpl implements IMensajesService {

	@Autowired
	IMensajesDAO iMensajesDAO;

	@Override
	public List<Mensajes> listarMensajes() {
		
		return iMensajesDAO.findAll();
	}

	@Override
	public Mensajes guardarMensaje(Mensajes almacen) {
		
		return iMensajesDAO.save(almacen);
	}

	@Override
	public Mensajes mensajeXID(long id) {
		
		return iMensajesDAO.findById(id).get();
	}

	@Override
	public Mensajes actualizarMensaje(Mensajes almacen) {
		
		return iMensajesDAO.save(almacen);
	}

	@Override
	public void eliminarMensaje(long id) {
		
		iMensajesDAO.deleteById(id);
		
	}

}