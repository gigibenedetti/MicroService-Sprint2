package com.fiap.falcon.scania.FalconScania.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RelatorioController {

	@GetMapping("/relatorio")
	public ModelAndView relatorio() {
		return new ModelAndView ("dashboard/relatorio");
	}
}
