package Array_Problems;

import java.util.Scanner;

public class StringArrayFunc 
{
	static String[] readarray() 
	{
		String name[] = new String[5];
		  name[0]= "Suraj" ;
		  name[1]="Sachin" ;
		  name[2]="Prashant" ;
		  name[3]="Prabhu" ;
		  name[4]="Dipya" ;
		 return name ;
		 
		}
	
	public static void main(String[] args) 
	{
		String[] xyz= readarray();
		System.out.println(xyz);
	}

}
