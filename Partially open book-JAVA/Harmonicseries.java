package partiallyopen;

public class Harmonicseries {
	public static void main(String[] args) {
		final int MAX_DENOMINATOR = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;
		for (long denominator =1;denominator <= MAX_DENOMINATOR; ++denominator) 
		{
		sumL2R += (double)1/denominator;
		}
		System.out.println("The sum from left is :" +sumL2R);
		for (long denominator =1;denominator <= MAX_DENOMINATOR; ++denominator) 
		{
		sumR2L += (double)(1)/(MAX_DENOMINATOR-denominator+1);
		}
		System.out.println("The sum from left is :" +sumR2L);
		if (sumL2R > sumR2L)
		{
		absDiff=sumL2R-sumR2L;
		System.out.println("Difference of sereis is : "+absDiff);
		}
		else if(sumR2L > sumL2R)
		{
		absDiff=sumR2L-sumL2R;
		System.out.println("Difference of series is : "+absDiff);	
		}
		else
		{
		absDiff=0;
		System.out.println("Difference of series is : "+absDiff);	
		}
			
			
			
		
		
	}
	
}

