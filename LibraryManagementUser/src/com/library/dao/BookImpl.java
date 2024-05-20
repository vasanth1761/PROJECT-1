package com.library.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.library.model.LibraryP;
import com.library.test.LibraryValidation;
import com.library.util.BookTable;

public class BookImpl implements BookNameDAO {
   public static LibraryP objn1=new LibraryP();
	@Override
	public void read() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		{
			Connection con = BookTable.getConnection();
			String read = "SELECT*FROM bookname";
			PreparedStatement p = con.prepareStatement(read);
			ResultSet r = p.executeQuery();
			ResultSetMetaData rs = r.getMetaData();
			int columnnumber = rs.getColumnCount();
			while (r.next()) {
				for (int i = 1; i <= columnnumber; i++) {
					String columnvalue = r.getString(i);
					System.out.println(rs.getColumnName(i) + ":" + columnvalue);
				}
				System.out.println("");
			}
		}
	}

	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		read();
		Connection connection = BookTable.getConnection();
		System.out.println("Enter the book name: ");
		String name = sc.nextLine();
		System.out.println("Enter the book no:");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book type:");
		String type = sc.nextLine();
		System.out.println("Enter the part book: ");
		int book = sc.nextInt();
		sc.nextLine();
		String query = "INSERT into bookname VALUES(?,?,?,?)";
		PreparedStatement p = connection.prepareStatement(query);
		p.setInt(1, no);
		p.setString(2, name);
		p.setString(3, type);
		p.setInt(4, book);
		int rows = p.executeUpdate();
		read();
		System.out.println("The book has successfully added");

	}

	public String login() throws ClassNotFoundException, SQLException {
		
//		LibraryValidation li=new LibraryValidation();
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		System.out.println("Enter the userid");
//		String id=sc.next();
		String id = LibraryValidation.UserId();
		objn1.setUserId(id);

		System.out.println("Enter the username");
//		String name=sc.next();

		String name = LibraryValidation.usernameValidation();
		objn1.setUsername(name);
		System.out.println("Enter the password:");

//		String password=sc.next();
		String password = LibraryValidation.passwordValidation();
		objn1.setPassword(password);
		String query = "SELECT user_id ,user_name, user_password FROM loginregister WHERE user_id=?AND user_name=?AND user_password=? ";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, objn1.getUserId());
		p.setString(2, objn1.getUsername());
		p.setString(3, objn1.getPassword());
		ResultSet re = p.executeQuery();
		if (!re.next()) {
			System.out.println("you dont have an account");
			System.out.println("Please Register");
			id = register();

		} else {
			System.out.println("login successfull");
		}
		return id;

	}

	public String register() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		System.out.println("Enter the userid");
		String id = LibraryValidation.UserId();
		objn1.setUserId(id);
		System.out.println("Enter the username");
		String na = LibraryValidation.usernameValidation();
		objn1.setUsername(na);
		System.out.println("Enter the password");
		String password = LibraryValidation.passwordValidation();
		objn1.setPassword(password);
		String query = "SELECT user_id FROM loginregister WHERE user_id=?";
		PreparedStatement prepare = con.prepareStatement(query);
		prepare.setString(1, objn1.getUserId());
		ResultSet result = prepare.executeQuery();
		if (!result.next()) {
			String check = "INSERT INTO loginregister VALUES(?,?,?)";

			PreparedStatement p = con.prepareStatement(check);
			p.setString(1, objn1.getUserId());
			p.setString(2, objn1.getUsername());
			p.setString(3, objn1.getPassword());
			p.execute();
			System.out.println("registered  successfull");
		} else {
			System.err.println("you already have an account");
			System.err.println("please login ");
			id = login();
			System.out.println("Registered Successfully ");

		}
		return id;
	}

	public void update() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		read();
		Connection con = BookTable.getConnection();
		String book = "UPDATE bookname SET book_name=? WHERE book_no=?";
		PreparedStatement p = con.prepareStatement(book);
		System.out.println("Enter the book id:");
		int bookid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book name:");
		String bookname = sc.nextLine();
		p.setString(1, bookname);
		p.setInt(2, bookid);
		p.execute();
		read();
		System.out.println("updated successfully");
	}

	public void delete() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------TABLE-------------------");
		read();
		Connection con = BookTable.getConnection();
		String book = "DELETE FROM bookname WHERE book_no=?";
		PreparedStatement p = con.prepareStatement(book);
		System.out.println("Enter the book id:");
		int bookid = sc.nextInt();
		p.setInt(1, bookid);
		p.execute();
		System.out.println("------------------------UPDATED TABLE-----------------------");
		read();
		System.out.println("Deleted  successfully");
	}

	public String select() throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		System.out.println("Enter the book type");
//		LibraryValidation.bookPartValidation(); 
		String type = sc.next();
		String query = ("SELECT book_no,book_name,book_part FROM bookname Where book_type=?");
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, type);
		ResultSet r = p.executeQuery();
//		ResultSetMetaData re=r.getMetaData();
//		int columnvalue= re.getColumnCount();
//		while(r.next())
//		{
//			for(int i=1;i<=columnvalue;i++)
//			{
//				String column=r.getString(i);
//				System.out.println(re.getColumnName(i) +" : "+ column+"");
//			}
//			System.out.println("");
//		}
//		bookname(type);
		return type;

	}

	public void bookname(String type) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		System.out.println("AVAILABLE BOOKS ARE:");
		String selectPart = "SELECT book_name,book_part FROM bookname WHERE book_type=? ";
		PreparedStatement p = con.prepareStatement(selectPart);
		p.setString(1, type);
		ResultSet re = p.executeQuery();
		ResultSetMetaData meta = re.getMetaData();
		int columnValue = meta.getColumnCount();
		while (re.next()) {
			for (int i = 1; i <= columnValue; i++) {
				String column = re.getString(i);
				System.out.println(meta.getColumnName(i) + " : " + column + "");
			}
			System.out.println("");
		}
//		while(re.next()) {
//			String bookName = re.getString("book_name");
//			String bookPart = re.getString("book_part");
//		}
//		

	}

	public String bookname1() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		System.out.println("Enter the book name");
		String bookName = sc.next();
		objn1.setBookname(bookName);
//		System.out.println("Enter the part");
//		int part=sc.nextInt();
		String query = ("SELECT book_part FROM bookname WHERE book_name=?");
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, objn1.getBookname());
		ResultSet re = p.executeQuery();
		ResultSetMetaData r = re.getMetaData();
		int columnvalue = r.getColumnCount();
		while (re.next()) {
			for (int i = 1; i <= columnvalue; i++) {
				String column = re.getString(i);
				System.out.println(r.getColumnName(i) + " : " + column + "");
			}
			System.out.println("");
		}
		return bookName;

	}



	public int bookPart(String bookname) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		System.out.println("Enter the book part");
		int part = LibraryValidation.bookPartValidation();
		objn1.setBookpart(part);
		String query = ("SELECT book_part FROM bookname WHERE book_name=?");
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, bookname);
		ResultSet re = p.executeQuery();
		System.out.println("Book Selected Succesfully");
		return part;
		

	}

//	public static void date()throws ClassNotFoundException,SQLException
//	{
//		LocalDate d=LocalDate.now();
//	    LocalDate due=d.plusDays(10);
//	    String date=d.toString();
//	    String duedate=due.toString();
//	    objn1.setDate(date);
//	    objn1.setLimitdate(duedate);
//	}
	public static void insertTableUser() throws ClassNotFoundException, SQLException {
		LocalDate d=LocalDate.now();
	    LocalDate due=d.plusDays(10);
	    String date=d.toString();
	    String duedate=due.toString();
	    objn1.setDate(date);
	    objn1.setLimitdate(duedate);
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		String query = ("INSERT into userdetails values(?,?,?,?,?,?)");
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, objn1.getUserId());
		p.setString(2, objn1.getUsername());
		p.setString(3, objn1.getBookname());
		p.setInt(4, objn1.getBookpart());
		p.setString(5,objn1.getDate());
		p.setString(6, objn1.getLimitdate());
		p.execute();

	}
	
	public  void viewAll() throws ClassNotFoundException, SQLException {
		LocalDate d=LocalDate.now();
	    LocalDate due=d.plusDays(10);
	    String date=d.toString();
	    String duedate=due.toString();
	    objn1.setDate(date);
	    objn1.setLimitdate(duedate);
		Scanner sc = new Scanner(System.in);
		Connection con = BookTable.getConnection();
		String query = ("SELECT *FROM userdetails");
		PreparedStatement p = con.prepareStatement(query);
		ResultSet re = p.executeQuery();
		ResultSetMetaData r = re.getMetaData();
		int columnvalue = r.getColumnCount();
		while (re.next()) {
			for (int i = 1; i <= columnvalue; i++) {
				String column = re.getString(i);
				System.out.println(r.getColumnName(i) + " : " + column + "");
			}
			System.out.println("");
		}


	}

}

