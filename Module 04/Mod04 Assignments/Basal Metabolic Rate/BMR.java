
/**
 * This program calculates your BMR,or Basal Metabolic Rate.
 * 
 * @author Ricky Mutschlechner
 * @version 10/11/2010
 */
import java.util.Scanner;
public class BMR
{
   public static void main (String [] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter your name: ");
       String name = in.next();
       
       System.out.println("Gender (M or F): ");
       String maleOrFemale = in.next();
         char gender = maleOrFemale.charAt(0);
         boolean isMale = gender == 'M';
       
       System.out.println("Enter your age: ");
       int age = in.nextInt();
       
       System.out.println("Height in inches: ");
       int height = in.nextInt();
       
       System.out.println("Weight in pounds: ");
       int weight = in.nextInt();
       
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("Calculate Your Basal Metabolism");
       System.out.println();
       System.out.println("Name: "+name);
       System.out.println("Gender: "+gender);
       System.out.println("Age: "+age);
       System.out.println("Weight (kg) " + (weight / 2.2));
       System.out.println("Height (cm) "+ (height * 2.54));
       
       
       if(isMale)
       System.out.println("Basal Metabolic Rate: "+ (66 + (6.23 * weight) + (12.7 * height) - (6.8 * age)) + " calories per day.");
       else
       System.out.println("Basal Metabolic rage: "+ (655 + (4.35 * weight) + (4.7 * height) - (4.7 * age)) + " calories per day.");
       
       
       
       
     
       
         
         
         

            
       
       
       
       
       
       
       
       
       
    }
}
