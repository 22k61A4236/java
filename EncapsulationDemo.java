import java.io.*;
import java.util.*;
class Student 
{
    private String Sphone;
    public String Sname;
    public String getSphone()
    {
        return Sphone;
    }
     void setSphone(String ph)
    {
        this.Sphone=ph;
    }
}
  public class EncapsulationDemo
{
    public static void main(String ars[])
    {
        
    Student s =new Student();
    s.Sname = "Narendra.k";
    s.setSphone("95478945");
    System.out.println("Student name is "+s.Sname);
    System.out.println("Student phone number is  "+s.getSphone());
    }
}
