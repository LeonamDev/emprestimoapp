package com.emprestimo.emprestimoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmprestimoCtrl {
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		return "home";
	}

}
