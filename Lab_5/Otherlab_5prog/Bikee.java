package Otherlab_5prog;											//5.2 prog
interface Bik
{
	void m1();
	/*static void  m2()
	{
		System.out.println("ifath");
	}*/
}

class Emp implements Bik
{
	 void speed()
	 {
		 System.out.println("hello");
	 }
	 void runi()
	 {
		 System.out.println("hi");
	 }
	 public void m1()
	 {
		 System.out.println("me");
	 }
	/*@Override
	 public  void  m2()
	{
		System.out.println("ifath fatima ");
	}
	*/
}
 class Bikee extends Emp
 {
		
		String name;
		int typebik;
	
	@Override  
	public 	void speed()
	{
		System.out.println("speed method");
	}
	
	@Override
	public void runi()
	{
		System.out.println("run method");
		
	}
	@Override
	public void m1()				//the overriding is happening here
	{
		System.out.println("inside the grand child");
	}
	public static void main(String[] args) 
	{
			Bikee bk= new Bikee();
			bk.speed();
			bk.runi();
			bk.m1();
			
	}

}
