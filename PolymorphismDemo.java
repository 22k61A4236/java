import java.io.*;
import java.util.*;
    class Animal
  {
      public void animalsound()
      {
       System.out.println("an animal can make sounds");
      }
  }
  class Cow extends Animal 
  {
      public void animalsound()
      {
          System.out.println("the cow sounds maoo");
      }
  }
  class Cat extends Animal
  {
      public void animalsound()
      {
            System.out.println("the cat sounds meow");
      }
  }
   public class PolymorphismDemo
{
    public static void main(String ars[])
    {
    Animal a = new Animal();
    Animal mycow = new  Cow();
    Animal mycat = new Cat();
    a.animalsound();
    mycow.animalsound();
    mycat.animalsound();
    }
}
