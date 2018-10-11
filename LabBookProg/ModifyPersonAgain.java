package LabBookProg;                       //2.5 half prog
enum gender{m,f,others};          //enum executes only when outside the class
public class ModifyPersonAgain 
{
		
	String fi,la;
	 //gender{m,f,others};  this stmt is not working here it should be given outside class
	//now 'gender' can be used as a datatype
	gender c;  //declared a var 'c' of type gender
	long ph;

	ModifyPersonAgain()
	{
		fi="ifath";
		la="sadiq";
		 c=gender.f;
		ph=9502098527l;
		
	}
	ModifyPersonAgain(String r,String s,gender t,long p)
	{
		fi=r;
		la=s;
		c=t;
		ph=p;
		
	}
	void display()
	{
		
		System.out.println("personal details:");
		System.out.println("-------------------");
		
		System.out.println("First name:"+fi);
		System.out.println("last name:"+la);
		
		System.out.println("gender:"+c);
		System.out.println("\n");
		
		
	}
	void displayp()
	{
		System.out.println("personal details:");
		System.out.println("-------------------");
		
		System.out.println("First name:"+fi);
		System.out.println("last name:"+la);
		
		System.out.println("gender:"+c);
		System.out.println("phone number is:"+ph);
		
		
	}
	
	
}
