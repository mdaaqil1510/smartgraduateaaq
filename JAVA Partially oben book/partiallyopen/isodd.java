package partiallyopen;

import java.util.Scanner;

public class isodd {
	public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        num=in.nextInt();
        in.close();
        if(isodd(num))
        System.out.println(num+" is a odd number");
        else{
        System.out.println(num+" is even number");
        }
    }
    static boolean isodd(int num){
        boolean n=true;
        if(num%2==0)
        {
            n=false;
        }
        return n;
    }
}
