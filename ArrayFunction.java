package Array_Problems;

import java.util.Scanner;

public class ArrayFunction {
	 static void displayArray(int n[])
     {
         for (int i = 0; i < n.length; i++)
             System.out.print(n[i]+" ");
            
     }


     static int[] readArray()
     {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter array size: ");
        
         int size = scanner.nextInt();
        
         int numbers[] = new int[size];
        
         System.out.println("Enter "+size+" numbers : ");
        
         for (int i = 0; i < numbers.length; i++)
             numbers[i] = scanner.nextInt();
        
         return numbers;
        
     }
	public static void main(String[] args) {
		
		       
	        int nums[] = readArray();
	         displayArray(nums);
	       
	}

}
