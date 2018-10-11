package LabBookProg;							//**********3.7 prog munni

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
public class AgeCal {
 
public static void main(String[] args)
{
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("First Name ");
Person6 p=new Person6();
String f=sc.next();
System.out.println("last Name ");
String l=sc.next();
System.out.println("Gender ");
char n=sc.next().charAt(0);
//By getter and setter methods
p.setFirstName(f);
p.setLasttName(l);
p.setGender(n);
System.out.println("Enter the date of birth \n Year \n Month \n Day ");
int year=sc.nextInt();
int month=sc.nextInt();
int dayOfMonth=sc.nextInt();
LocalDate birthdate=LocalDate.of(year, month, dayOfMonth);
LocalDate end = LocalDate.now();
System.out.println("Person Details:");
System.out.println("---------------------");
 
System.out.println("First Name: "+p.getFirstName());
System.out.println("Last Name: "+p.getLastName());
System.out.println("Gender: "+p.getGender());
p.caluculateAge(birthdate,end);
p.getFullName(f, l);
 
/*//passing values by constructor
Person p1=new Person("Swetha","Pabbathi",'F');
System.out.println("Person Details:");
System.out.println("---------------------");
 
System.out.println("First Name: "+p1.firstName);
System.out.println("Last Name: "+p1.lastName);
System.out.println("Gender: "+p1.Gender);*/
 
 
 
 
}
 
}
  class Person6
{
String firstName,lastName;
char Gender;
Person6()
{
 
}
Person6(String f,String l,char a)
{
firstName=f;
lastName=l;
Gender=a;
}
public void setFirstName(String s)
{
firstName=s;
}
public String getFirstName()
{
return firstName;
}
public void setLasttName(String s)
{
lastName=s;
}
public String getLastName()
{
return lastName;
}
public void setGender(char c)
{
Gender=c;
}
public char getGender()
{
return Gender;
}
void caluculateAge(LocalDate start,LocalDate end)
{
Period period = start.until(end);
System.out.println( "Age: "+period.getYears()+"Years "+period.getMonths()+" Months "+period.getDays()+" Days");
 
}
void getFullName(String f,String l)
{
System.out.println("Full name: "+f+" "+l);
}
}
 