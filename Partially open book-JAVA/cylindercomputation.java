package partiallyopen;

import java.util.Scanner;

public class cylindercomputation {
	public static void main(String[] args) {
		double radius, surarea, basearea;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder : ");
		radius= in.nextDouble();
		basearea = Math.PI * radius * radius;
		surarea = 2.0 * Math.PI * radius + 2.0 * basearea;
		System.out.printf("Surface area is   : %.2f%n",surarea);
		System.out.printf("Basearea is       : %.2f%n", basearea);
}
}
