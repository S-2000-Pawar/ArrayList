//Write a Java program to insert an element into the array list at the first position



import java.util.ArrayList;
public class ArrayDemo3
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     Colors.add(0,"Green");
     System.out.println(Colors);
   }
} 