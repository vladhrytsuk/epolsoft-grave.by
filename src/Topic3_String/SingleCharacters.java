/*

ƒана строка текста, в которой слова разделены пробелами и двоеточи€ми. Ќужно:
1) вычислить количество слов в строке, у которых четное количество букв, и вывести их на экран
2) вывести все слова в алфавитном пор€дке
3) из старой строки сформировать новую,в которой буквы каждого слова пишутс€ через пробел, а затем вывести ее на экран

*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic3_String;

import java.util.Arrays;
import java.util.Scanner;

public class SingleCharacters {
	
	private String result;
	
	public void setResult(String result){
	   this.result = result;
	}
	
	public String getResult (){
		return result;
	}
	
	public void even_words (){
		System.out.println();
		System.out.println("1) ¬ычислить количество слов в строке, у которых четное количество букв: ");
		String []str = result.split("[:[\\s]]+");
int a = 0;
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].trim();

			int letters = 0;
			char[] words = str[i].toCharArray();
			
			for (int j = 0; j < words.length; j++) {
				letters++;
			}
			
			if(letters%2==0){
				a++;
				System.out.println(str[i]);
			}
		}
		System.out.println(" ол-во слов: " + a);
	}

	public void sort(){
		System.out.println("2) ¬ывести все слова в алфавитном пор€дке: ");
		String []str = result.split("[:[\\s]]+");
		Arrays.sort(str);
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
	
	public void letters(){
		System.out.println();
		System.out.println("3) »з старой строки сформировать новую,в которой буквы каждого слова пишутс€ через пробел: ");
		String []str = result.split("[:[\\s]]+");
		for (int i = 0; i < str.length; i++) {
			char[] words1 = str[i].toCharArray();
			for (int j = 0; j < words1.length; j++) {
				System.out.print(words1[j] + " ");
			}

		}
	}
	

	
	public static void main(String[] args) {
		String str;
		Scanner in = new Scanner( System.in );
		System.out.println();
		System.out.println(".-------------------------------------------------------------------------------------.");
		System.out.println("| ¬ведите строку текста, в которой слова разделены пробелами и двоеточи€ми, например: |");
		System.out.println("| Hello world: My name is Vasia                                                       |");
		System.out.println("'-------------------------------------------------------------------------------------'");
		System.out.println();
		System.out.print("Enter the string: ");
		str = in.nextLine();
		SingleCharacters ob = new SingleCharacters();
		ob.setResult(str);
		System.out.println("You enter string: " + ob.getResult());
		ob.even_words();
		ob.sort();
		ob.letters();
		in.close();
	}
}
