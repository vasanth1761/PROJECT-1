package com.library.model;

import java.time.LocalDate;

public class LibraryP {
	
	   String userId;
	   String username;
	   String password;
	   String date;
	   String bookname;
	   int bookpart;
	   int  days;
	   String limitdate;
	   public String getUserId() {
	   return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String  d) {
		this.date =  d;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookpart() {
		return bookpart;
	}
	public void setBookpart(int bookpart) {
		this.bookpart = bookpart;
	}
	
	public void setPassword(String password) {
		this.password = password;
		
	}
	public String getPassword() {
		return password;
	}
	public void setDays(int days) {
		this.days = days;
		
	}
	public int  getDays() {
		return days;
	}
	
	
	
	public LibraryP(String userId, String username, String date, String bookname, int bookpart, int days,
			double amount, long phonenumber, String password,String limitdate) {
		super();
		this.userId = userId;
		this.username = username;
		this.date = date;
		this.bookname = bookname;
		this.bookpart = bookpart;
	    this.password = password;
	    this.days=days;
	    this.limitdate=date;
	}
	public String getLimitdate() {
		return limitdate;
	}
	public void setLimitdate(String limitdate) {
		this.limitdate = limitdate;
	}
	public LibraryP() {
		// TODO Auto-generated constructor stub
	}


}
