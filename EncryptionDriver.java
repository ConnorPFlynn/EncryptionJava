//Connor Flynn
//September 25, 2018
//Computer Science II, Section II
//Project I

import java.util.Scanner;

public class EncryptionDriver
{

public static void main(String[] args)
    {
    	Encryption text = new Encryption();
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your text to be encrypted:");
        String en = text.doEncryption(scan.nextLine().toLowerCase());

        System.out.println("Encrypted text: " + en);
        String de = text.doDecryption(en);
        System.out.println("Decrypted text: " + de);
    }
   }