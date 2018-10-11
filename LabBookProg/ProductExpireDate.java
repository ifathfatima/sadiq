package LabBookProg;					//*********3.5 prog munni 

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
public class ProductExpireDate {
 
void expireDate(LocalDate ld,Period pd)
{
LocalDate expdate=ld.plus(pd);
//LocalDate expdate1=expdate.plusMonths(m);
System.out.println("Expire date is(yyyy-mm-nn) "+ expdate);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter purchased \n year \n month \n days ");
int yyyy=sc.nextInt();
int mm=sc.nextInt();
int dd=sc.nextInt();
System.out.println("Enter period \n year \n month \n days ");
int pyyyy=sc.nextInt();
int pmm=sc.nextInt();
int pdd=sc.nextInt();
LocalDate purchasedate=LocalDate.of(yyyy,mm,dd);
int py=2;
int pm=4;
Period period = Period.of(pyyyy,pmm,pdd);
ProductExpireDate p=new ProductExpireDate();
p.expireDate(purchasedate,period);
 
}
 
 
}