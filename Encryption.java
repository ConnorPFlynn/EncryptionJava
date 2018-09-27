//Connor Flynn
//September 25, 2018
//Computer Science II, Section II
//Project I

import java.util.Scanner;
public class Encryption
{

    public static char alphabet[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z', ' ' }; 

    public static char key[] = {'r', 'a', 's', 'k', 'o', 'q', 'g', 'f', 'c', 'y', 'j',
            'x', 'u', 'z', 'n', 'h', 'i', 'p', 'm', 'l', 'd', 'w', 'b', 'e', 't', 'v', ' '}; 

    public static String doEncryption(String x) 
    {
        char alist[] = new char[(x.length())];

        for (int i = 0; i < x.length(); i++)
        {
            for (int j = 0; j < 27; j++)
            {
                if (alphabet[j] == x.charAt(i))
                {
                    alist[i] = key[j]; 
                }
            }
        }
        return (new String(alist)); 
    }

    public static String doDecryption(String x)
    {
        char clist[] = new char[(x.length())];

        for (int i = 0; i < x.length(); i++)
        {
            for (int j = 0; j < 27; j++)
            {
                if (key[j] == x.charAt(i))
                {
                    clist[i] = alphabet[j];
                }
            }
        }
        return (new String(clist));
    }
    

   }

