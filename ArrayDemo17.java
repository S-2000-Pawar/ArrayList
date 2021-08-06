 //Write a Java program to test an array list is empty or not. 



import java.util.ArrayList;
public class ArrayDemo17
{
      public static void main(String[] args)
      {
          ArrayList<String>Cars=new ArrayList<String>();
          
             Cars.add("Mahindra");
             Cars.add("Tata");
             Cars.add("Volvo");
             Cars.add("BMW");
             System.out.println(Cars);
            System.out.println("Checking the above array list is empty or not! "+Cars.isEmpty());
            Cars.removeAll(Cars);
            System.out.println("Array list after remove all elements "+Cars);   
            System.out.println("Checking the above array list is empty or not! "+Cars.isEmpty()); 
     }
}