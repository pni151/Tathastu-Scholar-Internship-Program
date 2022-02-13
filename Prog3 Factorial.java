//Write a Java program to calculate a Factorial of a number.
import java.util.Scanner;

class Factorial{  
 public static void main(String args[]){  
  Scanner in = new Scanner(System.in);
  int i,fact=1;
  //Input n from user
   System.out.print("Enter n: ");
    int n = in.nextInt(); //It is the number to calculate factorial
    
  //It is the number to calculate factorial    
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+ n +" is: "+fact);    
 }  
} 
