package com.emprestimo.emprestimoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emprestimo.emprestimoapp.modelo.Custumer;

@Repository
public interface CustomerRepository extends JpaRepository<Custumer, Integer>{

}
