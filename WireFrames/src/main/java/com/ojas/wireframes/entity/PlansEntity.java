package com.ojas.wireframes.entity;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlansEntity {

	@Id
	@GenericGenerator(strategy = "increment", name = "mygenerator")
	@GeneratedValue(generator="mygenerator",strategy=GenerationType.AUTO)
	private int id;
	private String palneName;
	private double price;
	private double storage;
	private String descrption;
	
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPalneName() {
		return palneName;
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
	
	public PlansEntity(int id, String palneName, double price, double storage,String descrption) {
		this.id = id;
		this.palneName = palneName;
		this.price = price;
		this.storage = storage;
		this.descrption=descrption;
	}
	
	public PlansEntity() {
		
	}
	
}
