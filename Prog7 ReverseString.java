//Write a Java Program to reverse the letters present in the given String.
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {
	public static void main(String[] args)
	{
		String str;
        Scanner in = new Scanner(System.in);   
        System.out.print("Enter a string: ");  
        str = in.nextLine();  
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		// To reverse the string
		sbr.reverse(); //string function
		System.out.println(sbr);
	}
}