import java.util.Scanner;

public class pr15_checkprimeamgpalin {
	public static void main(String[] args) {
		int num = 100;
		int count;
		System.out.println("The list of prime numbers from 1-100 are: ");
		for(int i=0; i<=num; i++) {
		count = 0;
		for(int j=2; j<i/2; j++) {
		if(i%j==0) {
		count++;
		break;
		}
		}
		if(count==0) {
		System.out.print(i + " ");
		}
		}
		System.out.println();
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to check if its armstrong or perfect: ");
		int num1 = in.nextInt();
		int ognumber, temp, total = 0;
		ognumber = num1;
        while (ognumber != 0){
        temp = ognumber % 10;
        total = total + temp*temp*temp;
        ognumber /= 10;
        }
        if(total == num1)
        System.out.println(num1 + " is an Armstrong number.");
        else
        System.out.println(num1 + " it is a perfect number.");
    }
}
