import java.util.Scanner;

public class pr13_result2darr {
	    public static void main(String[] args) {
	    	System.out.print("Enter the number of students : ");
	        Scanner in=new Scanner(System.in);
	        final int max=in.nextInt();
	        int[][] arr=new int[max][5];
	        for(int i=0;i<max;i++)
	        {
	        System.out.print("\nEnter the 5 marks of the student "+(i+1)+" : ");
	        for(int j=0;j<5;j++)
	        {
	        arr[i][j]=in.nextInt();
	        }
	        }
	        int tot[]=new int[5];
	        for(int i=0;i<max;i++)
	        {
	        for(int j=0;j<5;j++)
	        {
	        tot[i]=tot[i]+arr[i][j];
	        }
	        }
	        for(int i=0;i<max;i++)
	        {
	        {
	        System.out.println("The total marks of the student "+(i+1)+" is "+tot[i]);
	        }
	        }
	        
	    }
}

