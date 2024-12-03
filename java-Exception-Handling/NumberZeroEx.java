import java.io.*;
import java.util.*;
class NumberZero extends Exception
{
 NumberZero()
 {}
}
class Number
{
 int n;
 Number()throws IOException
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter any number : ");
  n=s.nextInt();
  try
  {
   if(n==0)
   {
    throw new NumberZero();
   }
   cal();
  }
  catch(NumberZero e)
  {
   System.out.println("Number is zero, it is invalid");
  }
 }
 void cal()
 {
   int r,t,sum=0;
   t=n;
   while(n>0)
   {     
    r=n%10;
    sum=sum*10+r;
    n=n/10;  
   }
   if(sum==t)
   System.out.println(t+" Number is palindrome");
   else
   System.out.println(t+" Number is not palindrome");
 }
}
class program25
{
 public static void main(String args[])throws IOException
 {
  Number n=new Number();
 }
}