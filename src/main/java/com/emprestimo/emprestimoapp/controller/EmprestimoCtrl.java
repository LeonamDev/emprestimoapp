package com.emprestimo.emprestimoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emprestimo.emprestimoapp.modelo.Customer;
import com.emprestimo.emprestimoapp.service.CustomerService;


@Controller
public class EmprestimoCtrl {
	
	@Autowired
	private CustomerService service;
	
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String listaCostumer(Model model) {
		List<Customer> customer = service.findAll();
		model.addAttribute("customer", customer);
		return "home";
	}
	
	
	@RequestMapping( value = "/cadastro", method = RequestMethod.GET )
	public String form(Model model) {	
		model.addAttribute("tipoForm", "Cadastro de");
		return "emprestimo/formCustomer";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Model model, Customer customer ) {
		service.save(customer);		
		return "redirect:/";
	}	

}
