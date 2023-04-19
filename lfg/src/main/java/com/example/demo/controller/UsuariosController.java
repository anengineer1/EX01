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
import com.example.demo.dto.Usuarios;
import com.example.demo.service.UsuariosServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuariosController {
	
	@Autowired
	UsuariosServiceImpl usuariosServiceImpl;
	
	@GetMapping("/usuarios")
	public List<Usuarios> listarAlmacenes(){
		return usuariosServiceImpl.listarUsuarios();
	}
	
	@PostMapping("/usuarios")
	public Usuarios salvarAlmacenes(@RequestBody Usuarios departamento) {
		
		return usuariosServiceImpl.guardarUsuario(departamento);
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuarios almacenXID(@PathVariable(name="id") String id) {
		
		Usuarios almacen_xid = new Usuarios();
		
		almacen_xid = usuariosServiceImpl.usuarioXID(id);
		
		System.out.println("Usuario XID: " + almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuarios actualizarAlmacen(@PathVariable(name="id")String id,@RequestBody Usuarios almacen) {
		
		Usuarios almacen_seleccionado= new Usuarios();
		Usuarios almacen_actualizado= new Usuarios();
		
		almacen_seleccionado= usuariosServiceImpl.usuarioXID(id);
		
		almacen_seleccionado.setEmail(almacen.getEmail());
		almacen_seleccionado.setName(almacen.getName());
		almacen_seleccionado.setSala(almacen.getSala());
		
		almacen_actualizado = usuariosServiceImpl.actualizarUsuario(almacen_seleccionado);
		
		System.out.println("El usuario actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")String id) {
		usuariosServiceImpl.eliminarUsuario(id);
	}

}