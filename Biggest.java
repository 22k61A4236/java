import java.util.*;
class Biggest
{
 public static void main(String args[])
 {
  int a,b;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter A and B value::");
  a=Integer.parseInt(s.nextLine());
  b=Integer.parseInt(s.nextLine());
  if ( a>b )
            System.out.println("The Biggest number is A");
  else
      System.out.println("The Biggest number is B");
 }
}
