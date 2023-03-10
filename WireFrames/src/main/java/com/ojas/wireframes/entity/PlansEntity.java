package com.ojas.wireframes.entity;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PLANS")
@SQLDelete(sql = "UPDATE PLANS SET visible = true WHERE id=?")
@Where(clause = "visible=false")
public class PlansEntity {

	@Id
	@GeneratedValue(generator="mygenerator",strategy=GenerationType.AUTO)
	@GenericGenerator( name = "mygenerator",strategy = "increment")
	private int id;
	private String palneName;
	private double price;
	private double storage;
	private String descrption;

	private boolean visible;
	
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
