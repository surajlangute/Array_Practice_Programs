package Array_Problems;

import java.util.Scanner;

public class Char2DArray {
public static void main(String[] args) {
	char name[][]= new char[3][3];
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter the characters ");

	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++) 
		{
			name[i][j]= scanner.next().charAt(0);
			
		}	
			System.out.println();

	}

	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++) 
		{
			
			System.out.print(name[i][j]+ " ");

		}	
			System.out.println();


    }
}


}
