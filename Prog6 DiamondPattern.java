//Write a program in Java to print Diamond Pattern.
import java.io.*;
import java.util.Scanner;

public class Diamond{


	public static void main(String[] args)
	{
      Scanner s = new Scanner(System.in);
		int num;
		int m, n;
	    System.out.print("Enter the number of rows: ");
        num = s.nextInt();

		// Outer loop 1
		// prints the first half diamond
		for (m = 1; m <= num; m++) {

			// Inner loop 1 print whitespaces inbetween
			for (n = 1; n <= num - m; n++) {
				System.out.print(" ");
			}

			// Inner loop 2 prints star
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();
		}

		// Outer loop 2
		// Prints the second half diamond
		for (m = num - 1; m > 0; m--) {

			// Inner loop 1 print whitespaces inbetween
			for (n = 1; n <= num - m; n++) {
				System.out.print(" ");
			}

			// Inner loop 2 print star
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();
		}
	}
}