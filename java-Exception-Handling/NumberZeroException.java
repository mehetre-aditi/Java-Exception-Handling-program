import java.util.*;
import java.io.*;
class NumberZero extends Exception
{
 NumberZero()
 {}
}
class Number
{
 int r,n,sum=0;
 Number()throws IOException
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter any number");
  n=s.nextInt();
  try
  {
   if(n>100)
   {
    throw new NumberZero();
   }
   else
   {
    while(n>0)
    {
     r=n%10;
     sum=sum+r;
     n=n/10;
    }
    System.out.println("Addition of digit : "+sum);
   }
  }
  catch(NumberZero e)
  {
   System.out.println("Number is out of range");
  }
 }
}
class program22
{
 public static void main(String args[])throws IOException
 {
  Number n=new Number();
 }
}
