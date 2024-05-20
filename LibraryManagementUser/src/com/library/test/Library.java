package com.library.test;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

	 
	// TODO Auto-generated method stub
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1.ADMIN \n2.USER  \n3.EXIT");
        while(true) 
        {
        	int adminUser=0;
    		while(sc.hasNext()) 
    		{
    		try {
    	        adminUser=sc.nextInt();
    	        break;
    	        
    		}
    		catch(InputMismatchException e) 
    		{
    			System.out.println(e);
    			sc.nextLine();
    			
    		}
    		 
    		}
            
        
		
        switch(adminUser)
		{
		case 1:
	
			System.out.println("ADMIN NAME:");
			LibraryValidation.usernameLoginAdmin();
            
			System.out.println("ADMIN PASSWORD:");
			LibraryValidation.passwordLoginAdmin();
			
			System.out.println("        -------WELCOME ADMIN--------");
			
			System.out.println("1.ADD A BOOK"+"\n"+"2.DELETE A BOOK"+"\n"+"3.UPDATE A BOOK"+"\n"+"4.VIEW ALL");
			System.out.println("-------------------------------------");
			int addDelete=LibraryValidation.addBook();
			LibraryBussinessLogic.toSelectAddDelte(addDelete);

			
	        return;
			
		case 2:
			LibraryUser.libraryUserPortal();
            return;
		case 3:
			 System.out.println("Exited Successfully");

			 return;
	    default:
	    	System.out.println("Select the 1- user or 2-admin or 3-exit");
	  
		}
		}
		}

}
	


	







