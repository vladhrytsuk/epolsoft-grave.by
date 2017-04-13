/*

The hexadecimal digits are the ordinary, base-10 digits ’0’ through ’9’ plus the letters ’A’ (solution)
through ’F’. In the hexadecimal system, these digits represent the values 0 through 15,
respectively. Write a function named hexValue that uses a switch statement to find the
hexadecimal value of a given character. The character is a parameter to the function, and
its hexadecimal value is the return value of the function. You should count lower case
letters ’a’ through ’f’ as having the same value as the corresponding upper case letters.
If the parameter is not one of the legal hexadecimal digits, return -1 as the value of the
function.
A hexadecimal integer is a sequence of hexadecimal digits, such as 34A7, FF8, 174204,
or FADE. If str is a string containing a hexadecimal integer, then the corresponding
base-10 integer can be computed as follows:

value = 0;
for ( i = 0; i < str.length(); i++ )
value = value*16 + hexValue( str.charAt(i) );

Of course, this is not valid if str contains any characters that are not hexadecimal digits.
Write a program that reads a string from the user. If all the characters in the string are
hexadecimal digits, print out the corresponding base-10 value. If not, print out an error
message.

*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic3_String;

import java.util.Scanner;

public class Hex {
	static int hexValue(char a){
		switch(a)
		{
		case '0':return 0;
		case '1':return 1;
		case '2':return 2;
		case '3':return 3;
		case '4':return 4;
		case '5':return 5;
		case '6':return 6;
		case '7':return 7;
		case '8':return 8;
		case '9':return 9;
		
		case 'A':return 10;
		case 'B':return 11;
		case 'C':return 12;
		case 'D':return 13;
		case 'E':return 14;
		case 'F':return 15;
		
		case 'a':return 10;
		case 'b':return 11;
		case 'c':return 12;
		case 'd':return 13;
		case 'e':return 14;
		case 'f':return 15;
		default: return -1;
		}
	}



public static void main(String[] args) {
	String str;
	int value = 0;
	Scanner in = new Scanner (System.in);
	System.out.print("Enter the number in hexadecimal: ");
	str = in.nextLine();
	for (int i = 0; i < str.length(); i++ ){
	value = value*16 + hexValue(str.charAt(i));
	}
	
	if (value >= 0){
	System.out.println("The number in hexadecimal: " + "\"" + str + "\"");
	System.out.println("The number in decimal: " + "\"" + value + "\"");
	}
	else System.err.println("\n\t\t\t\tYou entered an invalid value!");
	in.close();
}
}
