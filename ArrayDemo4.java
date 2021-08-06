//Write a Java program to update specific array element by given element.


import java.util.ArrayList;
public class ArrayDemo4
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     Colors.set(3,"Yellow");
     System.out.println(Colors);
     
     
   }
} 