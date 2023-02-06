package com.ojas.wireframes.entity;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PLANSHISTORY")
public class PlansHistoryEntity {

	@Id
	private LocalDateTime publishedDate;
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
	public LocalDateTime getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDateTime localDate) {
		this.publishedDate = localDate;
	}
	
	public PlansHistoryEntity(int id, String palneName, double price, double storage, String descrption, LocalDateTime publishedDate) {
		this.id = id;
		this.palneName = palneName;
		this.price = price;
		this.storage = storage;
		this.descrption = descrption;
		this.publishedDate = publishedDate;
	}
	
	public PlansHistoryEntity() {
		
	}
	
}
