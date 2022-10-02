import java.util.Scanner;

public class oddoreven {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num;
		System.out.print("Enter an integer : ");
		num=in.nextInt();
		if(num%2==0)
		{
			System.out.println("You entered an even number");
		}
		else
			System.out.println("You entered an odd number");
	}
}
