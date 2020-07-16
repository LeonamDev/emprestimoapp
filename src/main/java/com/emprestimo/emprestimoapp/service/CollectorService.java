package com.emprestimo.emprestimoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emprestimo.emprestimoapp.modelo.Collector;
import com.emprestimo.emprestimoapp.repository.CollectorRepository;

@Service
public class CollectorService {

	@Autowired
	private CollectorRepository collectorRepository;

	public List<Collector> findAll() {
		return collectorRepository.findAll();
	}

	public Optional<Collector> findOne(Integer id) {
		return collectorRepository.findById(id);
	}

	@Transactional
	public Collector save(Collector collector) {
		return collectorRepository.save(collector);
	}

	@Transactional
	public void delete(Integer id) {
		collectorRepository.deleteById(id);
	}

	public CollectorService(CollectorRepository collectorRepository) {

		this.collectorRepository = collectorRepository;
	}

}
