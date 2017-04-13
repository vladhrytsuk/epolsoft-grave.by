/*Write a program to extract each digit from an int, in the reverse order. 
 For example, if the int is 1542, the output shall be "2,4,5,1", with a comma separating the digits.
Hints: Use n % 10 to extract a digit; and n = n / 10 to discard the last digit.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

public class ExtractingDigits {

	public static void main(String[] args) {
		int n,Num1,Num2,Num3,Num4;
		n = 1542;
        Num1 = n / 1000; // 1.542 â int = 1
		Num2 = (n / 100) % 10; // 5.42 â int  = 5
		Num3 = (n % 100) / 10; // 4.2 â int = 4
		Num4 = n % 10; // 2.0 â int = 2
		System.out.println(Num4 + "," + Num3 + "," + Num2 + "," + Num1);
	}

}
