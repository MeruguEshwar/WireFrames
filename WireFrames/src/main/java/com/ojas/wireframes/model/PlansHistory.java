package com.ojas.wireframes.model;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PlansHistory {

	@Id
	@GenericGenerator(strategy = "increment", name = "mygenerator")
	@GeneratedValue(generator="mygenerator",strategy=GenerationType.AUTO)
	private LocalDate publishedDate;
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
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	public PlansHistory(int id, String palneName, double price, double storage, String descrption, LocalDate publishedDate) {
		this.id = id;
		this.palneName = palneName;
		this.price = price;
		this.storage = storage;
		this.descrption = descrption;
		this.publishedDate = publishedDate;
	}
	
	public PlansHistory() {
		
	}
	
}
