package com.library.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.library.dao.BookImpl;
import com.library.model.LibraryP;

public class LibraryUser {
	
	public static void libraryUserPortal() throws ClassNotFoundException, SQLException
	{    
		
	    BookImpl loginobj=new BookImpl();
		Scanner sc=new Scanner(System.in);
		LibraryP lib=new LibraryP();
		System.out.println("         --WELCOME TO LIBRARAY-- ");
		System.out.println("DO you have an Account press (Y/N):");
		String account=sc.next();
	    LibraryBussinessLogic.loginCalc( account,lib);
	    System.out.println("     ------WELCOME------");
	    System.out.println("----------------------------");
		System.out.println("Available book types are:");
	    loginobj.read();
//		System.out.println("----COMICS----");
//		System.out.println("----HORROR----");
//		System.out.println("----SCIENCE FICTION----");
//		System.out.println("----ADVENTURE----");
//		System.out.println("----FANTASY----");
//		System.out.println("-----------------------------");
//		System.out.println("Enter the book type:");
//		
		LibraryBussinessLogic.bookTypes();
		System.out.println("------------------------------");
	    System.out.println("Enter the number of days that you have a book:");
		int days=sc.nextInt();
		System.out.println("-------------------------------");
		while(true)
		{
			if(days>0)
			{
			break;
			}
		   else
		   {
			   System.out.println("Enter the valid data");
			   days=sc.nextInt();
		   }
		}
		lib.setDays(days);
		LibraryEnd a=new LibraryEnd();
		a.libraryOutput(lib.getDays());

		}
}
