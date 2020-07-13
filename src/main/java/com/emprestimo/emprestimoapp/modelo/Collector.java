package com.emprestimo.emprestimoapp.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collector {
	
	@Id
	@GeneratedValue
	private Integer collectorID;
	
	private String collectorName;
	

	/**
	 * @return the collectorID
	 */
	public Integer getCollectorID() {
		return collectorID;
	}

	/**
	 * @param collectorID the collectorID to set
	 */
	public void setCollectorID(Integer collectorID) {
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
