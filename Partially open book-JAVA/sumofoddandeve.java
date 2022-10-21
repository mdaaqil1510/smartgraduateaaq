package partiallyopen;

public class sumofoddandeve {
	public static void main(String[] args) {
	
	int sumOdd = 0; 
	int sumEven = 0; 
	int absDiff; 

	 for (int num = 1; num<=100;num++) 
	 {
	 if (num%2!=0)
	 {
	 sumOdd += num;
	 }
	 else 
	 {
	 sumEven += num;
	 }
	 }
	 System.out.println("Sum of odd numbers fron 1 to 100 : "+sumOdd);
	 System.out.println("Sum of even numbers from 1 to 100 : "+sumEven);
	 
	
	 absDiff = (sumOdd > sumEven) ? sumOdd-sumEven:sumEven-sumOdd;
	 System.out.println("Difference of numbers is : "+absDiff);
	 }
}

