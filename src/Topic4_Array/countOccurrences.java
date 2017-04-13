/*

 Write a Java class called NumberConsecutive. This class de nes a method called countOccurrences() 
 that takes as parameters an array of int called a , an int called x, as well as an int called position, 
 and returns an int representing the number of occurrences of x in a starting at position position. 
 For example, if a is {1, 2, 2, 2, 2, 2, 1, 1, 1}, x is 2, and position is 1, then your method will return 5, 
 as there are 5 consecutive occurrences of 2 in a starting at position 1. You MAY assume that position
 is greater than or equal to 0 and less than a.length

 */

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic4_Array;

import java.util.Scanner;

public class countOccurrences {

	public static void main(String[] args) {
		int x, position, kolvo = 0, size;
		Scanner in = new Scanner (System.in);
		
		System.out.print("¬ведите размер массива: ");
		size = in.nextInt();
		int []array = new int [size];
		
		System.out.print("¬ведите число дл€ поиска: ");
		x = in.nextInt();
		
		System.out.print("¬ведите с какого элемента начинать: ");
		position = in.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("¬ведите " + (i+1) + " элемент массива: ");
			array[i] = in.nextInt();
		}

		for (int i = position; i < array.length; ++i) {
			if (array[i] == x){
				kolvo++;
			}
		}
		
		System.out.print("\t\t\t\t„исло " + x + " встречаетс€ " + kolvo + " раз(а)");
		in.close();
	}
}
