package Lab_2;
							//2.5 prog with enum and scanner
import java.util.Scanner;

enum gende{m,f};								//we can use gende.valuesof() for extracting values from enum

public class ModiScanner {

	public static void main(String[] args) {
		
		

		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String fi,la;
		gende c;
		boolean si;
		long ph;
		System.out.println("enter the fi:");
		fi=sc.next();
		System.out.println(fi);
		System.out.println("enter the la:");
		la=sc.next();
		System.out.println(la);
		System.out.println("enter the gender:");
		si=sc.nextBoolean();
		if(si==true)  //for true value entering a male gende  c
		{
			c=gende.m;
			System.out.println(c);				
		}
		else      //for false enter female into gende c
		{
			
			c=gende.f;
			System.out.println(c);
		}
		
		System.out.println("enter the phone number");
		ph=sc.nextLong();
		System.out.println(ph);
	}

}
