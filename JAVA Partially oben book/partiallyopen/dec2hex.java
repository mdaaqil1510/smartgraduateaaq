package partiallyopen;

import java.util.Scanner;

public class dec2hex {
	public static void main(String[] args) {
        int dec;
        System.out.print("Enter the decimal number : ");
        Scanner in=new Scanner(System.in);
        dec=in.nextInt();;
        System.out.println("The Hexadecimal equivalant is : "+Integer.toHexString(dec));
    }
}
