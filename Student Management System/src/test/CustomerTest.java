package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.dao.CustomerDaoImpl;
import com.pojo.Customer;

public class CustomerTest 
{
	public static void main(String[] args)throws IOException
	{
		String c_name, c_email, c_pass, c_address;
		long c_contact;
		int choice;
		
		CustomerDaoImpl cd = new CustomerDaoImpl();
		Scanner sc = new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		do 
		{
			System.out.println("***Customer Details***");
			System.out.println("1 - Add Customer\n2 - Update Customer\n3 - Delete Customer\n4 - Search Customer\n5 - GetAll Customer\n6 - Exit\n");
			System.out.println("Enter Choice");
			choice =sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("How many Customer you want to add");
					int a=sc.nextInt();
					
					for(int i=1; i<=a; i++)
					{
						System.out.println("Enter a name");
						c_name=bf.readLine();
						System.out.println("Enter an Email");
						c_email=bf.readLine();
						System.out.println("Enter a password");
						c_pass=bf.readLine();
						System.out.println("Enter a contact no");
						c_contact=sc.nextLong();
						System.out.println("Enter an address");
						c_address=bf.readLine();
						
						Customer cs = new Customer( c_name, c_email, c_pass, c_contact, c_address);
						cd.addCustomer(cs);
					}
					System.out.println("Add customer Sucessfully");
				}
				break;
			
			}	
		} while (choice!=6);
	}
	
}
