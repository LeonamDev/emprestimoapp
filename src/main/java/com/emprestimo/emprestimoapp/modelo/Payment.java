package com.emprestimo.emprestimoapp.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	

	@Id
	@GeneratedValue
	private Long paymentID;
	
	private Date dateOfPayment;
	
	private float amountOfPayment;
	
	private String remarkers;

	/**
	 * @return the paymentID
	 */
	public Long getPaymentID() {
		return paymentID;
	}

	/**
	 * @param paymentID the paymentID to set
	 */
	public void setPaymentID(Long paymentID) {
		this.paymentID = paymentID;
	}

	/**
	 * @return the dateOfPayment
	 */
	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	/**
	 * @param dateOfPayment the dateOfPayment to set
	 */
	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	/**
	 * @return the amountOfPayment
	 */
	public float getAmountOfPayment() {
		return amountOfPayment;
	}

	/**
	 * @param amountOfPayment the amountOfPayment to set
	 */
	public void setAmountOfPayment(float amountOfPayment) {
		this.amountOfPayment = amountOfPayment;
	}

	/**
	 * @return the remarkers
	 */
	public String getRemarkers() {
		return remarkers;
	}

	/**
	 * @param remarkers the remarkers to set
	 */
	public void setRemarkers(String remarkers) {
		this.remarkers = remarkers;
	}
	
	
	
	
	

}
