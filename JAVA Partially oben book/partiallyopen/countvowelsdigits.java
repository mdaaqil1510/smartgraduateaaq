package partiallyopen;

import java.util.Scanner;

public class countvowelsdigits {

	public static void main(String[] args) {
		String line;
		double dig, vow;
	    Scanner sc= new Scanner(System.in);
		System.out.print("\n Enter the string : ");
		line = sc.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;
		line = line.toLowerCase();
		for(int i = 0; i < line.length(); ++i)
		{
		char ch = line.charAt(i);
		if(ch=='a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch=='A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U') 
		{
		++vowels;
		}
		else if( ch >= '0' && ch <= '9')
		{
		++digits;
		}
		}
		vow=vowels/line.length()*100;
		dig=digits/line.length()*100;
		System.out.println("No of vowels in string : "+ vowels+" "+vow);
		System.out.println("No of digits in string : "+ digits+" "+dig);
		}

}
