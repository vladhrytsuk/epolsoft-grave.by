package Topic3_String;

import java.util.Scanner;

public class Splitting {
	
public String str;
	
public void program1(String str){
		String[] chArray = str.split("[-_,.!'Т\"\\s]+");
		System.out.println("\t\tFirst variant the program: ");
/*ƒл€ разбиени€ строк на части используетс€ метод String[] split(String regex), 
 * который разбивает строку на основании заданного регул€рного выражени€. */
		for (int i = 0; i < chArray.length; i++) {
			System.out.println(chArray[i]);
		}
		System.out.println();
	}

public void program2(String str){
	char[] chArray = str.toCharArray();
	char[] chArrayNEW = new char[chArray.length];
	int LetterCount = 0;
	System.out.println("\t\tSecond variant the program: ");
	for(int i = 0; i<chArray.length; i++){
		if (Character.isLetter(chArray[i]) || chArray[i] == ' ' || chArray[i] == 'Т' || chArray[i] == '\'') {
			chArrayNEW[LetterCount] = chArray[i];
			if (chArrayNEW[LetterCount] == ' '){
				chArrayNEW[LetterCount] = '\n';
			}
			LetterCount++;
		}
	}
	System.out.println(chArrayNEW);
}
	
public static void main(String[] args) {
		String str;
		Scanner in = new Scanner( System.in );
		System.out.print("Enter the string: ");
		str = in.nextLine();
		Splitting ob = new Splitting();
		ob.program1(str);
		ob.program2(str);
		in.close();
	}
}