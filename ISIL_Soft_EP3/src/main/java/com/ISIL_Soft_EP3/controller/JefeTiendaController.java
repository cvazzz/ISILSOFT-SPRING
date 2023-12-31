package com.ISIL_Soft_EP3.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ISIL_Soft_EP3.entity.JefeTienda;
import com.ISIL_Soft_EP3.repository.JefeTiendaRepository;



@Controller
@RequestMapping("/JefeTienda") /*Asi se le coloca un nombre a un controlador*/
public class JefeTiendaController {

	@Autowired
	JefeTiendaRepository jefeTiendaRepository;
	
	@PostMapping(value="/registrar")
	public String registrar(HttpServletRequest request, @ModelAttribute("objJefeTienda") JefeTienda objJefeTienda, Model model) {
		jefeTiendaRepository.save(objJefeTienda);
		List<JefeTienda> listaJefeTienda = jefeTiendaRepository.findAll();
		model.addAttribute("listaJefeTienda", listaJefeTienda);
		return "gestionJefeTienda";
	}
	
	
	@PostMapping(value="/mostrarNuevoJefeTienda")
	public String mostrarJefeTienda(HttpServletRequest request, Model model) {
		JefeTienda objJefeTienda = new JefeTienda();
		model.addAttribute("objJefeTienda", objJefeTienda);
		return "nuevoJefeTienda";
	}
}