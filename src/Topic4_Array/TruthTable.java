/*

Truth table (&&, ||, !)
We will count the number of true and false statements in a Java generated truth table. The expressions we will be considering have three variables x, y, z. In the beginning of this exercise, consider the expression x ^ (y-> !z).
Step 1: Declare an array of booleans, that is of type boolean[], to hold the values of the truth table. How long must the array be?
Step 2: Find a loop structure to generate the table. Inside the loop, fill the table with values instead of printing the values.
Step 3: Iterate through the table to find the number of times true appears. Write a statement about the number of true and false values.
Step 4: Write an additional statement if the expression is a contradiction or a tautology.
Step 5: Modify the programme to test the expressions (x ^ z)^(y ^!z) and (x ||z)||(y ||!z). Does it work as planned?

*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic4_Array;

public class TruthTable {

    static boolean TruthTable1(boolean x, boolean y, boolean z)
    {
        return x & (!y || !z);
    }

    static boolean TruthTable2(boolean x, boolean y, boolean z)
    {
        return (x & z) & (y & !z);
    }

    static boolean TruthTable3(boolean x, boolean y, boolean z)
    {
        return (x || z) || (y || !z);
    }
    
    
    public static void main(String[] args)
    {
        boolean[] x = new boolean[] {false, false, false, false, true, true, true, true};
        boolean[] y = new boolean[] {false, false, true, true, false, false, true, true};
        boolean[] z = new boolean[] {false, true, false, true, false, true, false, true};

        System.out.println("Truth Table #1");
        System.out.println("x\t" + "y\t" + "z\t" + "x ^ (y -> !z)" );
        int trueCount1 = 0, falseCount1 = 0;
        for(int i = 0; i < x.length; i++)
        {
            boolean out;
            out = TruthTable1(x[i], y[i], z[i]);
            if(out == true)
                trueCount1++;
            else
                falseCount1++;

            System.out.println(x[i] + "\t" + y[i] + "\t" + z[i] + "\t" + out);
        }

        System.out.println("True: " + trueCount1);
        System.out.println("False: " + falseCount1);

        System.out.println("\nTruth Table #2");
        System.out.println("x\t" + "y\t" + "z\t" + "(x ^ z)^(y ^!z)" );
        int trueCount2 = 0, falseCount2 = 0;
        for(int i = 0; i < x.length; i++)
        {
            boolean out;
            out = TruthTable2(x[i], y[i], z[i]);
            if(out == true)
                trueCount2++;
            else
                falseCount2++;
            System.out.println(x[i] + "\t" + y[i] + "\t" + z[i] + "\t" + out);
        }
        
        System.out.println("True: " + trueCount2);
        System.out.println("False: " + falseCount2);

        System.out.println("\nTruth Table #3");
        System.out.println("x\t" + "y\t" + "z\t" + "(x ||z)||(y ||!z)" );
        int trueCount3 = 0, falseCount3 = 0;
        for(int i = 0; i < x.length; i++)
        {
            boolean out;
            out = TruthTable3(x[i], y[i], z[i]);
            if(out == true)
                trueCount3++;
            else
                falseCount3++;
            System.out.println(x[i] + "\t" + y[i] + "\t" + z[i] + "\t" + out);
        }
        
        System.out.println("True: " + trueCount3);
        System.out.println("False: " + falseCount3);
    }
}
