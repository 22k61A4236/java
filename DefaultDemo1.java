//parametrized consrtucter
import java.io.*;
import java.util.*;
 class Rectangle
{
    int l,b,a;
    Rectangle(int l,int b)
    {
        a=l*b;
    }
}
  public class DefaultDemo
{
    public static void main(String args[])
    {
        Rectangle R1=new Rectangle(2,3);
        
        System.out.println("area of rectangle "+R1.a);
    }
}
