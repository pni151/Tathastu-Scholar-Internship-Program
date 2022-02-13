//Write a Java program to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     int firstTerm = 0, secondTerm = 1;
    // Input the n from the user
    System.out.print("Enter n: ");
    int n = in.nextInt();
    
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + " ");

      // compute the next term by adding the 1st & 2nd term\
      //and then swapping the numbers
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}