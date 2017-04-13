/*Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" 
if the int variable "number" is 1, 2,... , 9, or other, respectively. 
Use (a) a "nested-if" statement; (b) a "switch-case" statement.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/
import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in); /* System.in через сканер */
        int n; /* Объявляем переменную n типа int, данная переменная отвечает за вводимое нами число */
        System.out.println("Enter the number: ");
        n = in.nextInt(); /* Вводим наше число*/
        /*Проверяем число, если 1 выводим One, если 2 выводим Two и т.д. */
        System.out.println("\na) Nested-if: ");
        if (n == 1) System.out.println(n + " - One");
        if (n == 2) System.out.println(n + " - Two");
        if (n == 3) System.out.println(n + " - Three");
        if (n == 4) System.out.println(n + " - Four");
        if (n == 5) System.out.println(n + " - Five");
        if (n == 6) System.out.println(n + " - Six");
        if (n == 7) System.out.println(n + " - Seven");
        if (n == 8) System.out.println(n + " - Eight");
        if (n == 9) System.out.println(n + " - Nine");
/*---------------------------------------------------------------------------*/       
        System.out.println("\nb) Switch-case: ");
        switch(n){
            case 1: System.out.println(n + " - One"); break;
            case 2: System.out.println(n + " - Two"); break;
            case 3: System.out.println(n + " - Three"); break;
            case 4: System.out.println(n + " - Four"); break;
            case 5: System.out.println(n + " - Five"); break;
            case 6: System.out.println(n + " - Six"); break;
            case 7: System.out.println(n + " - Seven"); break;
            case 8: System.out.println(n + " - Eight"); break;
            case 9: System.out.println(n + " - Nine"); break;  }
        in.close();
   }    
}