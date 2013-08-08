/**
 * Pick 3 numbers, and try your luck at the lottery!
 * 
 * @author Ricky Mutschlechner
 * @version 10/28/2010
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialize variables and objects
        Scanner in = new Scanner(System.in);
        
        //Lottery stuff
    String s = "";
    
    for(int i = 0; i < 3; i++){
    s = s + ((int)(10 * Math.random()));
    }
        
        //Input: Ask user to guess 3 digit number
        System.out.println("Guess any 3 digit number (e.g. 123): ");
        String guess = in.nextLine();

        
        //Compare the user's guess to the lottery number and report results
        
        System.out.println("Winner: " +s);
        if(guess.equals(s)){
            System.out.println("Congratulations, both pairs matched!");
        }
        else if(guess.substring(0,1).equals(s.substring(0,1))){
            System.out.println("Congratulations, the front pair matched!");
        }
        else if(guess.substring(1).equals(s.substring(1))){
            System.out.println("Congratulations, the end pair matched!");
        }
        else{
            System.out.println("Sorry, no matches. You only had one chance out of 100 to win anyways.");
        }
            
       
           
        
        
        
        

        
    } //end main
}//end class Lottery