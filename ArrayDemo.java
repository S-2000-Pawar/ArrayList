//Write a Java program to create a new array list, add some colors (string) and print out the collection. 


import java.util.ArrayList;
public class ArrayDemo
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
   }
} 