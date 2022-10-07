import java.util.Scanner;

public class pr27_investgrowth {
	 public static void main(String[] args) {
	        double invest;
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the invest : ");
	        invest= in.nextDouble();
	        System.out.println();
	        invest=invest+(((double)40/100)*invest);
	        invest=invest-1500;
	        invest=invest+(((double)12/100)*invest);

	        System.out.println("The investment gonna worth : "+invest);
	    }
}
