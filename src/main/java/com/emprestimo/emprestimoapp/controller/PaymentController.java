/*package com.emprestimo.emprestimoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emprestimo.emprestimoapp.modelo.Payment;
import com.emprestimo.emprestimoapp.service.PaymentService;

public class PaymentController {


	@Autowired
	private PaymentService paymentService;

	@GetMapping("/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/listar");
		mv.addObject("lista", paymentService.findAll());

		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add(Payment payment) {

		ModelAndView mv = new ModelAndView("/paymentAdd");
		mv.addObject("payment", payment);

		return mv;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(paymentService.findOne(id));
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {

		paymentService.delete(id);

		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(Payment payment, BindingResult result) {

		if (result.hasErrors()) {
			return add(payment);
		}

		paymentService.save(payment);

		return findAll();
	}
	
}*/
