package partiallyopen;

import java.util.Scanner;

public class incometaxcalculatorsentinal {
	public static void main(String[] args) {
		final double tab20k = 0.1;
		final double tab40k = 0.2;
		final double tab60k = 0.3;
		final int sentinal= -1;
		int ti;
		double tp, tpo;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the taxable income (or -1 to end):$");
		ti = in.nextInt();
		while(ti!= sentinal)
		{
		if (ti <= 20000) 
		{ 
		tpo =ti*0 ;
		}
		else if (ti > 20000 && ti < 40000) 
		{ 
		tp = (ti-20000)+5000;
		tpo=tab20k*tp;
		}
		else if (ti > 40000 && ti < 60000) 
		{ 
		tp = (ti-40000)+10000;
		tpo=tab40k*tp;
		}
		else 
		{ 
		tp = (ti-60000)+20000;
		tpo=tab60k*tp;
		}
		
		System.out.printf("The income tax payable is: $%.2f%n", tpo);
		System.out.print("Enter the taxable income (or -1 to end): $");
		ti = in.nextInt();
}
		while(ti== sentinal)
		{
			System.out.println("Bye!!..");
			break;
		}
	}
}
