/*Write a program called CheckOddEven which prints "Odd Number" if the int variable �number� is odd,
or �Even Number� otherwise. Hints: n is an even number if (n % 2) is 0.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/
import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in ); /* System.in ����� ������ */
        int n; /* ��������� ���������� n ���� int, ������ ���������� �������� �� �������� ���� ����� */
        System.out.println("Enter a number: ");
        n = in.nextInt(); /* ������ ���� �����*/
        if ((n % 2) == 0) { /*��������� �����, ���� ������� �� ������� �� 2 ����� 0,
        ������ ����� ������*/
        System.out.println(n + " - Even Number"); }
        else System.out.println(n + " - Odd Number"); /*���� ������� �� ������� �� 2 �� ����� 0,
        ������ ����� ��������*/
        in.close();
	}
}
