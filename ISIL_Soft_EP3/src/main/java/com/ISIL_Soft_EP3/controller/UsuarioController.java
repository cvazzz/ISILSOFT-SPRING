package com.ISIL_Soft_EP3.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.ISIL_Soft_EP3.entity.Usuario;
import com.ISIL_Soft_EP3.repository.JefeTiendaRepository;
import com.ISIL_Soft_EP3.repository.UsuarioRepository;





@Controller
@RequestMapping("/home") /*Asi se le coloca un nombre a un controlador*/
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired  // Agrega esta línea
    JefeTiendaRepository jefeTiendaRepository;
	
	@RequestMapping(value="/validarUsuario", method=RequestMethod.POST)
	public String validarUsuario(HttpServletRequest request, @RequestParam("correo") String correo, @RequestParam("password")String password) {
		String pagina;
		Usuario objUsuario = usuarioRepository.findByCorreoAndPassword(correo, password);
		if (objUsuario!=null) {
			pagina = "principal";
		}
		else {
			pagina = "index";
		}
		return pagina;
	}
	
	@GetMapping(value="/mostrarJefeTienda")
	public String mostrarJefeTienda(HttpServletRequest request) {
		return "gestionJefeTienda";
	}

	
}