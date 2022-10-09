package partiallyopen;

import java.util.Scanner;

public class Add2integer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		int sum;
		System.out.print(" Enter 1st integer : ");
		num1=in.nextInt();
		System.out.print("\n Enter 2nd integer : ");
		num2=in.nextInt();
		in.close();
		sum=num1+num2;
		System.out.println();
		System.out.println(" The sum of two numers is : "+sum);
	}
}
