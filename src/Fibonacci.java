/*Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. 
Also compute their average.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1, b = 1, number = 20, fibanachi = 0, i = 2;
		float average = 0, sum = 0;
        System.out.print("The first 20 Fibonacci numbers are:\n" + a + " " + b + " ");
		while (i < number) {
	    	fibanachi = a + b;
	    	a = b;
	    	b = fibanachi;
	    	sum = a + b + fibanachi;
	    	i++;
	    	System.out.print(fibanachi + " ");
		}
		average = sum/number;
		System.out.print("\nThe average is " + average);

	}

}
