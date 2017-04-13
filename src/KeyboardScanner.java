import java.util.Scanner;

/*Write a program called KeyboardScanner to prompt user for an int, a double, and a String. 
The output shall look like (the inputs are shown in bold):
Enter an integer: 12
Enter a floating point number: 33.44
Enter your name: Peter
Hi! Peter, the sum of 12 and 33.44 is 45.44*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner in_n = new Scanner( System.in );
		Scanner in_s = new Scanner( System.in );
		int n = 0;
		double a = 0, sum = 0;
		String str;
		System.out.print("Enter an integer: ");
		n = in_n.nextInt();
		System.out.print("Enter a floating point number: ");
		a = in_n.nextDouble();
		System.out.print("Enter your name:  ");
		str = in_s.nextLine();
		sum = a + n;
		System.out.println("\nHi! " + str + ", the sum of " + n + " and " + a + " is " + sum);
		in_n.close();
		in_s.close();
	}

}
