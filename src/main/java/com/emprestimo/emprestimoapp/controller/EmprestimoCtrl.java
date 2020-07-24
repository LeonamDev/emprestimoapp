package com.emprestimo.emprestimoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emprestimo.emprestimoapp.modelo.Customer;
import com.emprestimo.emprestimoapp.service.CustomerService;

@Controller
public class EmprestimoCtrl {

	@Autowired
	private CustomerService service;


	@GetMapping(value = "/")
	public String listaCustomer(Model model) {
		List<Customer> customer = service.findAll();
		model.addAttribute("customer", customer);
		return "home";
	}

	@GetMapping(value = "/cadastro")
	public String form(Model model) {
		model.addAttribute("tipoForm", "Cadastro de");
		return "emprestimo/formCustomer";
	}

	@PostMapping(value = "/salvar")
	public String salvar(Model model, Customer customer) {
		service.save(customer);
		return "redirect:/";
	}

	@GetMapping(value = "/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		service.delete(id);
		return "redirect:/";
	}

	@GetMapping(value = "/formedit/{id}")
	public ModelAndView formedit(@PathVariable(name = "id") Long id) {

		ModelAndView model = new ModelAndView();
		Customer customer = service.findOne(id);
		model.addObject("tipoForm", "Editar ");
		model.setViewName("emprestimo/formEditCustomer");
		return model;

	}

}
