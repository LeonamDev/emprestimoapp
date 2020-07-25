package com.emprestimo.emprestimoapp.service;

import java.util.List;

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

	public Customer findOne(String id) {
		return customerRepository.findById(Long.valueOf(id)).get();
	}

	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Transactional
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}

	public CustomerService(CustomerRepository customerRepository) {

		this.customerRepository = customerRepository;
	}

}
