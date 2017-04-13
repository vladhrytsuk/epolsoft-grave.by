package Topic4_Array;

import java.util.Scanner;

public class Hex2Bin {
    public static int hexValue(char a) {
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
		String[] hexBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
		
		String binStr = "";
		String hexStr;
		
		Scanner in = new Scanner (System.in);
		System.out.print("Enter a Hexadecimal string: ");
		hexStr = in.nextLine();
		in.close();
		
        for(int i = 0; i < hexStr.length(); i++) {
            
        }
		
		for (int i = 0; i < hexStr.length(); i++) {
			int val = hexValue(hexStr.charAt(i));
			if(val == -1) {
                System.err.println("\n\t\t\tError: Invalid Hexadecimal String "
                        + "\"" + hexStr + "\"");
                return;
            }
			else {
			 binStr += hexBits[val] + " ";
			}
        }
        
        System.out.println("The equivalent binary"
                + " for hexadecimal \"" + hexStr + "\" is " + binStr);
		}
	}

