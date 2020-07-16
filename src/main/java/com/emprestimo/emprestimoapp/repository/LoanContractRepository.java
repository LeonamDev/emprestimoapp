package com.emprestimo.emprestimoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emprestimo.emprestimoapp.modelo.LoanContract;

@Repository
public interface LoanContractRepository extends JpaRepository<LoanContract, Integer> {

}
