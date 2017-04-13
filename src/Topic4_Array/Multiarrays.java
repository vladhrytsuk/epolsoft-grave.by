/*

Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. 
Вывести массив на экран. После на отдельной строке вывести на экран значение максимального 
элемента этого массива (его индекс не имеет значения).

*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic4_Array;

public class Multiarrays {

	public static void main(String[] args) {
		int [][]mas = new int[5][8];
		int maxIndex = mas[0][0];
		int max = 99;
		int min = -99;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = new int[8]; 
		}
		System.out.println("   |   1   2   3   4   5   6   7   8");
		System.out.println("------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(" " + (i+1) + " |");
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) Math.round(min + (Math.random()* ((max - min))));
				System.out.format("%4d", mas[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(mas[i][j] > maxIndex){
					maxIndex = mas[i][j];
				}
			}
		}
		System.out.println("\nMAX: " + maxIndex);
	}
}
