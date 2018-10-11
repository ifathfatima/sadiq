package LabBookProg;					//4.1 prog not all is covered asked in question

 class Account 
{
	
	long accnum;
	double bal=500.00;
	String accholder;

	
	void setDeposit(int dep)
	{
		bal=bal+dep;
		System.out.println("the new bal is:"+bal);
		
		
	}
	
	
	void getWithdraw(int wit)
	{
			if((bal-wit)<500)
				System.out.println("can't withdraw as bal less than 500");
			else
			{
				bal=bal-wit;
				System.out.println("bal is:"+bal);
			}
		
	}
	
	 double getBalance()
	{
		return bal;
	}
	 
}


 class Person1 extends Account
{
	  String name;
	  float age;
	   
	   Person1(long acc,double b,String s,float ag)
	   {
		   accnum=acc;
			bal=b;
			accholder=s;
			age=ag;
			
		   
	   }
	    
	  public static void main(String args[])
	  {
		 Person1 acc1= new Person1(10001l,2000.00d,"SMITH",40);
		  Person1 acc2=new Person1(10002l,3000.00d,"kathy",45);
		  acc1.setDeposit(2000);
		  acc2.getWithdraw(2000);
		  acc1.getBalance();
		  acc2.getBalance();
		  System.out.println(acc1.toString());
		  System.out.println(acc2.toString());
		  
		 
	  }
 }
