package partiallyopen;

import java.util.Scanner;

public class avgwithinputvalidation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max=3;
		int numin;
		int sum=0;
		boolean isvalid;
		double avg;
		Scanner in= new Scanner(System.in);
		for(int studentno=1; studentno<=max;studentno++)
		{
		isvalid = false; 
		do 
		{
		System.out.print("Enter a number between 0-100 : ");
		numin= in.nextInt();
		if (numin >=0&&numin<=100 )
		{
		isvalid = true; 
		} 
		else 
		{
		System.out.println("Invalid input, try again");
		}
		}
		while (!isvalid);
		sum+= numin;
		}
		avg=(double) sum/max;
		System.out.printf("You have entered : %.2f ",avg);
		}
	}
