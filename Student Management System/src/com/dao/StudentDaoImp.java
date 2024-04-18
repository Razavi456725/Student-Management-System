package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.pojo.Student;

public class StudentDaoImp implements StudentDao{
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	int row;
	
@Override
public boolean insertStudent(Student u) {
    try 
    {
    	conn = Db.connect();
    	String query = "INSERT INTO student1 (r_no, name, branch, adress) VALUES (?, ?, ?, ?)";
    	pstm= conn.prepareStatement(query);
    	pstm.setInt(1, u.getR_no());
    	pstm.setString(2, u.getName());
    	pstm.setString(3, u.getBranch());
    	pstm.setString(4, u.getAdress());
    	
    	int i = pstm.executeUpdate();
    	if(i>0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }
    catch(Exception e)
	{
		e.printStackTrace();
	}
    return false;
}    

@Override
public boolean updateStudent(int r_no, String update, int ch,Student u) {
	int choice=ch;
	
	try 
	{
		if(choice==1)
		{
		   conn = Db.connect();
		   String query = "UPDATE student1 set name = ? where r_no = ?";
		   pstm= conn.prepareStatement(query);
		   pstm.setString(1, update);
		   pstm.setInt(2, r_no);
		

		   int i = pstm.executeUpdate();
		   if(i>0)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
		}
		if(choice==2)
		{
		   conn = Db.connect();
		   String query1 = "UPDATE student1 set adress = ? where r_no = ?";
		   pstm= conn.prepareStatement(query1);
		   pstm.setString(1, update);
		   pstm.setInt(2, r_no);
		

		   int i1 = pstm.executeUpdate();
		   if(i1>0)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
		}
		
		
	}	
	catch (Exception e)
	{
		
	}  
	return false; 
}
	
@Override
public boolean deleteStudent(int r_no) {
	try 
	{
		conn = Db.connect();
		String query = "DELETE FROM student1  where r_no ="+r_no;
		pstm= conn.prepareStatement(query);
		int i = pstm.executeUpdate();
    	if(i>0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
	} 
	catch (Exception e) 
	{
		
	}
		
		return false;
	}

@Override
public Student getStudentbyR_no(int r_no) {
		try 
		{
			conn = Db.connect();
			String query = "SELECT * FROM student1  where r_no ="+r_no;
			pstm= conn.prepareStatement(query);
			
			rs = pstm.executeQuery(query);
			while(rs.next()) {
				System.out.println("Roll_no: "+rs.getInt(1)+"\n"+
	                       "Name: " +rs.getString(2)+"\n"+
			               "Branch: "+ rs.getString(3)+"\n"+
	                       "Adress: "+ rs.getString(4));

			}
			
	    } 
		catch (Exception e) 
		{
			
		}
		
		return null;
}
	@Override
	public  List<Student> getAllStudent() {
	try 
		{
		
		conn = Db.connect();
		String query = "SELECT * FROM student1";
		Statement stm= conn.createStatement();
		rs=stm.executeQuery(query);	
		while(rs.next()) {
			System.out.println("Roll_no: "+rs.getInt(1)+"\n"+
		                       "Name: " +rs.getString(2)+"\n"+
				               "Branch: "+ rs.getString(3)+"\n"+
		                       "Adress: "+ rs.getString(4));
			System.out.println("-------------------------------");
			
		}
		} 
		catch (Exception e) 
		{
			
		}  
		return null;	
			
	}
	
	

	
}
