 //Write a Java program of swap two elements in an array list.  



 import java.util.ArrayList;
 import java.util.Collections;
 public class ArrayDemo13
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             Collections.swap(Cars,1,2);
             System.out.println("After swaping  " +Cars);
     }
}