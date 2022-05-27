package com.fiap.falcon.scania.FalconScania.controllers;



import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.falcon.scania.FalconScania.dto.NotificacaoFurtoDto;
import com.fiap.falcon.scania.FalconScania.model.NotificacaoFurto;
import com.fiap.falcon.scania.FalconScania.repositories.NotificacaoFurtoRepository;

@Controller
public class NotificarController {

	@Autowired
	private NotificacaoFurtoRepository notificarRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/notificarFurto")
	public ModelAndView notificarFurto() {
		ModelAndView modelView = new ModelAndView("notificar/notificarFurto");
		return modelView;
	}	
	
	@GetMapping("/relatorio")
	public ModelAndView listarIncidentes() {
		ModelAndView model = new ModelAndView("dashboard/relatorio");

		List<NotificacaoFurto> listarIncidentes = notificarRepository.findAll();
		model.addObject("listarIncidentes", listarIncidentes);

		return model;
	}
	
	@PostMapping("/notificarFurto")
	public ModelAndView salvar(@Valid NotificacaoFurtoDto notificar, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("notificar/notificarFurto");
		}

		NotificacaoFurto notificarEntity = modelMapper.map(notificar, NotificacaoFurto.class);
		notificarRepository.save(notificarEntity);
		return new ModelAndView("redirect:/relatorio");
	}
	
	@GetMapping("notificacao/{id}")
	public ModelAndView mostrar(@PathVariable Long id) {
		Optional<NotificacaoFurto> notificar = notificarRepository.findById(id);

		if (notificar.isPresent()) {
			NotificacaoFurto notificarGet = notificar.get();
			ModelAndView modelView = new ModelAndView("notificar/detalhe");
			modelView.addObject("notificacao", notificarGet);
			return modelView;
		}
		System.out.println("não encontrado!");
		return new ModelAndView("redirect:/relatorio");
	}
	
	@GetMapping("/notificacao/{id}/edit")
	public ModelAndView edit(@PathVariable Long id, NotificacaoFurtoDto request) {
		Optional<NotificacaoFurto> optionalNotificar = notificarRepository.findById(id);

		if (optionalNotificar.isPresent()) {
			NotificacaoFurto notificar = optionalNotificar.get();
			request.fromNotificacaoFurto(notificar);
			ModelAndView model = new ModelAndView("notificar/edit");
			model.addObject("notificarId", notificar.getId_notificacao_furto());
			return model;
		}

		//
		return new ModelAndView("redirect:/notificar/notificarFurto");
	}
	
	@PostMapping("/notificacao/{id}")
	public ModelAndView update(@PathVariable Long id, @Valid NotificacaoFurtoDto request, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			ModelAndView model = new ModelAndView("notificar/edit");
			model.addObject("notificarId", id);
			return model;
		}
		
		Optional<NotificacaoFurto> optionalNotificar = notificarRepository.findById(id);
		
		if(optionalNotificar.isPresent()){
			NotificacaoFurto notificar = modelMapper.map(request, NotificacaoFurto.class);
			notificar.setId_notificacao_furto(id);
			notificarRepository.save(notificar);
			return new ModelAndView("redirect:/notificarFurto/".concat(notificar.getId_notificacao_furto().toString()));
		}
		
		return new ModelAndView("redirect:/relatorio");
	}
	
	@GetMapping("/notificacao/{id}/delete")
	public ModelAndView delete(@PathVariable Long id) {
		ModelAndView model = new ModelAndView("redirect:/relatorio");
		
		this.notificarRepository.deleteById(id);
		model.addObject("mensagem", "Notificação deletada com sucesso!");
		return model;
	}
}
