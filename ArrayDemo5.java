//Write a Java program to remove the third element from a array list.


import java.util.ArrayList;
public class ArrayDemo5
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     Colors.remove(2);
     System.out.println(Colors);
   }
} 