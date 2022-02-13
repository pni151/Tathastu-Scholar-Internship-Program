//Write a Java program to remove elements from an ArrayList
import java.util.ArrayList;  
  
public class ArrayList {  
   public static void main(String[] args) {  
      // creating an ArrayList having default size  
      ArrayList<String> arr = new ArrayList<String>();  
      // Adding elements to the ArrayList  
      arr.add("Hi");  
      arr.add("Bye");  
      arr.add("Greetings");  
      arr.add("Thanks"); 
      arr.add("World");
      arr.add("God"); 
      System.out.println("The list of the size is: " + arr.size());  
      // Printing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
      // Removing element available at position 1  
      arr.remove(2);   //you can specify any position here
      
      // Removing the specified element from ArrayList  
      arr.remove("Hi"); 
      
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
      // Showing all the elements left in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  
