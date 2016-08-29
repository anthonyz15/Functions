/**
* StringEncryptor class contains methods needed to encrypt a string
* as specified in P1 ICOM4015 Sem 151
* @author Enrique A. Marrero Torres
*/
public class StringEncryptor {
private static final int ALENGTH = 26;
/**
* Encrypt a string using a given key value.
* @param s the String to be encrypted
* @param key the key
* @return the encrypted string
*/
public static String encryptString(String s, int key) {
	// if the key value is not in the accepted range (-25..25)
			// the encrypted string is the same as the input string
			if (key < -25 || key > 25) 
				return s; 

			// the key is valid, construct the encrypted string as 
			// described in P1 specs...
			String newString = ""; 
			char [] newStringChar=s.toCharArray();

			for(int i = 0;i<s.length();i++)
			{
				newStringChar[i]=encryptChar(s.charAt(i),key);
				newString=String.valueOf(newStringChar);
			}
		return newString;
}
/**
* Encrypt a particular character.
* @param ch the character to encrypt assumed
to be a letter ‘a’..’z’ or ‘A’..’Z’
* @param key the key to be used. It is assumed to be a value in range (25..
25)
* @return the new character after encryption
*/
private static char encryptChar(char ch, int key) {
// PRE: ch is a letter 'A'..'Z' or 'a'..'z'
// PRE: key is an integer in the range 25..25
int base;
if (Character.isUpperCase(ch))
base = (int) 'A';
else
	base = (int) 'a';
	return (char) (Math.abs((((int) ch-base)+ key + ALENGTH)% ALENGTH) + base);
}
}