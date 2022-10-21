package partiallyopen;

public class product1ton {
	public static void main(String[] args) {
		long pro = 1;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 13;
		for(int num=LOWERBOUND;num<=UPPERBOUND;num++)
		{
			pro*=num;
		}
		System.out.println("The product of n numbers is : "+pro);
	}

}
