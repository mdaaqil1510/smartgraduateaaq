import java.util.Scanner;

public class floydtriangle {
		public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int rows, number = 1, counter, j;
		System.out.println("Enter the number of rows for floyd's triangle:");
		rows = reader.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("****************");
		for ( counter = 1 ; counter <= rows ; counter++ )
		{
		for ( j = 1 ; j <= counter ; j++ )
		{
		System.out.print(number+" ");
		number++;
		}
		System.out.println();
		}
		}
}
