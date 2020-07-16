package com.emprestimo.emprestimoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emprestimo.emprestimoapp.modelo.LoanContract;
import com.emprestimo.emprestimoapp.repository.LoanContractRepository;

@Service
public class LoanContractService {

	@Autowired
	private LoanContractRepository loanContractRepository;

	public List<LoanContract> findAll() {
		return loanContractRepository.findAll();
	}

	public Optional<LoanContract> findOne(Integer id) {
		return loanContractRepository.findById(id);
	}

	@Transactional
	public LoanContract save(LoanContract LoanContract) {
		return loanContractRepository.save(LoanContract);
	}

	@Transactional
	public void delete(Integer id) {
		loanContractRepository.deleteById(id);
	}

	public LoanContractService(LoanContractRepository loanContractRepository) {
		
		this.loanContractRepository = loanContractRepository;
	}
	
	
}
