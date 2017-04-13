/*
Write a program called PrintAnimalPattern, which uses println() to produce this pattern:

          '__'
          (©©)
  /========\/
 / || %% ||
*  ||----||
   ¥¥    ¥¥
   ""    ""
TRY: Print the same pattern using printf(). (Hints: Need to use %% to print a % in printf() because % is the suffix for format specifier.)
*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/


package Topic3_String;

public class PrintAnimalPattern {

	public static void main(String[] args) {
	     System.out.println("          '__'");
	     System.out.println("          (\u00A9\u00A9)");
	     System.out.println("  /========\\/");
	     System.out.println(" / || %% ||");
	     System.out.println("*  ||----||");
	     System.out.println("   \u00a5\u00a5    \u00a5\u00a5");
	     System.out.println("   \"\"    \"\"");
	     System.out.println();
	     
	     System.out.printf("          '__'\n");
	     System.out.printf("          (\u00A9\u00A9)\n");
	     System.out.printf("  /========\\/\n");
	     System.out.printf(" / || %%%% ||\n");
	     System.out.printf("*  ||----||\n");
	     System.out.printf("   \u00a5\u00a5    \u00a5\u00a5\n");
	     System.out.printf("   \"\"    \"\"\n");
	}

}
