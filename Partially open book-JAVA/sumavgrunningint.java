package partiallyopen;

public class sumavgrunningint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum = 0; 
			double avg; 
			final int LOWERBOUND = 1;
			final int UPPERBOUND = 100;
			for (int number = LOWERBOUND; number <= UPPERBOUND; ++number)
			{
			sum += number; 
			}
			System.out.println("The sum of 1 to 100 is : "+sum);
			avg=sum/UPPERBOUND;
			System.out.println("The average is : "+avg);
			}
	}

