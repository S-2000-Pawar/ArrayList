//Write a Java program to shuffle elements in a array list.


import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo9
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     Collections.shuffle(Colors);
     System.out.println("After shuffle" +Colors);
   }
} 