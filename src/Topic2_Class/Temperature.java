package Topic2_Class;

import java.util.Scanner;

public class Temperature {
	private double K, C, F;
	public Temperature (double F){
		this.F = F;
	}

	private double celsius (){
		C =  (double) 5/9 *(F-32);
		return C;
	}
	
	private double Kelvin  (){
		K = celsius() + 273.15;
		return K;
	}
	
	public static void main(String[] args) {
		double n;
		Scanner in = new Scanner( System.in );
		System.out.print("Enter Fahrenheit degree: ");
		n = in.nextInt();
		Temperature ob = new Temperature(n);
		
		System.out.println("Fahrenheit degree: " + n);
		System.out.println("Converts a Fahrenheit degree to Celsius -> " + ob.celsius());
		System.out.println("Converts a Fahrenheit degree to Kelvin -> " + ob.Kelvin());
		in.close();

	}

}
