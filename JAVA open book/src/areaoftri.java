import java.util.Scanner;

public class areaoftri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the width of the Triangle: ");
		double base = scan.nextDouble();
		System.out.print("\n Enter the height of the Triangle: ");
		double height = scan.nextDouble();
		//Area = (width*height)/2
		double area = (base* height)/2;
		System.out.println("Area of Triangle is: " + area);
	}
}
