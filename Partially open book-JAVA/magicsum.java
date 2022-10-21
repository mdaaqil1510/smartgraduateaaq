package partiallyopen;

import java.util.Scanner;

public class magicsum {
	 static int sum;
	    public static void main(String[] args) {
	        final int SENTINAL=-1;
	        int num;
	        Scanner in=new Scanner(System.in);
	        System.out.print("Enter a positive integer (or -1 to end) : ");
	        num=in.nextInt();
	        while(num!=SENTINAL)
	        {
	        if(haseight(num))
	        {
	        tend(num);
	        }
	        System.out.print("Enter a positive integer (or -1 to end) : ");
	        num=in.nextInt();
	        }
	        System.out.println("The magic sum is : "+sum);
	    	}

	    	static boolean haseight(int num){
	        boolean n=false;
	        int check;
	        while(num>0)
	        {
	        check=num%10;
	        if(check==8)
	        {
	        n=true;
	        break;
	        }
	        num=num/10;
	        }
	        return n;
	    	}

	    	static void tend(int num){
	    	sum=sum+num;
	    }
}
