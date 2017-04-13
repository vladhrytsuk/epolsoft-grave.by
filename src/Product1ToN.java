/*A) Write a program called Product1ToN to compute the product of integers 1 to 10 (i.e., 1×2×3×...×10). 
Try computing the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. Write down the product obtained 
and explain the results.
Hints: Declares an int variable called product (to accumulate the product) and initialize to 1.

B) Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000. 
The program shall compute the sum from left-to-right as well as from the right-to-left. Obtain the difference 
between these two sums and explain the difference. Which sum is more accurate?
*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/
import java.util.Scanner;

public class Product1ToN {

	public static void main(String[] args) {
    
    Product1ToNa ();
    HarmonicSum ();
	}
	
	public static int Product1ToNa () {
	Scanner in = new Scanner( System.in ); /* System.in через сканер */
	System.out.println("Program Product1ToN");
	System.out.print("Введите кол-во чисел: ");
	int n = in.nextInt();; 
	int product = 1;
	for (int i = 1; i <= n; i++){
		product *=i;
	}
	System.out.println("The product is " + product);
	in.close();
	System.out.println("\nОбъяснение - дело в том, что мы используем тип данных int и когда число n = будет 12,\n "
			+ "он еще будет показывать нормальные значения, но если мы сделаем уже 13,\n"
			+ "то в типе данных int заканчиваеться диапозон значений (2147483647 это максимыльный диапозон), \n"
			+ "в данном случае нужно использовать тогда тип данных long");
	return 0;
	}

	
	public static int HarmonicSum (){
		System.out.println("\nProgram HarmonicSum");
		int n;
		double product = 0, product2 = 0, res;
		for (int i = 1; i <= 50000; i++){
			n = i;
			product = product + 1/(double)n;
		}
		System.out.println("Ответ (left-to-right) - " + product);
		for (int i = 50000; i >= 1; i--){
			n = i;
			product2 = product2 + 1/(double)n;
		}
		System.out.println("Ответ (right-to-left) - " + product2);
		res = product2 - product;
		System.out.println("Ответ (Result) - " + res);
		System.out.println("\nОбъяснение - Более точно значение получилось при гармонической сумме справа налево, \n"
				+ "т.к. когда мы суммируем к маленькому числу большее, мы не теряем значения, \n"
				+ "а когда к числу большему, суммируем более маленькое, то это маленькое число в последствие оно становиться настолько мало, \n"
				+ "что его прибавление к числу становиться не существенным. Отсюда и разница.");
		return 0;
	}

}
