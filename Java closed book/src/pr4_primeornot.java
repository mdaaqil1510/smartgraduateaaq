import java.util.Scanner;

public class pr4_primeornot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		boolean bl = false; 	
		for(int i=2; i<=n/2; i++) 
		{
		if(n%i==0) 
		{
		bl = true;
		break;
		}
		}
		if(bl==false)
		{
		System.out.println(n + " is a prime number");
		}else 
		{
		System.out.println(n + " is not a prime number");
		}
	}
}
