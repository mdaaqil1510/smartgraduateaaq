import java.util.Scanner;

public class inputarray {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.print("Enter 10 elements:");
		for (int i=0; i<10; i++)
		{
		array[i] = scan.nextInt();	
		}
		for( int num : array) 
		{
		sum = sum+num;
		}
		System.out.println("Sum of array elements is: "+sum);
	}
}
