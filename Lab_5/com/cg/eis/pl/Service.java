package com.cg.eis.pl;						//5.1 prog 2nd
import com.cg.eis.bean.*;



interface EmployeeService
{
	 
	 void methodi(long salary,String desig);
}

public class Service implements EmployeeService
{
	
	
	 public  void getName()
	{
		 
		System.out.println("name is:"+Employee.name);
		
	}
	
	 public void methodi(long salary,String desig)
	{
		if(salary<10000 && desig=="associate")
		{
			System.out.println("your insurance service is: GOLD");
			Employee.insuscheme="GOLD";
		}
		else if(salary<=20000 && desig=="engineer")
		{
	
			System.out.println("your insurance service is :diamond");
			Employee.insuscheme="DIAMOND";
		}
		else
		{
			System.out.println("your service is:PLATINUM");
			Employee.insuscheme="PLATINUM";
		}
			
	}
	 public void getId()
	 {
		 System.out.println("emp id is:"+Employee.id);
	 }
	 public void getSalary()
	 {
		 System.out.println("sal is :"+Employee.salary);
		 		
	 }
	 
	 public void display()
	 {
		 System.out.println("id id:"+Employee.id);
		 System.out.println("name is:"+Employee.name);
		 System.out.println("sal is:"+Employee.salary);
		 System.out.println("designation is:"+Employee.desig);
		 System.out.println("insurance scheme is:"+Employee.insuscheme);
		 
	 }
	 
	 
	
}
