package Lab_3;								//3.1 munni prog

import java.util.Scanner;

public class StringOperations {
 
public String stringOperation(String s,int n)
{
String result="";
switch(n)
{
case 1:
{
String res=s+s;
result=res;
break;
}
 
case 2:
{
 
char[] str=s.toCharArray();
//char[] str1={};
for(int i=0;i<s.length();i++)
{
if(i%2==1)
{
str[i]='#';
}
 
 
}
String res= new String(str);
result=res;
 
break;
 
}
 
case 3:
{
 
int k=0;
char[] str1=s.toCharArray();
int len=s.length();
char[] str2=new char[len];
// char a=null;
for(int i=0;i<s.length();i++)
{
int count=0;
for(int j=i+1;j<s.length();j++)
{
if(str1[i]==str1[j])
{
str1[j]='\0';
 
 
}
}
}
for(int i=0;i<s.length();i++)
{
if(str1[i]!='\0')
{
str2[k]=str1[i];
k++;
 
}
}
String res= new String(str2);
result=res;
 
 
 
 
break;
}
case 4:
{
 
char[] str=s.toCharArray();
 
for(int i=0;i<s.length();i++)
{
 
 
if(i%2==1)
{
if(97<str[i] &&str[i]<122)
{
str[i]-=32;
}
}
 
 
 
}
String res= new String(str);
result=res;
 
break;
}
 
}
return result;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
StringOperations so=new StringOperations();
Scanner obj=new Scanner(System.in);
System.out.println("Enter the string");
String str=obj.next();
System.out.println("1.Enter 1 to add given string to itself/n 2.Enter 2 to Replace odd positions with # /n 3. Enter 3 to Remove duplicate characters in the String /n 4. Enter 4 to • Change odd characters to upper case");
int num=obj.nextInt();
System.out.println(so.stringOperation(str, num));
 
 
}
 
}
 