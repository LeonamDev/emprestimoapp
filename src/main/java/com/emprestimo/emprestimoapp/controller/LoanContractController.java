package com.emprestimo.emprestimoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emprestimo.emprestimoapp.modelo.LoanContract;
import com.emprestimo.emprestimoapp.service.LoanContractService;

public class LoanContractController {

	@Autowired
	private LoanContractService loanContractService;

	@GetMapping("/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/listar");
		mv.addObject("lista", loanContractService.findAll());

		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add(LoanContract loanContract) {

		ModelAndView mv = new ModelAndView("/loanContractAdd");
		mv.addObject("loanContract", loanContract);

		return mv;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {

		return add(loanContractService.findOne(id));
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Integer id) {

		loanContractService.delete(id);

		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(LoanContract loanContract, BindingResult result) {

		if (result.hasErrors()) {
			return add(loanContract);
		}

		loanContractService.save(loanContract);

		return findAll();
	}

}
