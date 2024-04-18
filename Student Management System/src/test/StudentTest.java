package test;

import java.util.List;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

import com.dao.StudentDaoImp;
import com.pojo.Student;

public class StudentTest {

	public static void main(String[] args)  {
		StudentDaoImp std=new StudentDaoImp();
		Scanner sc = new Scanner(System.in);
	//	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("***Student Details***");
			System.out.println("1 - InsertStudent\n2 - UpdateStudent\n3 - DeleteStudent\n4 - getStudentbyR_no\n5 - getAllStudent\n6 - Exit\n");
			System.out.println("Enter Choice");
			int choice =sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Add Student");
					System.out.println("Enter Roll no");
					int r_no=sc.nextInt();
					System.out.println("Enter Name");
				    String name=sc.next();
					System.out.println("Enter Branch");
					String branch=sc.next();
					System.out.println("Enter Adress");
					String adress=sc.next();
					boolean ans = std.insertStudent(new Student(r_no,name,branch,adress ));
					if(ans)
					{
						System.out.println("Record Inserted Successfully");
					}
					else
					{
						System.out.println("Something went wrong,!please try again");
					}
				}
				break;
				
				case 2:
				{
					
					System.out.println("Update the student Details");
					System.out.println("\n1. Update Name\n2. update Adress");
					System.out.println("Enter Your Choice");
					int ch=sc.nextInt();
					if(ch==1)
					{
						System.out.println("Enter Roll No");
						int r_no=sc.nextInt();
						System.out.println("Enter New Name");
						String name=sc.next();
					    Student u= new Student();
					    u.setName(name);
					  boolean flag=  std.updateStudent(r_no,name,ch,u);
					  if(flag)
					  {
						  System.out.println("Name updated Succesfully");
					  }
					  else
					  {
						  System.out.println("Something went Wrong...");
					  }
					    
				   }
					if(ch==2)
					{
						System.out.println("Enter Roll No");
						int r_no=sc.nextInt();
						System.out.println("Enter New Adress");
						String adress=sc.next();
					    Student u= new Student();
					    u.setAdress(adress);;
					  boolean flag1=  std.updateStudent(r_no,adress,ch,u);
					  if(flag1)
					  {
						  System.out.println("Adress updated Succesfully");
					  }
					  else
					  {
						  System.out.println("Something went Wrong...");
					  }
					    
				   }
					
				}
				break;
				
				case 3:
				{
					System.out.println("Delete Student");
					System.out.println("Enter Roll No to Delete");
					int r_no=sc.nextInt();
					boolean f1=std.deleteStudent(r_no);
					if(f1)
					{
						System.out.println("Record Deleted Successfully");
					}
					else {
						System.out.println("Something went wrong,!please try again");
					}
				}
				break;
				
				case 4:
				{
					System.out.println("Get Student Based On Roll No");
					System.out.println("Enter Roll no");
					int r_no=sc.nextInt();
				    std.getStudentbyR_no(r_no);
					
				}
				break;
				
				case 5:
				{
					System.out.println("Show All Student Details ");
					 List<Student> List= std.getAllStudent();
			    }
				break;
				
				case 6:
					System.out.println("Thankyou for using Student Management System");
					System.exit(choice);;
				default:
					System.out.println("Enter Valid choice");
			}
		}while(true); 
		

	}

}
