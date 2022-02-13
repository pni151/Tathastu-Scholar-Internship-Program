//Write a Java program to calculate Permutation and Combination of 2 numbers.
import java.util.Scanner;
 
public class PermutationCombination
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner in = new Scanner(System.in);
        // Input n & r from the user
        System.out.print("Enter Value of n : ");
        n = in.nextInt();
        System.out.print("Enter Value of r : ");
        r = in.nextInt();
        //we know the formula for calculating when n & r is specified
        System.out.println("Combination is: " + (fact(n)/(fact(n-r)*fact(r))));
        System.out.println("Permutation is: " + (fact(n)/(fact(n-r))));
    }
} 