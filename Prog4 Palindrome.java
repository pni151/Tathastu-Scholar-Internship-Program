//Write a Java program to find out whether the given String is Palindrome or not.
import java.util.*;   
class Palindrome
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string: ");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  //loops iterates in reverse order
         reverse = reverse + original.charAt(i);  //concatenates the characters from behind
      if (original.equals(reverse))  //checks if entered string is equal to reverse string
         System.out.println("It is a palindrome.");  
      else  
         System.out.println("It is not a palindrome.");   
   }  
} 