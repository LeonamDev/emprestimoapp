package com.emprestimo.emprestimoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emprestimo.emprestimoapp.modelo.Customer;
import com.emprestimo.emprestimoapp.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Optional<Customer> findOne(Integer id) {
		return customerRepository.findById(id);
	}

	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Transactional
	public void delete(Integer id) {
		customerRepository.deleteById(id);
	}

	public CustomerService(CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}

}
