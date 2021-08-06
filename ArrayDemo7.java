//Write a Java program to sort a given array list. 


import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo7
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     Collections.sort(Colors);
    System.out.println(Colors);
   }
} 