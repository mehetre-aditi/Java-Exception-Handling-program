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
  System.out.println("Enter any Number : ");
  n=s.nextInt();
  try
  {
   if(n==0)
   {
    throw new NumberZero();
   }
   else
   {
    int l=0,r=0;
    l=n%10;
    while(n>0)
    {
    r=n%10;
    n=n/10;
    }
    System.out.println("Sum of First & Last digit = "+(l+r));
   }
  }
  catch(NumberZero e)
  {
   System.out.println("Number is zero");
  }
 }
}
class program23
{
 public static void main(String args[])throws IOException
 {
  Number n=new Number();
 }
}
    
     