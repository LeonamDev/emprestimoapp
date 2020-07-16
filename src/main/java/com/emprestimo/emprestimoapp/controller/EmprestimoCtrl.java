package com.emprestimo.emprestimoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class EmprestimoCtrl {
	
	
	public String home(Model model) {
		return "home";
	}

}
