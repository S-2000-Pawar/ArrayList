//Write a Java program to compare two array lists.


import java.util.ArrayList;
public class ArrayDemo12
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
             Cars1.add("Mahindra");
             Cars1.add("Tata");
             Cars1.add("Volvo");
             Cars1.add("BMW");
            boolean b = Cars.equals(Cars1);  
            System.out.println(b);
            Cars1.add("Swift");  
            boolean b1 = Cars.equals(Cars1);  
            System.out.println(b1);
         
     }
}  