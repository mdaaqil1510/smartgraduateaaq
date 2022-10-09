package partiallyopen;

import java.util.Scanner;

public class exchangecipher {
	    public static void main(String[] args) {
	        String str;
	        String ex="";
	        Scanner in=new Scanner(System.in);
	        System.out.print("Enter the string : ");
	        str=in.next().toUpperCase();
	        char ch;
	        for(int get=0;get<str.length();get++)
	        {
	        ch=str.charAt(get);
	        ex=ex+((char)(('A'+'Z')-ch));
	        }
	        System.out.println("The ciphered text is :  "+ex);
	        }
}
