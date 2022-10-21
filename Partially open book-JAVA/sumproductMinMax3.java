package partiallyopen;

import java.util.Scanner;

public class sumproductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3; 
		int sum, pro, min, max;
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter 1st integer     \t: ");
		num1=in.nextInt();
		System.out.print("\n Enter 2nd integer     \t: ");
		num2=in.nextInt();
		System.out.print("\n Enter 3rd integer     \t: ");
		num3=in.nextInt();
		sum=num1+num2+num3;
		pro=num1*num2*num3;
		min=num1;
		if (num2 < min) 
		{
		min = num2; 
		}
		if (num3 < min) 
		{
		min = num3; 
		}
		else
		{
		min= num1;
		}
		max=num1;
		if (num2 >max) 
		{
		max = num2; 
		}
		if (num3 > max) 
		{
		max = num3; 
		}
		else
		{
		max= num1;
		}
		System.out.println("Sum of the integers is     : "+sum);
		System.out.println("Product of the integers is : "+pro);
		System.out.println("Minumun integer            : "+min);
		System.out.println("Maximum integer            : "+max);
		
	}

}
