package com.dao;

import java.util.List;


import com.pojo.Student;

public interface StudentDao 
{
  public boolean insertStudent(Student u);
  public boolean updateStudent(int r_no, String update, int ch,Student u);
  public boolean deleteStudent(int r_no);
  public Student getStudentbyR_no(int r_no);    //Retrieve data one by one
  public List<Student> getAllStudent();     // Retrieve all data why we made collection ? because collection store unlimited data
  
	

}
