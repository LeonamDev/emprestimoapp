package com.emprestimo.emprestimoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emprestimo.emprestimoapp.modelo.Payment;
import com.emprestimo.emprestimoapp.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}

	public Payment findOne(Long id) {
		return paymentRepository.findOne(id);
	}

	@Transactional
	public Payment save(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Transactional
	public void delete(Long id) {
		paymentRepository.deleteById(id);
	}

	public PaymentService(PaymentRepository paymentRepository) {

		this.paymentRepository = paymentRepository;
	}

}
