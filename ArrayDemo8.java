//Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo8
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     
     ArrayList<String>Fruits=new ArrayList<String>();
     Fruits.add("Apple");
     Fruits.add("Orange");
     Fruits.add("Banana");
     System.out.println(Fruits);
     
     Collections.copy(Colors,Fruits);
     System.out.println("Colors" +Colors);
     System.out.println("Fruits" +Fruits);
   }
} 