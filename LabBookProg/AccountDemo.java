package LabBookProg;			//4.2 prog 


 class Account1
{
	
	long accnum;
	double bal=2000.00;
	String accholder;

	
	void getDeposit(int dep)
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


class SavingsAccount extends Account1
{
	final double minbal=500;
	
	void getWithdraw(double w)
	{
		if((bal-w)<500)
			System.out.println("can't withdraw as bal less than 500");
		else
		{
			bal=bal-w;
			System.out.println("bal is:"+bal);
		}
	
	}
}

class CurrentAccount extends Account1
{
	double ord=0;	
	int check =0;//over draft val or the extra money taken from account which was not  there in his acc
	 
	double od=1000;			//od limit set for a bank
	
	void getWithdraw(double wi)
	{
	/*//	if(bal<0)
	//	{
		//	ord=Math.abs(bal);
		//	System.out.println("ord val is:"+ord);
		//}
		
		
		if(ord<900)
		{
			
			System.out.println("trasaction is allowed");
			bal=bal-wi;
			ord=Math.abs(bal);
			System.out.println("balance is:"+bal);
			System.out.println("ord val is:"+ord);
			
			
		//else
			//System.out.println("true you are allowed");
	
		}
		else
		{
			System.out.println("trasaction not  allowed");
		}
		
				
		
	
	/*void getWithdraw(double ov)
	{
		if(ov>overdraft)
		{
			
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}*/
	
	
	if(ord<=1000)
	{
		if(bal-wi<0)
		{
			bal=bal-wi;
			System.out.println("current bal is:"+bal);
			check=1;
			if(bal<-1000)
			{
				System.out.println("you have reached ov limit so the withdrawal amt is added to your acc");
				bal=bal+wi;
				System.out.println("your current bal is:"+bal);
				check=0;
			}
		}
		else
		{
			bal=bal-wi;
			System.out.println("current bal is:"+bal);
		}
		if(check==1)
		{
			ord=Math.abs(bal);
			System.out.println("current ord is:"+ord);
			check=0;
			
		}
	}
	
	}
}

public class AccountDemo 
{
		public static void main(String args[])
		{
			SavingsAccount sa=new SavingsAccount();
			sa.getWithdraw(1000.00);				//as the type id double so enter double value
			
			
			CurrentAccount cv= new CurrentAccount();
			cv.getWithdraw(1900.00);
			cv.getWithdraw(1000.00);
			cv.getWithdraw(200.00);
			
		}
}
