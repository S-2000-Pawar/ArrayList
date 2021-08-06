// Write a Java program to reverse elements in a array list. 



import java.util.ArrayList;
import java.util.Collections;
public class ArrayDemo10
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          {
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
            Collections. reverse(Cars);
             System.out.println(Cars);
         }
     }
}