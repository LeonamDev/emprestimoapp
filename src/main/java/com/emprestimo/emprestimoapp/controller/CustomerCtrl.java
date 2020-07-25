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
import com.emprestimo.emprestimoapp.modelo.LoanContract;
import com.emprestimo.emprestimoapp.service.CustomerService;
import com.emprestimo.emprestimoapp.service.LoanContractService;

@Controller
public class CustomerCtrl {

	@Autowired
	private CustomerService service;
	
	@Autowired
	private LoanContractService loanService;

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
		if (customer.getCustomerNumber() != null) {
			Customer customerOld = service.findOne(customer.getCustomerNumber().toString());
			customerOld.setCustomerName(customer.getCustomerName());
			service.save(customerOld);
		}
		service.save(customer);
		return "redirect:/";
	}

	@GetMapping(value = "/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		service.delete(id);
		return "redirect:/";
	}

	@GetMapping(value = "/formedit/{id}")
	public String formedit(@PathVariable("id") String id, Model model) {

		Customer customer = service.findOne(id);
		model.addAttribute("Customer", customer);

		return "emprestimo/formEditCustomer";
	}
	
	@GetMapping(value ="/emprestimo/{id}")
	public String formEmprestimo(Model model) {
		model.addAttribute("tipoForm", "Pegar");
		return "emprestimo/formEmprestimo";
	}
	
	@PostMapping(value = "/salvarEmprestimo")
	public String salvarEmprestimo(Model model, LoanContract loan) {
		if(loan.getContractID() != null) {
			LoanContract loanOld = loanService.findOne(loan.getContractID().toString());
			loanService.save(loanOld);
			return "redirect:/";
		}		
		
		loanService.save(loan);
		return "redirect:/";
	}

}
