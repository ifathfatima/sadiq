package com.capgemini.ems.presentation;
import java.util.*;
import com.capgemini.ems.service.*;
import com.capgemini.ems.DTO.*;
import com.capgemini.ems.dao.*;


public class EMSMain 
{

	public static void main(String[] args) 
	{
		EmployeeService service =new EmployeeServiceImpl();			//always creating dynamic polymorphc(create obj with ref type parent)
		
		System.out.println("employee management system");
		System.out.println("1.Add Employee");
		System.out.println("2.Exit");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("select choice");
		int option=0;
		
		try{
		option=sc.nextInt();			//here exception occurs if we enter char
		}
		catch(InputMismatchException e)
		{ 
			System.out.println("input should be digits");
			System.exit(0);     		//for terminating here 
			
		}
		switch(option)
		{
		case 1:
			System.out.println("enter id");
			int id=sc.nextInt();         //here also exception can occur
			System.out.println("enter name:");
			String name=sc.nextLine();
			System.out.println("enter sal:");
			double salary=sc.nextDouble();
			
			Employee emp=new Employee(id,name,salary);
			
			
			
			
			break;
			
		case 2: 
			
			System.out.println("thank u");
			break;
			
			default:
				System.out.println("invalid input,try again");    				//only when input is digit but other than 1or 2
		}

	}

}
