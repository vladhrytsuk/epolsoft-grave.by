/*

 Write a program called WordGuess to guess a word by trying to guess the individual characters. The word to be guessed
 shall be provided using the command-line argument. Your program shall look like:

 > java WordGuess testing
 Key in one character or your guess word: t
 Trail 1: t__t___
 Key in one character or your guess word: g
 Trail 2: t__t__g
 Key in one character or your guess word: e
 Trail 3: te_t__g
 Key in one character or your guess word: testing
 Trail 4: Congratulation!
 You got in 4 trials

*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic4_Array;

import java.util.Scanner;

public class WordGuess {
    @SuppressWarnings("resource")
	public static void main(String[] args)  {
        String word = "";
        
        if(args.length == 1)    {
            word = args[0];
        } else  {
            word = "Ericpol";
        }
        
        boolean[] bGuess = new boolean[word.length()];
        int trials = 0;
        
        Scanner in = new Scanner(System.in);
        
        for(int k = 0; k <= trials; k++) {
            System.out.print("Key in one character or your guess word: ");
            String guess = in.nextLine();
            trials++;
            
            if(guess.length() > 1) {
                if(guess.equalsIgnoreCase(word))
                    for(int i = 0; i < bGuess.length; i++)
                        bGuess[i] = true;
            } else  {
                for(int i = 0; i < word.length(); i++)  {
                    if(guess.equalsIgnoreCase(word.charAt(i)+""))
                        bGuess[i] = true;
                }
            }
            
            System.out.print("Trial " + trials + ": ");
            for(int i = 0; i < word.length(); i++)  {
                if(bGuess[i])   System.out.print(" " + word.charAt(i));
                else    System.out.print(" _");
            }
            System.out.println();
            
            if(endGame(bGuess))  {
                System.out.println("Congratulations! \nYou got it in " + 
                        trials + " trial" + (trials == 1 ? "!" : "s!") );
                break;
            }
        }
        
    }
    
    private static boolean endGame(boolean[] bool) {
        for(boolean b : bool)
            if(!b)  return false;
        return true;
    }
}