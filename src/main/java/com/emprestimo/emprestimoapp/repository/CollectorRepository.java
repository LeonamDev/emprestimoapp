package com.emprestimo.emprestimoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emprestimo.emprestimoapp.modelo.Collector;

@Repository
public interface CollectorRepository extends JpaRepository<Collector, Long> {

	Collector findOne(Long id);



}
