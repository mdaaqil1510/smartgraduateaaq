package partiallyopen;

import java.util.Scanner;

public class swap2int {
	public static void main(String[] args) {
		int num1;
		int num2;
		int temp;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		num1= in.nextInt();
		System.out.print("Emter number 2 : ");
		num2= in.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After the swap, first integer is : "+num1+" second integer is: "+num2);
		
	}
}
