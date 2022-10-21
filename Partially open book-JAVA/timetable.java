package partiallyopen;

import java.util.Scanner;

public class timetable {
	public static void main(String[] args) {
	int size;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size : ");
	size=in.nextInt();
	for(int i=1;i<=size;i++)
	{
	System.out.println(" ");
	for(int j=1;j<=size;j++)
	{
		System.out.print(i*j+" ");
	}
	System.out.println(" ");
	}
}
}
