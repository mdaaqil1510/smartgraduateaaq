package partiallyopen;

import java.util.Scanner;

public class triangularpatterns {
	public static void main(String[] args) {
		int size;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size : ");
		size= in.nextInt();
		for (int i = 0; i <=size; i++) 
		{
		for (int j = 0; j <= i; j++) {
		System.out.print("*");
		}
		System.out.println();
		}
		System.out.println();
		for (int i = 0; i < size; i++) 
		{
		for (int j = 1; j < size - i; j++) {
		System.out.print(" ");
		}
		for (int k = 0; k <= i; k++) {
		System.out.print("*");
		}
		System.out.println();
		}
		System.out.println();
		for (int i = 0; i < size; i++) 
		{
		for (int j = 0; j < size - i; j++) {
		System.out.print("*");
		}
		System.out.println();
		}
		System.out.println();
		for (int i = 0; i < size; i++) 
		{
		for (int j = 0; j < i; j++) {
		System.out.print(" ");
		}
		
		for (int j = size; j > i; j--) {
		System.out.print("*");
		}
		System.out.println();
		}
	}
}
