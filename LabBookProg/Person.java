package LabBookProg;                           //2.3 half prog

public class Person
{
		// TODO Auto-generated method stub
		
		String fi,la;
		char g;
		Person()
		{
			fi="ifath";
			la="sadiq";
			g='f';
		}
		Person(String r,String s,char t)
		{
			fi=r;
			la=s;
			g=t;
			
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

}


