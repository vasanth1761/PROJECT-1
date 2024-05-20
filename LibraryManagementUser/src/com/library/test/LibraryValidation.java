package com.library.test;

import java.util.LinkedList;
import java.util.Scanner;

public class LibraryValidation {

	public static void usernameLoginAdmin()
	{    
		Scanner sc=new Scanner(System.in);
		LinkedList<String> li=new LinkedList<String>();
		li.add("vasanth");
		li.add("chandru");
		li.add("guru");
		String userName=sc.next();
		while(true)
		{
			if(li.contains(userName))
			{
			break;
			}
			else
			{
				System.err.println("INVALID USER NAME ");
				System.out.println("Enter the user name again:");
				userName=sc.next();
			}
		}
	}
	public static void passwordLoginAdmin()
	{   
		Scanner sc=new Scanner(System.in);
//		String password1="Vasanth1761";
		LinkedList<String> pas=new LinkedList<String>();
		pas.add("Vasanth1761");
		pas.add("vasanth");
		String password=sc.next();
		while(true)
		{
			if(pas.contains(password))
			{
				break;
			}
			else
			{
				System.err.println("INVALID PASSWORD");
				System.out.println("Enter the password again");
				password=sc.next();
			}
		}
		
	}

	  
	public static int addBook()
	{
		Scanner sc=new Scanner(System.in);
	    int add=sc.nextInt();
		while(true)
		{
			
			if(add ==1||add==2||add==3||add==4)
			{
				return add;
			}
			else
			{
				System.err.printf("Invalid!!!");
				System.err.println("you only able to add ,delete ,update ,view:");
				System.err.println("You should enter the alpha numeric value:");
	    		add=sc.nextInt();
			}
		}
	}

	

	public static int books()
	{
		Scanner sc=new Scanner(System.in);
		int books=sc.nextInt();
		while(true)
		{
			if(books>0)
			{
				return books;
			}
			else
			{
				System.err.println("you should enter the numeric value:");
				 books=sc.nextInt();
			}
		}
	}
	public static String UserId()
	{   
		String s1="^[A-Za-z]+[0-9]+$";
		Scanner sc=new Scanner(System.in);
		String userId=sc.next();
		while(true)
		{
			if(userId.matches(s1))
			{
				return userId;
			}
			else
			{
				System.err.println("INVALID!!! value ");
				System.out.println("You should enter the alphanumeric value");
				userId=sc.next();
				
			}
		}
	}
	 public static String usernameValidation()
	 {   
		 String s1="^[a-zA-Z]+$";
		 
			
		 Scanner sc=new Scanner(System.in);
		 String name=sc.next();
			while(true)
			{     
				if(name.matches(s1))
				{
				return name;
					
				}
				else
				{   
					System.err.println("INVALID!!!! value");
					System.err.println("you should use uppercase or  lowercase:");
					name=sc.next();
				}
			}
	 }
	 
	 public static String passwordValidation()
	 {
		 
		 String s2="(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*\\d).{5,}";
		 Scanner sc=new Scanner(System.in);
		 String password=sc.next();
	    while(true)
		{
			if(password.matches(s2))
			{
				return password;
			}
			else
			{   
				System.err.println("INVALID!!!! value");
				System.err.println("you must use one uppercase:");
				System.err.println("you must  use one Lowercaase:");
				System.err.println("you must use one Specialcase:");
				System.err.println("you must use one numeric value:");
				System.err.println("The password length should be minimum 5:");
				
				password=sc.next();
			}
		}
	 }
	  

	public static Long phoneNumberValidation()
	{  
		Scanner sc=new Scanner(System.in);
		long phone=sc.nextLong();
		while(true)
		{
			if(phone>0)
			{
			return phone;
			}
		   else
		   {   
			   
			   System.out.println("Enter the mobile number again");
			   phone=sc.nextInt();
		   }
		}
	}

	public static int bookPartValidation() 
	{
		Scanner sc=new Scanner(System.in);
		int part=sc.nextInt();
		while(true)
		{
			if(part==1||part==2)
			{
				return part;
			}
			else
			{   
				System.err.println("PART IS NOT AVAILABLE:");
				System.out.println("Available books are mentioned above");
				part=sc.nextInt();
			}
		}
		
	}
	public static int bookTypeValid()
	{
		Scanner sc=new Scanner(System.in);
		int type = sc.nextInt();
		while(true)
		{
			if(type==1||type==2||type==3)
			{
				return type;
			}
			else
			{
				System.err.println("Enter the mention book above");
				type = sc.nextInt();
				
			}
		}
		
		
	}
	
	
	}





