package partiallyopen;

import java.util.Scanner;

public class inputvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numin;
		boolean isvalid;
		Scanner in= new Scanner(System.in);
		isvalid = false; 
		do 
		{
		System.out.print("Enter a number between 0-10 or 90-100 : ");
		numin= in.nextInt();
		if (numin >=0&&numin<=10 || numin>=90&&numin<=100 )
		{
		isvalid = true; 
		} 
		else 
		{
		System.out.println("Invalid input, try again");
		}
		}
		while (!isvalid);
		{
		System.out.println("You have entered : "+numin);
		}
	}
	}

