//Write a Java program to trim the capacity of an array list the current list size. 


import java.util.ArrayList;
public class ArrayDemo18
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             Cars.trimToSize();
             System.out.println("trim the capacity of an array  " +Cars);
     }
}