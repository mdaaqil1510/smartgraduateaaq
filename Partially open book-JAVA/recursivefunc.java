package partiallyopen;

import java.util.Scanner;

public class recursivefunc {
	public static void main(String[]args){
	int n;
	Scanner in =  new Scanner(System.in);
	System.out.print("enter an integer : ");
	n= in.nextInt()
;	for(int i=1;i<=n;i++)
	System.out.println("Factorial" +"("+i+") = "+i+"*"+factorial(i)+" is "+factorial(i));
	}
	static int factorial(int m)
	{
	if(m==1) return m;
	else
	return m*factorial(m-1);
	}
}
