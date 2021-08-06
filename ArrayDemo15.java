// Write a Java program to clone an array list to another array list. 



import java.util.ArrayList;
//import java.util.Collections;
public class ArrayDemo15
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
             ArrayList Cars1=(ArrayList)Cars.clone();                  
             System.out.println(Cars1);
      }
}