package partiallyopen;

import java.util.Scanner;

public class gcdecu {
	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 1st integer : ");
		a = in.nextInt();
		System.out.print("Enter 2nd integer : ");
		b = in.nextInt();
		int res = gcd(a, b);
		System.out.println("The GCD of " + a + " and " + b + " is: " + res);
	}

	public static int gcd(int a, int b) {
		int temp;
		while (b != 0)
		{
		temp = b;
		b = a % b;
		a = temp;
		}
		return a;
	}

	public static int gcdrec (int a, int b) {
		if (b == 0) 
		{
		return a;
		}
		return gcd(b, a % b);
	} 
}
