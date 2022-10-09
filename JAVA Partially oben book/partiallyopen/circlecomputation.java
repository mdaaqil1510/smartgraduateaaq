package partiallyopen;

import java.util.Scanner;

public class circlecomputation {
	public static void main(String[] args) {
		double radius, diameter, circum, area;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius= in.nextDouble();
		diameter = 2.0 * radius;
		area = Math.PI * radius * radius;
		circum = 2.0 * Math.PI * radius;
		System.out.printf("Diameter is      : %.2f%n", diameter);
		System.out.printf("Area is          : %.2f%n", area);
		System.out.printf("Circumfereence is: %.2f%n", circum);
		
		}
}
