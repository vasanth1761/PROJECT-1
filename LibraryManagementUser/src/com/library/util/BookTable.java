package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookTable {
	public static Connection getConnection() throws ClassNotFoundException,SQLException
	 {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookduplicate", "root", "Vasanth@1761");
        return con ;
	 }


}