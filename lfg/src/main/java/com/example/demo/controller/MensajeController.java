package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Mensajes;
import com.example.demo.dto.Salas;
import com.example.demo.dto.Usuarios;
import com.example.demo.service.MensajesServiceImpl;
import com.example.demo.service.SalasServiceImpl;
import com.example.demo.service.UsuariosServiceImpl;

@RestController
@RequestMapping("/api")
public class MensajeController {
	
	@Autowired
	MensajesServiceImpl mensajesServiceImpl;
	
	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/mensajes")
	public List<Mensajes> listarAlmacenes(){
		return mensajesServiceImpl.listarMensajes();
	}
	
	@GetMapping("/mensajes/sala/{id}")
	public List<Mensajes> listarXSala(@PathVariable(name="id") long id){
		return mensajesServiceImpl.listarMensajesXSala(salasServiceImpl.salaXID(id));
	}
	
	@PostMapping("/mensajes")
	public Mensajes salvarAlmacenes(@RequestBody Mensajes departamento) {
		
		return mensajesServiceImpl.guardarMensaje(departamento);
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensajes almacenXID(@PathVariable(name="id") long id) {
		
		Mensajes almacen_xid = new Mensajes();
		
		almacen_xid = mensajesServiceImpl.mensajeXID(id);
		
		System.out.println("Usuario XID: " + almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/mensajes/{id}")
	public Mensajes actualizarAlmacen(@PathVariable(name="id")long id,@RequestBody Mensajes almacen) {
		
		Mensajes almacen_seleccionado= new Mensajes();
		Mensajes almacen_actualizado= new Mensajes();
		
		almacen_seleccionado= mensajesServiceImpl.mensajeXID(id);
		
		almacen_seleccionado.setContenido(almacen.getContenido());
		almacen_seleccionado.setSala(almacen.getSala());
		almacen_seleccionado.setUsuario(almacen.getUsuario());
		
		almacen_actualizado = mensajesServiceImpl.actualizarMensaje(almacen_seleccionado);
		
		System.out.println("El usuario actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/mensajes/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")long id) {
		mensajesServiceImpl.eliminarMensaje(id);
	}

}