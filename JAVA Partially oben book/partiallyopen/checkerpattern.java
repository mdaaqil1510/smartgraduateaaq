package partiallyopen;

import java.util.Scanner;

public class checkerpattern {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		int size,row,col;
		System.out.print("Please enter the size: ");
		size=in.nextInt();
		for (row=1; row<=size; row++)
		{
		if ((row % 2) == 0) 
		{ 
		System.out.print(" ");	
		}
		for (col=1; col<=size; col++)
		{
	    System.out.print(" *");
	    }
	    System.out.print("\n");
		}
		}
}
