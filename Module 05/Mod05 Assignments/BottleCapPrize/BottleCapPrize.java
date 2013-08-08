/**
 * Calculates the average number of e-Boost bottles you need to drink in order to win a prize.
 * 
 * @author Ricky Mutschlechner
 * @version 11/09/2010
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
        
        
        //all main code below:
        
        System.out.println("How many trials should be conducted?");
        int trials = in.nextInt();
        int trialCounter = 0;
        int numsPossible = 5;
        int winningNum = 1;
        
        for (int i = 0; i < trials; i++)
        {
            int randNum =  randNumber.nextInt(numsPossible);
            trialCounter = 0;
                while (randNum != winningNum)
            {
                     randNum = randNumber.nextInt(numsPossible);
                     trialCounter++;
            }
            outFile.println(trialCounter);
        }
        outFile.close();
        Scanner fileScanner = new Scanner (new File("amounttowin.txt"));
        int totalTrials = 0;
        while (fileScanner.hasNext()){
            totalTrials += Integer.valueOf(fileScanner.nextLine());
        }
        
        System.out.println("Average: " + totalTrials/trials);
        fileScanner.close();

            
    } //end main
}//end class 
