package com.library.dao;

import java.sql.SQLException;

public interface BookNameDAO 
{
	void read()throws ClassNotFoundException,SQLException;
	void insert()throws ClassNotFoundException,SQLException;
	String login()throws ClassNotFoundException,SQLException;
	String register()throws ClassNotFoundException,SQLException;
	void update()throws ClassNotFoundException,SQLException;
    void delete()throws ClassNotFoundException,SQLException;
    String select() throws ClassNotFoundException,SQLException;
    
}