package LabBookProg;                          //2.4 half prog

public class ModifyPerson {
	String fi,la;
	char g;
	long ph;
	ModifyPerson()
	{
		fi="ifath";
		la="sadiq";
		g='f';
		ph=9502098527l;
	}
	ModifyPerson(String r,String s,char t,long p)
	{
		fi=r;
		la=s;
		g=t;
		ph=p;
		
	}
	void display()
	{
		
		System.out.println("personal details:");
		System.out.println("-------------------");
		
		System.out.println("First name:"+fi);
		System.out.println("last name:"+la);
		
		System.out.println("gender:"+g);
		System.out.println("\n");
		
		
	}
	void displayp()
	{
		System.out.println("personal details:");
		System.out.println("-------------------");
		
		System.out.println("First name:"+fi);
		System.out.println("last name:"+la);
		
		System.out.println("gender:"+g);
		System.out.println("phone number is:"+ph);
		
		
	}


}
