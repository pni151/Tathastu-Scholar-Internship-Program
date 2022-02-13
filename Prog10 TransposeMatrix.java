//Write a Java Program to find the Transpose of a given Matrix.
import java.util.*;  
public class TransposeMatrix {  
public static void main(String args[]){  
    
//creating a matrix  
            Scanner in = new Scanner(System.in);
            int n,m;
            System.out.println("Enter the number of rows: ");
            m = in.nextInt();
            System.out.println("Enter the number of columns: ");
            n = in.nextInt();
  
            // Declare the matrix
            int matrix[][] = new int[m][n];
  
            // Read the matrix values
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    matrix[i][j] = in.nextInt();
     
  
             System.out.println("Matrix without transpose:");  
             for(int i=0;i<m;i++){    
             for(int j=0;j<n;j++){    
             System.out.print(matrix[i][j]+" ");    
            }    
             System.out.println();//new line    
       }    
             System.out.println();
             System.out.println("Matrix After Transpose:");  
             for(int i=0;i<m;i++){    
             for(int j=0;j<n ;j++){    
             System.out.print(matrix[j][i]+" ");    
         }    
             System.out.println();//new line    
      }    
   }