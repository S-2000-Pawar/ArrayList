//Write a Java program to extract a portion of a array list. 


import java.util.ArrayList;
import java.util.List;
public class ArrayDemo11
{
      public static void main(String[] args)
      {
          List<String>Cars=new ArrayList<String>();
          {
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             List<String> sub_List = Cars.subList(0, 2);
            System.out.println("List of first three elements: " + sub_List);
         }
     }
}