package Topic3_String;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		String[] strSotr = new String[] {"Vlad","Maksim", "Jenia", "Masha"}; 

		Arrays.sort(strSotr);
		for(int i = 0; i <  strSotr.length; i++) {
			System.out.print(strSotr[i] + " ");
		}
	}
}