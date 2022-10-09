package partiallyopen;

public class computePI {
	public static void main(String[] args) {
		double sum =0.0;
		final int MAX_DENOMINATOR = 1000000;
		for(int denominator =1; denominator <=MAX_DENOMINATOR; denominator +=2) {
		if (denominator % 4 == 1) 
		{
		sum += 1.0/denominator;
		} 
		else if (denominator % 4 == 3) {
		sum -= 1.0/denominator;
		}
		else 
		{
		System.out.println("Impossible!!!");
		}
		}
		System.out.println("The sum is : "+sum);
		System.out.println(Math.PI);
	}
}
//MAX_DENOMINATOR =>1000= 0.7848981638974463
//MAX_DENOMINATOR =>10000=0.7853481633979478
//MAX_DENOMINATOR =>1000000=0.785397663397423