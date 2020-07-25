package com.emprestimo.emprestimoapp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="CustomerNumber")
	private Long customerNumber;
	
	private String customerName;
	
	private String address;
	
	/**
	 * @return the customerNumber
	 */
	public Long getCustomerNumber() {
		return customerNumber;
	}


	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}


	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}


	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	
	
}
