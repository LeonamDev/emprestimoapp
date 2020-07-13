package com.emprestimo.emprestimoapp.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LoanContract {
	
	@Id
	@GeneratedValue
	private Integer contractID;
	
	private Date dateContractStarts;
	
	private Date dateContractEnds;
	
	private float interestDate;
	
	private float loanAmount;
	
	private float loanPaymentAmountDue;
	
	private float loanPaymentFrequency;
	
	private float loanPaymentDueDate;
	
	
	@ManyToOne
	private Custumer custumer;
	
	@ManyToOne
	private Collector collector;

	/**
	 * @return the contractID
	 */
	public Integer getContractID() {
		return contractID;
	}

	/**
	 * @param contractID the contractID to set
	 */
	public void setContractID(Integer contractID) {
		this.contractID = contractID;
	}

	/**
	 * @return the dateContractStarts
	 */
	public Date getDateContractStarts() {
		return dateContractStarts;
	}

	/**
	 * @param dateContractStarts the dateContractStarts to set
	 */
	public void setDateContractStarts(Date dateContractStarts) {
		this.dateContractStarts = dateContractStarts;
	}

	/**
	 * @return the dateContractEnds
	 */
	public Date getDateContractEnds() {
		return dateContractEnds;
	}

	/**
	 * @param dateContractEnds the dateContractEnds to set
	 */
	public void setDateContractEnds(Date dateContractEnds) {
		this.dateContractEnds = dateContractEnds;
	}

	/**
	 * @return the interestDate
	 */
	public float getInterestDate() {
		return interestDate;
	}

	/**
	 * @param interestDate the interestDate to set
	 */
	public void setInterestDate(float interestDate) {
		this.interestDate = interestDate;
	}

	/**
	 * @return the loanAmount
	 */
	public float getLoanAmount() {
		return loanAmount;
	}

	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * @return the loanPaymentAmountDue
	 */
	public float getLoanPaymentAmountDue() {
		return loanPaymentAmountDue;
	}

	/**
	 * @param loanPaymentAmountDue the loanPaymentAmountDue to set
	 */
	public void setLoanPaymentAmountDue(float loanPaymentAmountDue) {
		this.loanPaymentAmountDue = loanPaymentAmountDue;
	}

	/**
	 * @return the loanPaymentFrequency
	 */
	public float getLoanPaymentFrequency() {
		return loanPaymentFrequency;
	}

	/**
	 * @param loanPaymentFrequency the loanPaymentFrequency to set
	 */
	public void setLoanPaymentFrequency(float loanPaymentFrequency) {
		this.loanPaymentFrequency = loanPaymentFrequency;
	}

	/**
	 * @return the loanPaymentDueDate
	 */
	public float getLoanPaymentDueDate() {
		return loanPaymentDueDate;
	}

	/**
	 * @param loanPaymentDueDate the loanPaymentDueDate to set
	 */
	public void setLoanPaymentDueDate(float loanPaymentDueDate) {
		this.loanPaymentDueDate = loanPaymentDueDate;
	}

	/**
	 * @return the custumer
	 */
	public Custumer getCustumer() {
		return custumer;
	}

	/**
	 * @param custumer the custumer to set
	 */
	public void setCustumer(Custumer custumer) {
		this.custumer = custumer;
	}

	/**
	 * @return the collector
	 */
	public Collector getCollector() {
		return collector;
	}

	/**
	 * @param collector the collector to set
	 */
	public void setCollector(Collector collector) {
		this.collector = collector;
	}

	

}
