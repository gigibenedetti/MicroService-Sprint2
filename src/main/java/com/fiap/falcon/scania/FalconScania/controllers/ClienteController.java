package com.fiap.falcon.scania.FalconScania.controllers;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.falcon.scania.FalconScania.dto.ClienteDto;
import com.fiap.falcon.scania.FalconScania.model.Cliente;
import com.fiap.falcon.scania.FalconScania.repositories.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	
	@GetMapping("/login")
	public ModelAndView login(ClienteDto model) {
		return new ModelAndView("cliente/login");
	}
	
	@GetMapping("/register")
	public ModelAndView register(ClienteDto model) {
		return new ModelAndView("cliente/register");
	}
	
	@GetMapping("cliente/bloqueado")
	public String bloqueado()
	{
		return "cliente/register";
	}
	
	@PostMapping("/login")
	public ModelAndView salvar(@Valid ClienteDto model, BindingResult bindingResult) 
	{
		if(bindingResult.hasErrors()) {
			ModelAndView modelView = new ModelAndView("cliente/register");
			return modelView;
		}
		
		Cliente cliente = modelMapper.map(model, Cliente.class);
		clienteRepository.save(cliente);
		return new ModelAndView("redirect:/");
	}
}
