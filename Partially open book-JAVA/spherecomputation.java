package partiallyopen;

import java.util.Scanner;

public class spherecomputation {
	public static void main(String[] args) {
		double radius, surarea, vol;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere : ");
		radius= in.nextDouble();
		surarea = 4 * Math.PI * radius * radius;
		vol = 4 /3 * Math.PI * radius * radius * radius;
		System.out.printf("Surface area is      : %.2f%n",surarea);
		System.out.printf("Volume is            : %.2f%n", vol);
}
}
