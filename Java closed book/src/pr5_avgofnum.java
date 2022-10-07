import java.util.Scanner;

public class pr5_avgofnum {
	void avg(int a, int b, int c){
		double avg = (double)(a + b + c)/3;
		System.out.println("The average is: " + avg);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 3 number : ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		System.out.println();
		pr5_avgofnum obj = new pr5_avgofnum();
		obj.avg(n1, n2, n3);
	}
}
