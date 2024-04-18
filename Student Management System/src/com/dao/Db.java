package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
 
	static Connection conn = null;
	  public static Connection connect() 
	  {
		try 
		{
			String url = "jdbc:mysql://localhost:3306/DB";
			String userName = "root";
			String password = "Indian@7860";
			
			 conn = DriverManager.getConnection(url,userName,password);
		} 
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
		return(conn);
      }
	  
}
