package partiallyopen;

import java.util.Scanner;

public class checkbinstr {
	 public static void main(String args[]) 
     { 
     int r=0,c=0,num,b; 
     Scanner sl=new Scanner(System.in); 
     System.out.print("Enter a binary string : "); 
     num=sl.nextInt(); 
     b= num; 
     while(num>0) 
     { 
     if((num %10==0)|| (num%10==1)) 
     c++; 
     r++; 
     num=num/10; 
     } 
     if(c==r) 
     System.out.println("\""+b+"\""+" is a Binary Number."); 
     else 
     System.out.println("\""+b+"\""+" is NOT a Binary Number"); 
     } 
}
