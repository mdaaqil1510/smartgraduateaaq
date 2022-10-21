package partiallyopen;

import java.util.Scanner;

public class fiborec {
	static int fibo(int n) {
	if(n == 1)
	{
	return 0;
	}
	else if(n<=2)
	{
	return 1;
	}
	else
	{
	return fibo(n-1)+fibo(n-2);
	}
	}
	
	static void forfibo(int n) {
	int a=0,b=1,c;
	System.out.print(a+"\t"+b);
	
	for(int i=0; i<n-2; i++)
	{
	c=a+b;
	}
	}
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n;
	System.out.print("Enter the no of terms : ");
	n= in.nextInt();
	System.out.println("The fibonacci series of given term is : ");
	for(int i=1;i<=n;i++)
	{
	System.out.print(fibo(i)+"\t");
	}
	}
}
