//Write a Java program to empty an array list.  


import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo16
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             Cars.removeAll(Cars);
             System.out.println(Cars);
    }
}
             
             