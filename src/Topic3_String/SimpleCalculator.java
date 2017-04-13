package Topic3_String;

public class SimpleCalculator {
    public static void main(String[] args) {
    double Num1, Num2, answer; 
    char operator; 
    
    TextIO.putln(" |---------------------------------------------------|");
    TextIO.putln(" | Enter expressions such as 17 + 3 or 3.14159 * 4.7 |");
    TextIO.putln(" | Please, using any of the operators +, -, *, /     |");
    TextIO.putln(" | To end program, please, enter a 0.                |");
    TextIO.putln(" |---------------------------------------------------|");
    TextIO.putln();
    
    while (true) {
        TextIO.put("Enter expressions: ");
        Num1 = TextIO.getDouble();
        if (Num1 == 0)
           break;
        operator = TextIO.getChar();
        Num2 = TextIO.getlnDouble();

        switch (operator) {
            case '+':
            	answer = Num1 + Num2;
               break;
            case '-':
            	answer = Num1 - Num2;
               break;
            case '*':
            	answer = Num1 * Num2;
               break;
            case '/':
            	answer = Num1 / Num2;
               break;
            default:
               TextIO.putln("ERROR -> Unknown operator: " + operator);
               continue;
        } 
        TextIO.putln("The answer is " + answer);
        TextIO.putln();
   }
    TextIO.putln("\n\t\tThe end of the program.");
    }
} 


