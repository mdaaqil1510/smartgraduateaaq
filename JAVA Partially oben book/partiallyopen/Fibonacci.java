package partiallyopen;

public class Fibonacci {
	public static void main (String[] args) {
		int n = 3; 
		int fn; 
		int fnMinus1 = 1; 
		int fnMinus2 = 1; 
		int nMax = 20; 
		double avg;
		System.out.println("The first " + nMax + " Fibonacci numbers bare:");
		while (n <= nMax)
		{ 
		System.out.print(fnMinus1 + ", ");
		++n;
		fn= fnMinus1 + fnMinus2;
		fnMinus1 = fnMinus2;
		fnMinus2 = fn;
		}
		avg=fnMinus2/nMax;
		System.out.println("\n Average of series is : "+avg);
		}
}
