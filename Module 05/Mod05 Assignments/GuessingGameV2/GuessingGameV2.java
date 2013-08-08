/**
 * Guessing Game; you choose a whole number between (random start) and (random finish)
 * and it tells you if you are too
 * high or too low.
 * 
 * @author Ricky Musturdlicker
 * @version 10/18/2010
 */
import java.util.Scanner;
public class GuessingGameV2
{

public static void main (String [] args)
{
Scanner in = new Scanner(System.in);

boolean makeNew = true;

double randNum = 0.0;
int guessNum = 0;
randNum = (int)(100 * Math.random());
int rangeOne = 0;
int rangeTwo = 0;




if(makeNew)
{
rangeOne = (int) (randNum+(10*Math.random()));
rangeTwo = (int) (randNum-(10*Math.random()));


makeNew = false;
}
while(randNum != guessNum){

while(rangeOne < rangeTwo){
System.out.println("Guess a number between " +rangeOne+ " and " +rangeTwo);

String guess = in.next();
guessNum = Integer.parseInt(guess);

if(randNum > guessNum)
{
System.out.println("Your guess is too low!");
}
else if(randNum < guessNum)
{
System.out.println("Your guess is too high!");
}

else
{
System.out.println("Congratulations. Your guess is correct!");
}
}

while(rangeOne > rangeTwo){
System.out.println("Guess a number between " +rangeTwo+ " and " +rangeOne);

String guess = in.next();
guessNum = Integer.parseInt(guess);

if(randNum > guessNum)
{
System.out.println("Your guess is too low!");
}
else if(randNum < guessNum)
{
System.out.println("Your guess is too high!");
}

if ( randNum == guessNum)
{
System.out.println("Congratulations. Your guess is correct!");
}
break;

}
}
System.out.println("Thanks for playing!");
    }
}