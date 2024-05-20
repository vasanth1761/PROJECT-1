package com.library.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.library.dao.BookImpl;
import com.library.model.LibraryP;

public class LibraryBussinessLogic {
	
	public static void loginCalc(String account, LibraryP lib)throws ClassNotFoundException,SQLException {

		Scanner sc = new Scanner(System.in);
     	BookImpl loginoobj=new BookImpl();
		
		while (true) {

			if (account.equals("y") || account.equals("Y")) {
//				BookImpl loginoobj=new BookImpl();
				
				
//				System.out.println("---WELCOME TO LOGIN PAGE----");
//				System.out.println("USERNAME:");
//				String user = ValidationmainBody.usernameValidation();
//
//				System.out.println("PASSWORD:");
//				String password = ValidationmainBody.passwordValidation();
//                
//				long phoneNumber = 97865432165l;
//				int id = 101;
//				lib.setName(user);
//				lib.set
//				lib.setPhonenumber(phoneNumber);
//				lib.setId(id);
				String id=loginoobj.login();
				break;

			} else if (account.equals("N") || account.equals("n")) {
				System.out.println("---WELCOME TO SIGNUP PAGE----");
//				System.out.println("Enter the user name:");
//				String user = ValidationmainBody.usernameValidation();
//
//				System.out.println("create the password:");
//				String passwor = ValidationmainBody.passwordValidation();
//
//				System.out.println("Enter the phonenumber:");
//				Long phone = ValidationmainBody.phoneNumberValidation();
//
//				int id = 101;
//				lib.setName(user);
//				lib.setPhonenumber(phone);
//				lib.setId(id);
//				lib.setName(user);
				String id=loginoobj.register();
				break;
			} else 
			{
				System.err.println("Enter the valid data:");
				account = sc.next();
			}

		}
	}

	public static void bookTypes()throws ClassNotFoundException,SQLException  {
	    BookImpl obj2=new BookImpl();
	    String type = obj2.select();
	    obj2.bookname(type);
	    String bookname = obj2.bookname1();
	    int bookpart=obj2.bookPart(bookname);
	    BookImpl.insertTableUser();
	    
	    
	    
	    
//		Scanner sc = new Scanner(System.in);
//		boolean b = true;
//		while (b) {
//
//			String book = sc.next();
//			switch (book.toLowerCase()) {
//			case "comics":
//				System.out.println("---GREAT---");
//				System.out.println("Available");
//				System.out.println("1.IRONMAN" + "\n" + "2.SUPERMAN" + "\n" + "3.DEADPOOL");
//				System.out.println("Select the type:");
//				int typ=LibraryValidation.bookTypeValid();
//      
//		        switch (typ) {
//				case 1:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 2:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 3:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				default:
//					System.out.println("The book is not available");
//					System.out.println("Enter the proper book name");
//				}
//				
//				b = false;
//				break;
//			case "horror":
//				System.out.println("---GREAT---");
//				System.out.println("Available");
//				System.out.println("1.DRACULA" + "\n" + "2.IT" + "\n" + "3.PET SEMETARY");
//				System.out.println("Select the type:");
//				int horror =LibraryValidation.bookTypeValid();
//				
//					switch (horror)
//
//					{
//					case 1:
//						System.out.println("part 1 or part2");
//						LibraryValidation.bookPartValidation();
//						System.out.println("-The book is available-");
//						break;
//					case 2:
//						System.out.println("part 1 or part2");
//						LibraryValidation.bookPartValidation();
//						System.out.println("-The book is available-");
//						break;
//					case 3:
//						System.out.println("part 1 or part2");
//						LibraryValidation.bookPartValidation();
//						System.out.println("-The book is available-");
//						break;
//					
//				}
//				b = false;
//				break;
//			case "science fiction":
//				System.out.println("---GREAT---");
//				System.out.println("Available");
//				System.out.println("1.STATION ELEVAN" + "\n" + "2.DUNE" + "\n" + "3.THE MARTIAN");
//				System.out.println("Select the type:");
//				int science = LibraryValidation.bookTypeValid();;
//				switch (science) {
//				case 1:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 2:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 3:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				}
//				b = false;
//				break;
//			case "adventure":
//				System.out.println("---GREAT---");
//				System.out.println("Available");
//				System.out.println("1.THE ROAD" + "\n" + "2.HARRY PORTER" + "\n" + "3.TREASURE ISLANDS");
//				System.out.println("Select the type:");
//				int adventure = LibraryValidation.bookTypeValid();;
//				switch (adventure) {
//				case 1:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 2:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 3:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				}
//				b = false;
//				break;
//			case "fantasy":
//				System.out.println("---GREAT---");
//				System.out.println("Available");
//
//				System.out.println("1.GAME OF THRONES" + "\n" + "2.THE HOUSE OF DRAGONS" + "\n" + "3.CITY OF GLASS+" );
//				System.out.println("Select the type:");
//				int fantasy =LibraryValidation.bookTypeValid();
//				switch (fantasy) {
//				case 1:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 2:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				case 3:
//					System.out.println("part 1 or part2");
//					LibraryValidation.bookPartValidation();
//					System.out.println("-The book is available-");
//					break;
//				}
//				b = false;
//			default:
//				System.out.println("Enter the valid data");
//
//			}
//		}
	}

	public static void toSelectAddDelte(int addDelete)throws ClassNotFoundException,SQLException

	{
		Scanner sc = new Scanner(System.in);
		BookImpl daoobj=new BookImpl();
		switch (addDelete) {
		case 1:
			daoobj.insert();
			break;
		case 2:

			daoobj.delete();
            break;
		case 3:
			daoobj.update();
			break;
		case 4:
			daoobj.viewAll();
			break;

		}

}
}

