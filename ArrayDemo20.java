// Write a Java program to replace the second element of a ArrayList with the specified element. 



import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo20
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             Cars.set(2,"Swift");
             System.out.println(Cars);
     }
}