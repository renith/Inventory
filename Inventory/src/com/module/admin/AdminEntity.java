package com.module.admin;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class AdminEntity {
	 
	 @Id
	 @Column(name = "InventoryId")
	 @GeneratedValue
	 private Integer inventoryId;
	 
	 @Column(name = "Book_Name")
	 private String bookName;
	 
	 @Column(name = "Author")
	 private String author;
	 
	 @Column(name = "Nr_Books")
	 private String quantity;
	 
	 @Column(name = "price")
	 private double price;

	 public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	 
	
	

}
