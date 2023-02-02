package com.ojas.wireframes.model;

import jakarta.persistence.Id;

public class Plans {

	@Id
	private int id;
	private String palneName;
	private double price;
	private double storage;
	private String descrption;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPalneName() {
		return palneName;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public void setPalneName(String palneName) {
		this.palneName = palneName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getStorage() {
		return storage;
	}
	public void setStorage(double storage) {
		this.storage = storage;
	}
	
	public Plans(int id, String palneName, double price, double storage,String descrption) {
		this.id = id;
		this.palneName = palneName;
		this.price = price;
		this.storage = storage;
		this.descrption=descrption;
	}
	
	
	public Plans() {
		
	}
	
	
}
