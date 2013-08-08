
/**
 * This program calculates your TDEE.
 * 
 * @author Ricky Mutschlechner
 * @version 10/17/2010
 */
import java.util.Scanner;
public class TDEE
{
   public static void main (String [] args)
   {
       Scanner in = new Scanner(System.in);
       double activityFactor = 0;
       
       System.out.println("Enter your name: ");
       String name = in.nextLine();
       
       System.out.println("Gender (M or F): ");
       String maleOrFemale = in.next();
       char gender = maleOrFemale.charAt(0);
       boolean isMale = gender == 'M';
       
       
        System.out.println("Enter your BMR (Basal Metabolic Rate):");
        double bmr = in.nextDouble();
        
        System.out.println("Select Your Activity Level):");
        System.out.println("[A] Resting (Sleeping, Reclining");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        
        System.out.println();
        System.out.println("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        
        
        //Calculations Starting Here
        
        if(isMale){
if(choice.equalsIgnoreCase("A")){
activityFactor =  ( 1.0);
}

        else if(choice.equalsIgnoreCase("B")){
activityFactor =  ( 1.3);
		}
        
        else if(choice.equalsIgnoreCase("C")){
activityFactor =  ( 1.6);
		}

        else if (choice.equalsIgnoreCase("D")){
 activityFactor =  ( 1.7);
		}
        
        else if(choice.equalsIgnoreCase("E")){
 activityFactor = (bmr* 2.1);
		}
        
        else if(choice.equalsIgnoreCase("F")){
 activityFactor = (bmr* 2.4);
		}
        
}

if(isMale == false){

if(choice.equalsIgnoreCase("A")){
activityFactor =  ( 1.0);
        }
        else if(choice.equalsIgnoreCase("B")){
 activityFactor =  ( 1.3);
    }
        

        else if(choice.equalsIgnoreCase("C")){
 activityFactor =  ( 1.5);
    }
        
        
        else if(choice.equalsIgnoreCase("D")){
  activityFactor =  ( 1.6);
    }
        
        
        else if(choice.equalsIgnoreCase("E")){
 activityFactor = ( 1.9);
    }
        
        
        else if(choice.equalsIgnoreCase("F")){
activityFactor = ( 2.2);
    }
    }
        
        //Calculations Ending Here
        
        
        
        System.out.println("Name: " +name+ "             Gender: "+gender);
        System.out.println("BMR: "+bmr+"                 Activity Factor: "+activityFactor);
        System.out.println("TDEE: " + (bmr * activityFactor));
        
 
       
       
    }
}
