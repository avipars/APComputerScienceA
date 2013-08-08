
/**
 * Class that recursively calculates the numbers of Fibonacci's sequence.
 * 
 * @author Ricky Mutschlechner
 * @version 12/21/2010
 */
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input, input2;
        int number = 0, fibseq = 0;
        boolean running = true;
       
        System.out.println("This program is meant to find the nth Fibonacci number.");

       while(running){
        
            System.out.println("Enter the number n.");
            input = in.nextLine();
            number = Integer.parseInt(input);
        
            fibseq = fib(number);
            if(fibseq == -1){
                System.out.println("Please enter a positive integer less than 49!");
            }
            else{
                System.out.println("The " +number + "th Fibonacci Sequence number is " +fibseq + ".");
                System.out.println("Would you like to find another number? Y or N: ");
                input2 = in.nextLine();
                if(input2.equalsIgnoreCase("n")){
                    running = false;
                }
                System.out.println("\f");
            }
        }
    }
    
    
    
    
    
    /**
     * Recursively calculate the nth Fibonacci Sequence number.
     * @param n Indicated the number to find.
     * @return the nth Fibonacci number.
     */
    public static int fib(int n)
    {
        //Base Case
        if((n < 2) && (n >= 0)) {
            return n;
        }
        if((n >= 49) || (n < 0)){
            return -1;
        }
        //Recursive case
        else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

}
