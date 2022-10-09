package partiallyopen;

import java.util.Scanner;

public class checkhexstr {
	 public static void main(String[] args){
	String s;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a hexa string : ");
    s= in.nextLine();
    int n = s.length();
    for (int i = 0; i < n; i++) {
    char ch = s.charAt(i);
    if ((ch < '0' || ch > '9')&& (ch < 'A' || ch > 'F') && (ch < 'a'|| ch > 'f'))
    {
    System.out.println("\""+s+"\""+" is Not a hexa string ");
    return;
    }
    }
    System.out.println("\""+s+"\""+" is a hexa string ");
    }
   
}
