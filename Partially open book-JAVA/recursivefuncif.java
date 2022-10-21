package partiallyopen;

import java.util.Scanner;

public class recursivefuncif {
	 int factorial(int n)
	    {
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	    }
	 	public static void main(String args[])
	    {
	 	recursivefuncif obj = new recursivefuncif();
	    int n;
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter an integer : ");
	    n= in.nextInt();
	    System.out.println("Factorial of " + n+ " is : " + obj.factorial(n));
	    }
}
