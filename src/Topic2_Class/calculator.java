/*Write an application that inputs three integers from the user and displays the sum, average, product, 
smallest and largest of the numbers.Use separate method for each operation.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic2_Class;

import java.util.Scanner;

public class calculator {

	private int sum, average, product, max, min;
	
	   private int sum (int a, int b, int c){
		   sum = a+b+c;
         return sum;
	   }
	   
	   private int average (int a, int b, int c){
		   average = (a+b+c)/3;
         return average;
	   }
	   
	   private int product (int a, int b, int c){
		   product = a*b*c;
         return product;
	   }
	   
	   private int min (int a, int b, int c){
			int []mas = new int[3];
			mas[0] = a;
			mas[1] = b;
			mas[2] = c;
			for(int i = 0; i < mas.length; i++){
				min = mas[i];
				for (int j = 0; j < mas.length; j++) {
					if (min > mas[j]) min = mas[j];
				}
			}
         return min;
	   }
	   
	   private int max (int a, int b, int c){
			int []mas = new int[3];
			mas[0] = a;
			mas[1] = b;
			mas[2] = c;
			for(int i = 0; i < mas.length; i++){
				max = mas[i];
				for (int j = 0; j < mas.length; j++) {
					if (max < mas[j]) max = mas[j];
				}
			}
         return max;
	   }
	   
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner( System.in );
		System.out.print("Enter the number A: \n>");
		a = in.nextInt();
		System.out.print("Enter the number B: \n>");
		b = in.nextInt();
		System.out.print("Enter the number C: \n>");
		c = in.nextInt();
        
		calculator ob = new calculator();
		int sum = ob.sum(a, b, c);
		int average = ob.average(a, b, c);
		int product = ob.product(a, b, c);
		int min = ob.min(a, b, c);
		int max = ob.max(a, b, c);
		System.out.println("Result:\n" + "The sum = " + sum + "\nThe average = " + average + "\nThe product = " + product);
		System.out.println("The min = " + min + "\nThe max = " + max);
		in.close();
	}

}
