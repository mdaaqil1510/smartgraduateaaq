package partiallyopen;

import java.util.Scanner;

public class salestaxcalculator {
	public static void main(String[] args) {
		final double SALES_TAX_RATE = 0.07;
		  final int sentinal = -1;        
		  double price, actualPrice, salesTax;  
		  double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  
		  Scanner in = new Scanner(System.in);
		  System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		  price =  in.nextDouble();

		  while (price != sentinal) 
		  {
		  salesTax = SALES_TAX_RATE * price;
		  actualPrice = price - salesTax;
		  totalPrice = actualPrice + salesTax;
	      totalActualPrice = actualPrice + actualPrice; 
		  totalSalesTax = salesTax + salesTax;
		  System.out.println("Actual price is $" + String.format("%.2f",actualPrice));
		  System.out.println("Sales Tax is: $" + String.format("%.2f",salesTax));
		  System.out.printf("Total price is: %.2f \n",totalPrice);
		  System.out.printf("Total Actual Price is:  %.2f \n",totalActualPrice);
		  System.out.printf("Total sales tax is: %.2f \n" ,totalSalesTax);
		  
		  System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		  price =  in.nextDouble();
		  }
		  while(price==sentinal)
		  {
			  System.out.println("Bye!!..");
			  break;
		  }

	}
}
