package com.emprestimo.emprestimoapp.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Collector {
	
	@Id
	@GeneratedValue
	private Long collectorID;
	
	private String collectorName;
	

	/**
	 * @return the collectorID
	 */
	public Long getCollectorID() {
		return collectorID;
	}

	/**
	 * @param collectorID the collectorID to set
	 */
	public void setCollectorID(Long collectorID) {
		this.collectorID = collectorID;
	}

	/**
	 * @return the collectorName
	 */
	public String getCollectorName() {
		return collectorName;
	}

	/**
	 * @param collectorName the collectorName to set
	 */
	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}

	

}
