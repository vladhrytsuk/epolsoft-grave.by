package Topic3_String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String str;
		Scanner in = new Scanner( System.in );
		System.out.print("Enter the string: ");
		str = in.nextLine();
		System.out.println();
		
		System.out.println("\t\tMethod StringBuffer: ");
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
		
		System.out.println("\t\tMethod StringBuilder: ");
		StringBuilder sb1 = new StringBuilder(str);
		sb1.reverse();
		System.out.println(sb1.toString());
		in.close();
	}

}
