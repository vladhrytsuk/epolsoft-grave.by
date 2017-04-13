/*Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall print "Coza" 
in place of the numbers which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for 
multiples of 3 and 5, and so on.
TRY: Modify the program to use nested-if (if ... else if ... else if ... else) instead.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

public class CozaLozaWoza {
	public static void main (String[] args) {
		String []str = {"Coza","Loza","Woza", "CozaLoza"};
		for(int i = 1; i < 111; i++){
			if (i == 12 || i == 23 || i == 34 || i == 45 || i == 56 || i == 67 || i == 78 || i == 89 || i == 100)System.out.print("\n");
			if ((i%3)==0 && (i%5)==0) {
				System.out.print(str[3] + " "); 
				continue;
				}
			if ((i%3)==0) {
				System.out.print(str[0] + " "); 
				continue;
				}
			if ((i%5)==0) {
				System.out.print(str[1] + " "); 
				continue;
				} 
			if ((i%7)==0) {
				System.out.print(str[2] + " "); 
				continue;
				}
			System.out.print(i + " ");
		}
	}

}
