import java.util.Scanner;

public class whiledemo {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int num, sum = 0;
			System.out.print("Please Enter any integer Value below 10: ");
			num = sc.nextInt();
			while (num <=10)
			{
			sum = sum + num;
			num++;	
			}
			System.out.format(" Sum of the Numbers From the While Loop is: "+sum);
		}
}
