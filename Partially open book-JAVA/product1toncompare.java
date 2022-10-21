package partiallyopen;

public class product1toncompare {
	public static void main(String[] args) {
		long pro1 = 1;
		long pro2 = 1;
		long pro3 = 1;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 11;
		final int LOWERBOUND1 = 1;
		final int UPPERBOUND1 = 12;
		final int LOWERBOUND2 = 1;
		final int UPPERBOUND2 = 13;

		for(int num=LOWERBOUND;num<=UPPERBOUND;num++)
		{
			pro1*=num;
		}
		System.out.println("The product of 1 to 11 numbers is : "+pro1);
		
		for(int num1=LOWERBOUND1;num1<=UPPERBOUND1;num1++)
		{
			pro2*=num1;
		}
		System.out.println("The product of 1 to 12 numbers is : "+pro2);
		
		for(int num2=LOWERBOUND2;num2<=UPPERBOUND2;num2++)
		{
			pro3*=num2;
		}
		System.out.println("The product of 1 to 13 numbers is : "+pro3);
		
		if (pro1>pro2 && pro1>pro3)
		{ 
		System.out.println("the product from 1 to 11 is greatest");
		}
		else if (pro2>pro1 && pro2>pro3)
		{
		System.out.println("the product from 1 to 12 is greatest");
		} 
		else 
		{
		System.out.println("the product from 1 to 13 is greatest");
		} 
		
		
		
		
	
			
	}

}
