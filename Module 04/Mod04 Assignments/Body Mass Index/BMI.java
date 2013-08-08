
/**
 * Calculates your Body Mass Index.
 * 
 * @author Ricky Mutschlechner
 * @version 10/13/2010
 */
import java.util.Scanner;
public class BMI
{
   public static void main (String[] args)
   {
       Scanner in = new Scanner(System.in);

       
       System.out.println("Enter your name (First Last): ");
       String name = in.nextLine();
       
       System.out.println("Enter your weight in pounds (e.g. 175): ");
       double weight = in.nextDouble();
       
       System.out.println("Enter your height in feet and inches (e.g. 5 11): ");
       String heightFeet = in.next();
       String heightInches = in.next();
       
       
       int feet = Integer.parseInt(heightFeet);
       int inches = Integer.parseInt(heightInches);
       
       
       

       
       double BMI = (((weight / 2.2) / java.lang.Math.pow(((feet * 0.3048) + (inches * 0.0254)), 2)));
       
      
       
       
       
       
       
       System.out.println();
      
       System.out.println("Body Mass Index Calculator");
       System.out.println("==========================");
       System.out.println("Name: "+name);
       System.out.println("Height (m): "+ ((feet * 0.3048) + (inches * 0.0254)));
       System.out.println("Weight (kg): "+ (weight / 2.2));
       System.out.println("BMI: " + BMI);
       
       if(BMI <= 25)
         System.out.println("You are not overweight.");
         else if(30 - BMI > 0)
         System.out.println("You are overweight.");
         else if(30 - BMI < 0)
         System.out.println("You are obese!");
       
       
       
    }
}
