/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author Ricky Mutschlechner
 * @version 10/17/2010
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        System.out.println();
        System.out.println("Enter your choice: ");
        String choice = in.next();
        // prompt user to enter A, B, C, D, or E: ");
        // accept user choice with a Scanner class method
        System.out.println();
        
        if(choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI.");
        }
        else if(choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            System.out.println("Testing: You have chosen B for BMR.");
        }
        else if (choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            System.out.println("Testing: You have chosen C for Healthy Eating.");
        }
        else if (choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            System.out.println("Testing: You have chosen D for Food Pyramid.");
        }
        else if (choice.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            System.out.println("Testing: You have chosen E for Fitness Training.");
        }
        else //default choice for an invalid entry
        {
            System.out.println("You did not choose a valid option, please try again.");
        }
    }
}
