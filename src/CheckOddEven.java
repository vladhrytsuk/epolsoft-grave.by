/*Write a program called CheckOddEven which prints "Odd Number" if the int variable УnumberФ is odd,
or УEven NumberФ otherwise. Hints: n is an even number if (n % 2) is 0.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/
import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in ); /* System.in через сканер */
        int n; /* ќбъ€вл€ем переменную n типа int, данна€ переменна€ отвечает за вводимое нами число */
        System.out.println("Enter a number: ");
        n = in.nextInt(); /* ¬водим наше число*/
        if ((n % 2) == 0) { /*ѕровер€ем число, если остаток от делени€ на 2 равен 0,
        значит число четное*/
        System.out.println(n + " - Even Number"); }
        else System.out.println(n + " - Odd Number"); /*≈сли остаток от делени€ на 2 не равен 0,
        значит число нечетное*/
        in.close();
	}
}
