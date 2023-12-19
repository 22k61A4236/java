import java.util.Scanner;
import java.io.*;
class CustomExceptionExample extends Exception
{
   CustomExceptionExample(String msg) throws CustomExceptionExample
   {
       super(msg);
   }
   public static void main(String args[])
   {
       int a;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter your age : ");
       a = s.nextInt();
       try
       {
           if(a>0)
           {
               System.out.print("Age is : "+a);
 	       }
	       else
	       {
	           throw new CustomExceptionExample("Custom Exception Caught : Age cannot be negative ");
	       }
       }
       catch(CustomExceptionExample e)
       {
           System.out.println("e.getMessage()");
       }
   }
}
