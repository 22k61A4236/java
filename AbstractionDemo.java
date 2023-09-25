import java.io.*;
import java.util.*;
  abstract  class Animal
  {
      public abstract void animalsound();
      public void sleep()
      {
          System.out.println("zzzz");
      }
  }
  class Cow extends Animal 
  {
      public void animalsound()
      {
          System.out.println("the cow sounds maoo");
      }
  }
   public class AbstractionDemo
{
    public static void main(String ars[])
    {
    Cow c = new Cow();
    c.animalsound();
    c.sleep();
    }
 
}
