
/**
 * Enter a word, and this program will check if it is a palindrome!
 * 
 * @author Ricky Mutschlechner
 * @version 12/22/2010
 */
import java.util.Scanner;
public class Palindrome
{
   public static Scanner in = new Scanner(System.in);
   public static void main(String[] args)
   {
     boolean running = true;
     String word = "";
     Scanner in = new Scanner(System.in);
     
     System.out.println("The purpose of this program is to see whether a word is a palindrome or not.\n");
     
     while(running)
     {

        System.out.println("Enter a word, and I will check whether or not it is a palindrome!");
        word = in.nextLine();
        boolean isPalindrome = palindrome(word);
            if(isPalindrome == true){
                System.out.println(word + " is a palindrome!");
                running = tryAgain();
                System.out.println("\f");
            }
            else{
                 System.out.println(word + " is not a palindrome!");
                 running = tryAgain();
                 System.out.println("\f");
                 }
     }
    }

    public static boolean tryAgain(){
        boolean running = true;
        System.out.println("Would you like to try again? 1 to try again, 2 to quit.");
        int input = in.nextInt();
        if(input == 2){
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean palindrome(String word)
    {
        //base case
        if(word.length() == 1){
            boolean isPal = true;
            return isPal;
        }
        //base case
        if(word.length() == 0){
            boolean isPal = true;
            return isPal;
        }
        //recursive call
        if(word.charAt(0) == word.charAt(word.length() - 1)){
            //if the current first and last is correct, check the smaller word
            return palindrome(word.substring(1, word.length() - 1));
        }
        return palindrome_helper(word);
    }
    
    public static boolean palindrome_helper(String word)
    {
        //base case
        if(word.length() == 1){
            boolean isPal = true;
            return isPal;
        }
        //base case
        if(word.length() == 0){
            boolean isPal = true;
            return isPal;
        }
        //recursive call
        
        
        if(Character.toLowerCase(word.charAt(0)) ==  Character.toLowerCase(word.charAt(word.length() - 1))){
            //if the current first and last is correct, check the smaller word
            return palindrome_helper(word.substring(1, word.length() - 1));
        }
        if (word.charAt(word.length() - 1) == ' ') {
            return palindrome_helper(word.substring(0, word.length() - 1));
        }
        if (word.charAt(0) == ' ') {
            return palindrome_helper(word.substring(1, word.length()));
        }
        
        return false;

    }
}

