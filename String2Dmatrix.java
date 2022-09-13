package Array_Problems;

import java.util.Scanner;

public class String2Dmatrix {

	public static void main(String[] args) {
			
		String colours[][]= new String[3][3];
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the colours ");
	
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				colours[i][j]= scanner.next();
				
			}	
				System.out.println();

		}

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				
				System.out.print(colours[i][j]+ " ");

			}	
				System.out.println();

	
	    }
	}


	}

