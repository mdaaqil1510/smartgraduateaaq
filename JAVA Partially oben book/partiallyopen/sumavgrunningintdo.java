package partiallyopen;

public class sumavgrunningintdo {
	public static void main(String[] args) {
		int sum=0;
		double avg; 
		int num = 1; 
		do 
		{
		sum += num; 
		num++; 
		}
		while (num <= 100);
		{
		System.out.println("Sum of 1 to 100 is : "+sum); 
		avg=sum/100;
		System.out.println("Average is : "+avg);
		}
	}

}
