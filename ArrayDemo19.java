//Write a Java program to increase the size of an array list. 


import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo19
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);          
             Cars.ensureCapacity(7);
             Cars.add("Suzuki");
             Cars.add("Maruti");
             Cars.add("Swift");
          System.out.println("New array list " + Cars);
     }
}