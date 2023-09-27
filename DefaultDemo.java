//deafult constructer
import java.io.*;
import java.util.*;
 class Rectangle
{
    int l,b,a;
    Rectangle()
    {
        l=4;
        b=6;
        a=l*b;
    }
}
  public class DefaultDemo
{
    public static void main(String args[])
    {
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle();
        System.out.println("area of rectangle"+R1.a);
    }
}
