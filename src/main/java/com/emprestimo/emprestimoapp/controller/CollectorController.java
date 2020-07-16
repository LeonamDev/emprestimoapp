package com.emprestimo.emprestimoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emprestimo.emprestimoapp.modelo.Collector;
import com.emprestimo.emprestimoapp.service.CollectorService;

@Controller
public class CollectorController {

	@Autowired
	private CollectorService collectorService;

	@GetMapping("/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/listar");
		mv.addObject("lista", collectorService.findAll());

		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add(Collector collector) {

		ModelAndView mv = new ModelAndView("/collectorAdd");
		mv.addObject("collector", collector);

		return mv;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(collectorService.findOne(id));
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {

		collectorService.delete(id);

		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(Collector collector, BindingResult result) {

		if (result.hasErrors()) {
			return add(collector);
		}

		collectorService.save(collector);

		return findAll();
	}

}
