
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
       
       System.out.println("Enter your height in feet and inches (e.g. 5 11)");
       String height = in.next();
       int stringLength = height.length();
       int halfwayPoint = stringLength /2;
       
       String feet = height.substring(0,halfwayPoint);
       String inches = height.substring(halfwayPoint, stringLength);
       
       double feetValue;
       feetValue = Double.parseDouble(feet);
       
       double inchesValue;
       inchesValue = Double.parseDouble(inches);
       
       double BMI = ((weight / 2.2) / ((feetValue * 0.3048) + (inchesValue * 0.0254)));
       
      
       
       
       
       
       
       System.out.println();
      
       System.out.println("Body Mass Index Calculator");
       System.out.println("==========================");
       System.out.println("Name: "+name);
       System.out.println("Height (m): "+ ((feetValue * 0.3048) + (inchesValue * 0.0254)));
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
