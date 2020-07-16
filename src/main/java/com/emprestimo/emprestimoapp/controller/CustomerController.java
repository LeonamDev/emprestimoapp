package com.emprestimo.emprestimoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emprestimo.emprestimoapp.modelo.Customer;
import com.emprestimo.emprestimoapp.service.CustomerService;

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/listar");
		mv.addObject("lista", customerService.findAll());

		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add(Customer customer) {

		ModelAndView mv = new ModelAndView("/customerAdd");
		mv.addObject("customer", customer);

		return mv;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(customerService.findOne(id));
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {

		customerService.delete(id);

		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(Customer customer, BindingResult result) {

		if (result.hasErrors()) {
			return add(customer);
		}

		customerService.save(customer);

		return findAll();
	}

}
