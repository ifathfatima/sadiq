package LabBookProg;				// 3.2 prog munni

import java.util.Scanner;

public class PositiveString 
{
 
public void positiveString(String s)
{
int k=0,len=s.length();
String str=s.toUpperCase();
byte[] b=str.getBytes();
//byte[] b1=new byte[len];
int count=0,m=0;
for(int i=0;i<s.length();i++)
{
for(int j=i+1;j<s.length();j++)
{
if(b[i]<b[j])
{
m=1;
continue;
 
}
else
{
m=0;
continue;
}
 
}
 
}
if(m==1)
System.out.println("The "+s+" is a positive String");
else
System.out.println("The "+s+" is a negative String");
 
 
}
public static void main(String[] args) {
 
PositiveString p=new PositiveString();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string to check whether it is a positive string or not");
String s=sc.next();
p.positiveString(s);
 
}
 
}