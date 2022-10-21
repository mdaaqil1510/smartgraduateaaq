package partiallyopen;

import java.util.Scanner;

public class reversestring {
	public static void main(String[] args) {
		String instr; 
		String instrlen=""; 
		Scanner in= new Scanner(System.in);
		System.out.print("Enter a String: ");
		instr= in.next();
		for(int i = instr.length()-1; i>=0; i--){
	   	instrlen = instrlen + instr.charAt(i);
	    }
	    
	    System.out.print("The reversed string of the '"+instr+"' is: " );
	    System.out.println(instrlen);
	}
}
