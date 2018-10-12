package Lab_3;			//3.4 prog munni

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
public class CalDuration {
 
void period( LocalDate start,LocalDate end)
{
Period period = start.until(end);
System.out.println("Years:"+ period.getYears());
System.out.println("Months:"+period.getMonths());
System.out.println("Days:"+ period.getDays());
 
 
 
 
}
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Enter purchased \n year \n month \n days ");
Scanner sc=new Scanner(System.in);
int yyyy=sc.nextInt();
int mm=sc.nextInt();
int dd=sc.nextInt();
System.out.println("Enter period \n year \n month \n days ");
int eyyyy=sc.nextInt();
int emm=sc.nextInt();
int edd=sc.nextInt();
LocalDate start = LocalDate.of(yyyy,mm,dd);
LocalDate end = LocalDate.of(eyyyy,emm,edd);
 
 
CalDuration c=new CalDuration();
c.period(start,end);
 
 
}
 
}