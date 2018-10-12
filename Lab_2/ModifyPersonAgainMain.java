package Lab_2;                              //2.5 half prog


public class ModifyPersonAgainMain
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		ModifyPersonAgain p= new ModifyPersonAgain();
		ModifyPersonAgain p1=new ModifyPersonAgain("mani","shah",gender.m,9502098527l);
		p.display();				//or give enum inside the class but use ModifyPersonAgain.gender.m then the code works
									// or we can import the package LabBookProg.gender; then we can directly use the gender.m  in this prog
		p.displayp();				//or use LabBookProg.ModifyPersonAgain.gender if the enum is present inside the class
		p1.display();
		p1.displayp();
		
	}


}
