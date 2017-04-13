/*Exercise SumAndAverage (Loop): Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., 
to an upperbound (e.g., 100). Also compute and display the average.
TRY:
1.Modify the program to use a "while-do" loop instead of "for" loop.
2.Modify the program to use a "do-while" loop.
3.What is the difference between "for" and "while-do" loops? What is the difference between "while-do" 
and "do-while" loops?
4.Modify the program to sum from 111 to 8899, and compute the average. 
Introduce an int variable called count to count the numbers in the specified range.
5.Modify the program to sum only the odd numbers from 1 to 100, and compute the average. 
(Hint: n is an odd number if n % 2 is not 0.)
6.Modify the program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
7.Modify the program to find the "sum of the squares" of all the numbers from 1 to 100,
i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

public class SumAndAverage {
	public static void main(String[] args) {
		float n = 100;
		For_loop ();
		while_do_loop(n);
		do_while_loop(n);
		Modify_4 ();
		Modify_5 (n);
		Modify_6 (n);
		Modify_7 (n);
	}
/*---------------------------------------------------------------------------------*/
	public static void For_loop () {
	int SumFor = 0, i;
	float AverageFor, n = 100;
	System.out.println("The For loop:");
	for (i = 1; i <= n; i++){ /*Цикл чисел от 1 до n*/
		SumFor = SumFor + i; /*Сумма всех чисел от 1 до n*/
	}
	AverageFor = SumFor/n; /*Среднее число, всех чисел от 1 до n*/
	System.out.println("The Sum is " + SumFor);
	System.out.println("The Average is " + AverageFor);
	}
/*---------------------------------------------------------------------------------*/
	public static void while_do_loop (float n) {
	int SumWhile = 0, j = 1;
	float AverageWhile;
	System.out.println("\n1. Modify (The while-do loop):");
	while(j <= n){
		SumWhile = SumWhile + j; /*Сумма всех чисел от 1 до n*/
		j++;
	}
	AverageWhile = SumWhile/n; /*Среднее число, всех чисел от 1 до n*/
	System.out.println("The Sum is " + SumWhile);
	System.out.println("The Average is " + AverageWhile);
	}
/*---------------------------------------------------------------------------------*/
	public static void do_while_loop (float n) {
	int SumDoWhile = 0, k = 1;
	float AverageDoWhile;
	System.out.println("\n2. Modify (The do-while loop):");
	do{
		SumDoWhile = SumDoWhile + k; /*Сумма всех чисел от 1 до n*/
		k++;
	}
	while(k <= n);
	AverageDoWhile = SumDoWhile/n; /*Среднее число, всех чисел от 1 до n*/
	System.out.println("The Sum is " + SumDoWhile);
	System.out.println("The Average is " + AverageDoWhile);
	}
/*---------------------------------------------------------------------------------*/
	public static void Modify_4 () {
	int Sum1 = 0, a;
	float Average1, b;
    System.out.println("\n4. Modify (from 111 to 8899):");
    for (a = 111; a <= 8899; a++){ /*Цикл чисел от 111 до 8899*/
		Sum1 = Sum1 + a; /*Сумма всех чисел от 111 до 8899*/
	}
    b = (8899 - 111) + 1; /*Находим кол-во чисел в интервале от 111 до 8899*/
	Average1 = Sum1/b; /*Среднее число, всех чисел от 1 до n*/
	System.out.println("The Sum is " + Sum1);
	System.out.println("The Average is " + Average1);
	}
/*---------------------------------------------------------------------------------*/
	public static void Modify_5 (float n) {
	int Sum2 = 0, t;
	float Average2;
    System.out.println("\n5. Modify (Odd Numbers):");
    for (t = 1; t <= n; t++){ /*Цикл чисел от 1 до n*/
    	if((t%2) != 0){
    	Sum2 = Sum2 + t; /*Сумма всех нечетных чисел от 1 до n*/
    	}
	}
	Average2 = Sum2/n; /*Среднее число, всех нечетных чисел от 1 до n*/
	System.out.println("The Sum is " + Sum2);
	System.out.println("The Average is " + Average2);
	}
/*---------------------------------------------------------------------------------*/
	public static void Modify_6 (float n) {
	int Sum3 = 0, r, с = 0;
	float Average3;
    System.out.println("\n6. Modify (from 1 to 100 that is divisible by 7):");
    for (r = 1; r <= n; r++){ /*Цикл чисел от 1 до n*/
    	if((r%7) == 0){
    	Sum3 = Sum3 + r; /*Сумма всех чисел от 1 до n которые делятся на 7*/
    	с++;
    	}
	}
	Average3 = Sum3/с; /*Среднее число, всех нечетных чисел от 1 до n*/
	System.out.println("The Sum is " + Sum3);
	System.out.println("The Average is " + Average3);
	}
/*---------------------------------------------------------------------------------*/
	public static void Modify_7 (float n) {
	int Sum4 = 0, g;
	System.out.println("\n7. Modify (Sum of the squares):");
	for (g = 1; g <= n; g++){ /*Цикл чисел от 1 до n*/
		Sum4 = Sum4 + g*g; /*Сумма квадратов всех чисел от 1 до n*/
	}
	System.out.println("The Sum is " + Sum4);
	}
}




















