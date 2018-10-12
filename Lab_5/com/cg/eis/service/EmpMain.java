package com.cg.eis.service;					//5.1 prog 3rd
import com.cg.eis.bean.*;
import com.cg.eis.pl.*;

public class EmpMain {

	
	public static void main(String[] args) {
		
		Employee e1= new Employee(101,"ifath",20000l,"engineer");
		
		Service s= new Service();
		s.methodi(20000l,"engineer");
		s.display();
		

	}

}
