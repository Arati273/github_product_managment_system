package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Supplier {

	@Id
	private int supplierid;
	private String suppliername;
	private String suppliercontact;
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSuppliercontact() {
		return suppliercontact;
	}
	public void setSuppliercontact(String suppliercontact) {
		this.suppliercontact = suppliercontact;
	}
	
	
	
	
}
