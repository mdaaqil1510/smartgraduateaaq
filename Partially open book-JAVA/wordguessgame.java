package partiallyopen;

import java.util.Scanner;

public class wordguessgame {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String word = "smart";
	String guess = "";
	int guesses = 0;
	int guesslimit = 10;
	boolean bl = false;
	System.out.println("Maximum 10 chance ");
	System.out.println("HINT : It related to our batch");
	while(!guess.equals(word) && !bl)
	{
	if(guesses < guesslimit)
	{
	System.out.print("\nEnter a guess (Use underscore to typre two words, if you think it is a two word) : ");
	guess = in.nextLine();
	guesses++;
	} else 
	{
	bl = true;
	}
	}
	if(bl)
	{
	System.out.println("\nbetter luck next time!");
	} else
	{
	System.out.println("\ncongrats!!");
	}
}
}