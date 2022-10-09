package partiallyopen;

import java.util.Scanner;
public class printarrinstar {
	public static void main(String[] args) {
        System.out.print("Enter the number of items : ");
        Scanner in=new Scanner(System.in);
        final int max=in.nextInt();
        int[] arr=new int[max];
        System.out.print("\nEnter the values of items : ");
        if(max>0)
        for(int i=0;i<max;i++)
       {
        arr[i]=in.nextInt();
        }
        System.out.println("\nThe elements of the arrays are : ");
        for(int i=0;i<max;i++)
        {
        for(int sr=1;sr<=arr[i];sr++)
        {
        System.out.print("*");
        }
        System.out.print("("+arr[i]+")");
        System.out.println();
        }
    }
}
