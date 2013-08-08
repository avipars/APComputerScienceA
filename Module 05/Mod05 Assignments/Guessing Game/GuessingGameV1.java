
/**
 * Guessing Game; you choose a whole number between 1 and 10 and it tells you if you are too
 * high or too low.
 * 
 * @author Ricky Mutschlechner
 * @version 10/18/2010
 */
import java.util.Scanner;
public class GuessingGameV1
{
public static void main (String [] args)
{
Scanner in = new Scanner(System.in);

double randNum = 0.0;
int guessNum = 0;
randNum = (int)(100 * Math.random());




while(guessNum != randNum)
{


System.out.println("Pick a whole number between 1 and 100: ");
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
System.out.println("Thanks for playing!");
    }
}