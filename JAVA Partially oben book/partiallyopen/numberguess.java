package partiallyopen;

import java.util.Random;
import java.util.Scanner;

public class numberguess {
	 public static void main(String[] args) 
	    { 
	        int ans, guess; 
	        final int MAX = (int)(Math.random()*100); 
	        Scanner in = new Scanner(System.in); 
	        Random rand = new Random(); 
	        boolean bl = false; 
	        ans = rand.nextInt(MAX) + 1; 
	        while (!bl) 
	        { 
	        System.out.print("Guess a number between 1 and 100: "); 
	        guess = in.nextInt(); 
	        if (guess > ans) 
	        { 
	        System.out.println("Try lower"); 
	        } 
	        else if (guess < ans) 
	        { 
	        System.out.println("try higher"); 
	        } 
	        else { 
	        System.out.println( "You got it"); 
	        bl = true; 
	        } 
	        } 
	        System.exit(0); 
	    } 
}
