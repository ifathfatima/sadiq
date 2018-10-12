package Lab_6;						//6.1 prog
import java.lang.*;
import java.util.*;

class Person 
{
	 public String fi,la,fn;
	char g;
	
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
	
	
	void  fullName()
	{
		 fn=fi+la;
	}
	
}


class invalidName extends Exception
{
	  invalidName()
	{
		super("invalid name of use");
	}
}



 class PersonMain 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("mani","shah",'f');
		
		p1.fullName();
		try
		{
			if("".equals(p1.fi)||"".equals(p1.la))
			{
				throw new invalidName();
			}
			else
			{
				p1.display();
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
