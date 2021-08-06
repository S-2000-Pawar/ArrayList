//Write a Java program to iterate through all elements in a array list.


import java.util.ArrayList;
public class ArrayDemo1
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     for(int i=0;i<Colors.size();i++)
     {
        System.out.println(Colors.get(i));
     }
  }
}