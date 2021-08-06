//Write a Java program to print all the elements of a ArrayList using the position of the elements.


import java.util.ArrayList;
public class ArrayDemo21
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars); 
             int n = Cars.size();
             for (int index = 0; index < n; index++)
             System.out.println(Cars.get(index));
     }
}