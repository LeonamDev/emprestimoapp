package com.emprestimo.emprestimoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emprestimo.emprestimoapp.modelo.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
