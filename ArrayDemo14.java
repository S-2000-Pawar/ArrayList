// Write a Java program to join two array lists.


import java.util.ArrayList;
public class ArrayDemo14
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             ArrayList<String>Cars1=new ArrayList<String>();
             Cars1.add("Swift");
             Cars1.add("Bolero");
             Cars1.add("XYZ");
             Cars1.add("Suzuki");
             ArrayList<String>Cars3=new ArrayList<String>();
             Cars3.addAll(Cars);
             Cars3.addAll(Cars1);
             System.out.println(Cars3);
         
     }
}  