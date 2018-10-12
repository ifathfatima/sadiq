package Lab_6;							//6.2 prog 


class Peron extends Exception
{
	String fi="divya";
	String la="bhrathi";
	char ge='F';
	int ad=10;
	Peron()
	{}
	void display()
	{
		System.out.println("first name is:"+fi);
		System.out.println("last name is:"+la);
		System.out.println("age is valid:"+ad);
	}
}

 class invalidAge extends Exception
{
	
	  invalidAge()
	 {
		 super("invalid age");
	 }
}

public class AccountDemo
{

	public static void main(String[] args) 
	{
		Peron p2=new Peron();
		
		try
		{
			if(p2.ad<15)
				{
				  throw new invalidAge();
				  
				}
			else
				{
					p2.display();
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("first name is:"+p2.fi);
			System.out.println("last name is:"+p2.la);
		}

	}

}
