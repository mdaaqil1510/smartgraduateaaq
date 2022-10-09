package partiallyopen;

import java.util.Scanner;

public class reverseint {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int innum; 
		int indigit=0;
		System.out.print("Enter a positive integer : ");
		innum= in.nextInt();
		while (innum > 0)
		{
			int remain = innum % 10;
			indigit= indigit*10+remain;
			innum /= 10; 
		}
	    System.out.println("The reverse of the integer is : "+indigit);	
	}

}
