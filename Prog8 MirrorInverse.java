//Write a Java Program to check whether the given array is Mirror Inverse or not.
/*Inverse of an array is ‘if the array elements are 
swapped with their corresponding indices’. If the inverse 
of an array is equals to the original array then it is 
known a mirror inverse.*/ 

import java.lang.*;
import java.io.*;
import java.util.*;

public class MirrorInverse {

	// Function that returns true if
	// the array is mirror-inverse
	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {

			// If condition fails for any element
			if (arr[arr[i]] != i)
				return false;
		}

		// Given array is mirror-inverse
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
	    int n;
		Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements: ");  
       
        n =sc.nextInt();  

        int[] arr = new int[100];  
        
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
    }  
		if (isMirrorInverse(arr))
			System.out.println("Yes, It is mirror-inverse");
		else
			System.out.println("No, It is not a mirror-inverse");
	}
}