package Lab_7;										//7.1 prog
import java.util.*;
import java.lang.*;
import java.sql.*;

public class ArraySting 
{
	public static void main(String[] args) 
	{
		
	int i;
	
	String[] s={"Milk","bread","honey","egg"};       		//here it is taking ascii val of 1st char and then sorting the array
														//i,e M ascii val is less so the list of array at the end is sorted in ascending order
	for(i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	Arrays.sort(s);
	System.out.println("array after sorting:");
	for(i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
		
	}

	
		// TODO Auto-generated method stub

	}

}
