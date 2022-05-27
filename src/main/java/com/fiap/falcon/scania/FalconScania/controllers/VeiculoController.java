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

import com.fiap.falcon.scania.FalconScania.dto.VeiculoDto;
import com.fiap.falcon.scania.FalconScania.model.Veiculo;
import com.fiap.falcon.scania.FalconScania.repositories.VeiculoRepository;

@Controller
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/cadastrarVeiculo")
	public ModelAndView cadastrarVeiculo(VeiculoDto veiculo) {
		ModelAndView modelView = new ModelAndView("veiculo/cadastrarVeiculo");
		return modelView;
	}
	
	@PostMapping("/relatorio")
	public ModelAndView salvar(@Valid VeiculoDto veiculo, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("veiculo/cadastrarVeiculo");
		}

		Veiculo veiculoEntity = modelMapper.map(veiculo, Veiculo.class);
		veiculoRepository.save(veiculoEntity);
		return new ModelAndView("redirect:/relatorio");
	}
	
	@GetMapping("/veiculos/{id}")
	public ModelAndView mostrar(@PathVariable Long id) {
		Optional<Veiculo> veiculo = veiculoRepository.findById(id);

		if (veiculo.isPresent()) {
			Veiculo veiculoGet = veiculo.get();
			ModelAndView modelView = new ModelAndView("veiculos/detalhe");
			modelView.addObject("veiculo", veiculoGet);
			return modelView;
		}
		System.out.println("não encontrado!");
		return new ModelAndView("redirect:/relatorio");
	}
	
	@GetMapping("/veiculos/{id}/edit")
	public ModelAndView edit(@PathVariable Long id, VeiculoDto request) {
		Optional<Veiculo> optionalVeiculo = veiculoRepository.findById(id);

		if (optionalVeiculo.isPresent()) {
			Veiculo veiculo = optionalVeiculo.get();
			request.fromVeiculo(veiculo);
			ModelAndView model = new ModelAndView("veiculos/edit");
			model.addObject("veiculoId", veiculo.getId_veiculo());
			return model;
		}

		//
		return new ModelAndView("redirect:/relatorio");
	}
	
	@PostMapping("/veiculos/{id}")
	public ModelAndView update(@PathVariable Long id, @Valid VeiculoDto request, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			ModelAndView model = new ModelAndView("veiculos/edit");
			model.addObject("veiculoId", id);
			return model;
		}
		
		Optional<Veiculo> optionalVeiculo = veiculoRepository.findById(id);
		
		if(optionalVeiculo.isPresent()){
			Veiculo veiculo = modelMapper.map(request, Veiculo.class);
			veiculo.setId_veiculo(id);
			veiculoRepository.save(veiculo);
			return new ModelAndView("redirect:/relatorio".concat(veiculo.getId_veiculo().toString()));
		}
		
		return new ModelAndView("redirect:/relatorio");
	}

	@GetMapping("/veiculos/{id}/delete")
	public ModelAndView delete(@PathVariable Long id) {
		ModelAndView model = new ModelAndView("redirect:/relatorio");
		
		this.veiculoRepository.deleteById(id);
		model.addObject("mensagem", "Veiculo removido com sucesso!");
		return model;
	}
}
