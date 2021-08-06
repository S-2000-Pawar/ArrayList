// Write a Java program to retrieve an element (at a specified index) from a given array list. 

import java.util.ArrayList;
public class ArrayDemo2
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     Colors.add("Green");
     System.out.println(Colors);
     String c=Colors.get(1);
     System.out.println(" first colour" +c);
     String c1=Colors.get(4);
     System.out.println("second colour" +c1);
    
     
   }
} 