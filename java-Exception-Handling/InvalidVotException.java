import java.util.*;
class invalidVoting extends Exception
{
 public invalidVoting()
 {}
}
class program24
{
 static void calculate(int age)throws invalidVoting
 {
  if(age<18)
  {
   throw new invalidVoting();
  }
  else
  {
   System.out.println("You are eligible for voting");
  }
 }
 public static void main(String args[])
 {
  try
  {
   calculate(15);
  }
  catch(invalidVoting e)
  {
   System.out.println("You are not eligible for voting");
  }
 }
}