package partiallyopen;

import java.util.Scanner;

public class sumofdigits {
	public static void main(String[] args) {
		int num, digit, sum = 0;  
	    Scanner in= new Scanner(System.in);
		System.out.print("Enter a positive integer : ");  
		num = in.nextInt();  
		while(num > 0)  
		{    
		digit = num % 10;  
		sum = sum + digit;  
		num = num / 10;  
		}   
		System.out.println("Sum of all digits: "+sum); 
	}
}
