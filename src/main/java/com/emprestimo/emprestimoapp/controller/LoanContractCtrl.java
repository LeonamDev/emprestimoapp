/*
 * package com.emprestimo.emprestimoapp.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.emprestimo.emprestimoapp.modelo.Customer; import
 * com.emprestimo.emprestimoapp.modelo.LoanContract; import
 * com.emprestimo.emprestimoapp.service.CustomerService; import
 * com.emprestimo.emprestimoapp.service.LoanContractService;
 * 
 * @Controller public class LoanContractCtrl {
 * 
 * @Autowired private LoanContractService service;
 * 
 * @GetMapping(value = "/") public String listaCustomer(Model model) {
 * List<LoanContract> loancontract = service.findAll();
 * model.addAttribute("LoanContract", loancontract); return "home"; }
 * 
 * @GetMapping(value = "/cadastro") public String form(Model model) {
 * model.addAttribute("tipoForm", "Cadastro de"); return
 * "emprestimo/formContract"; }
 * 
 * @PostMapping(value = "/salvar") public String salvar(Model model,
 * LoanContract loancontract) { if (loancontract.getContractID() != null) {
 * LoanContract contractOld =
 * service.findOne(loancontract.getContractID().toString());
 * contractOld.setCustumer(loancontract.getCustumer());
 * service.save(loancontract); } service.save(loancontract); return
 * "redirect:/"; }
 * 
 * @GetMapping(value = "/delete/{id}") public String delete(@PathVariable(name =
 * "id") Long id) { service.delete(id); return "redirect:/"; }
 * 
 * @GetMapping(value = "/formedit/{id}") public String
 * formedit(@PathVariable("id") String id, Model model) {
 * 
 * LoanContract loancontract = service.findOne(id);
 * model.addAttribute("Contract", loancontract);
 * 
 * return "emprestimo/formEditContract"; }
 * 
 * }
 */