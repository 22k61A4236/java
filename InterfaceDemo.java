import java.io.*;
import java.util.*;
    interface Language
    {
        void getname(String name);
    }
    class ProgramingLanguage
    {
        void getname(String name)
        {
            System.out.println("My favourite programming language is "+name);
        }
    }
     public class InterfaceDemo
    {
        public static void main(String args[])
        {
         ProgramingLanguage pl = new ProgramingLanguage();
         pl.getname("java");
            
        }
    }
