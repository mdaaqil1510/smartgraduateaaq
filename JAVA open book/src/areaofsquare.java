import java.util.Scanner;

public class areaofsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter measurement of a Side of the Square: ");
		double side = scan.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}

}
