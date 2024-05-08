package com.library.model;

public class LibraryP {
	
	   String name;
	   int id;
	   String book;
	   int days;
	   double amount;
	   long phonenumber;
	   String password;
	   public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phoneNumber) {
		this.phonenumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


}
