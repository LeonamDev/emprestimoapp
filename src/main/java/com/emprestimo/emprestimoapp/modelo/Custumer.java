package com.emprestimo.emprestimoapp.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Custumer {
	
	@Id
	@GeneratedValue
	private Integer custumerNumber;
	
	private String custumerName;
	
	private String address;
	
	/**
	 * @return the custumerNumber
	 */
	public Integer getCustumerNumber() {
		return custumerNumber;
	}


	/**
	 * @param custumerNumber the custumerNumber to set
	 */
	public void setCustumerNumber(Integer custumerNumber) {
		this.custumerNumber = custumerNumber;
	}


	/**
	 * @return the custumerName
	 */
	public String getCustumerName() {
		return custumerName;
	}


	/**
	 * @param custumerName the custumerName to set
	 */
	public void setCustumerName(String custumerName) {
		this.custumerName = custumerName;
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
