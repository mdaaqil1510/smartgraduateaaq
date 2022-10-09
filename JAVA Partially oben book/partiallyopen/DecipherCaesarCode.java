package partiallyopen;

import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.print(" Input the ciphertext string : ");
    String ciphertext = sc.nextLine();
    System.out.print("\n Enter the shift value : ");
    int shift = sc.nextInt();
    String decryptMessage = "";
    for(int i=0; i < ciphertext.length();i++)  
    {
    char alphabet = ciphertext.charAt(i);
    if(alphabet >= 'a' && alphabet <= 'z')
    {
    alphabet = (char) (alphabet - shift);
    if(alphabet < 'a') {
    alphabet = (char) (alphabet-'a'+'z'+1);
    }
    decryptMessage = decryptMessage + alphabet;
    }    
    else if(alphabet >= 'A' && alphabet <= 'Z')
    {
    alphabet = (char) (alphabet - shift);
    if (alphabet < 'A')
    {
    alphabet = (char) (alphabet-'A'+'Z'+1);
    }
    decryptMessage = decryptMessage + alphabet;            
    }
    else 
    {
    decryptMessage = decryptMessage + alphabet;            
    } 
    }
    System.out.println("\n The plaintext string is : " + decryptMessage);
    }
}
