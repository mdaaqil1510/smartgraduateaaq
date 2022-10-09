package partiallyopen;

import java.util.Arrays;

public class swaparr {
	 public static void main(String[] args)  {
	        int [] firstArr  = {99,20,15,02,10,25};
	        int [] secondArr = {30,69,19,25,22,40};
	        int temp;
	        System.out.println("firstArr before swapping : "+Arrays.toString(firstArr));
	        System.out.println("secondArr before swapping : "+Arrays.toString(secondArr));
	        System.out.println();
	        for(int i = 0 ; i<firstArr.length;i++)
	        {
	        	temp = firstArr[i];
	        	firstArr[i] = secondArr[i];
	        	secondArr[i] = firstArr[i];
	        }
	        System.out.println("firstArr after swapping : "+Arrays.toString(firstArr));
	        System.out.println("secondArr after swapping : "+Arrays.toString(secondArr));

	    }
}
