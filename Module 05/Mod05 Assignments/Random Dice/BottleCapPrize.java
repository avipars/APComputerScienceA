/**
 * Rolls a pair of n-sided dices, x amount of times, and gives the probability for each sum.
 * 
 * @author Ricky Mutschlechner
 * @version 11/03/2010
 */
 
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
        //Declare and initialize variables and objects
        Scanner in = new Scanner(System.in);
        Random randNumber = new Random();
        PrintWriter outFile = new PrintWriter (new File("amounttowin.txt"));
        
        
        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        
        int randNum = 0;
        
        for(int n = 2; n <= (2 * sides); n++)
            {
                System.out.print("\n" + n + "s");
                int counter = 0;
                for (int i = 0; i < rolls; i++)
                {
                    if ((1 + randNumber.nextInt(sides)) + (1 + randNumber.nextInt(sides)) == n)
                    {
                        counter++;
                    }
                }
                System.out.print("                          " + ((double)counter/rolls*100));
            }

            
    } //end main
}//end class DiceProbability