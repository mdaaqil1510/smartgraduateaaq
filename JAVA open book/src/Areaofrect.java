import java.util.Scanner;

public class Areaofrect {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the length of Rectangle: ");
		double length = scan.nextDouble();
		System.out.print("\n Enter the width of Rectangle: " );
		double width = scan.nextDouble();
		double area = length*width;	
		System.out.println("Area of Rectangle is: "+area);
	}
}
