package partiallyopen;

import java.util.Scanner;

public class bin2dec {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter a binary string : ");
        Scanner in=new Scanner(System.in);
        str=in.next();
        boolean 
        isvalid=false;
        char ch;
        for(int get=0;get<str.length();get++)
        {
        ch=str.charAt(get);
        if(ch=='0'||ch=='1')
        {
        isvalid=true;
        }
        else
        {
        isvalid=false;
        break;
        }
        }
        if(isvalid)
        {
        int decimal=Integer.parseInt(str, 2);
        System.out.println("The equivalent decimal for "+"\""+str+"\" is :"+ decimal);
        }
        else
        System.out.println("Error:  invalid binary string "+"\""+str+"\"");
    }
}
