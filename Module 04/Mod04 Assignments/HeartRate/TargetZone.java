
/**
 * Finds out information about your heart rate, using the Karvonen Formula.
 * 
 * @author Ricky Mutschlechner
 * @version 10/11/2010
 */
import java.util.Scanner;
public class TargetZone
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Determine Your Target Heart Rate Zone for Cardiovascular Exercise (50% - 85%)");
       System.out.println();
       
       System.out.println("Enter your age: ");
       int age = in.nextInt();
       
       System.out.println("Enter your resting heart rate: ");
       int restingHeartRate = in.nextInt();
       
       System.out.println("Enter your heart rate after exercising: ");
       int activeHeartRate = in.nextInt();
       
       int maxHeartRate = 220 - age;
       int heartRateReserve = maxHeartRate - restingHeartRate;
       double maxTrainingZone = 0.85 * heartRateReserve + restingHeartRate;
       double minTrainingZone = 0.5 * heartRateReserve + restingHeartRate;
       
       System.out.println("Your heart rate target zone is between " +minTrainingZone+ " and " +maxTrainingZone);
       
       boolean isActiveHeartRate = false;
      
       
       if(activeHeartRate - minTrainingZone > 0) 
                 if(maxTrainingZone - activeHeartRate > 0)
                     isActiveHeartRate = true;
                     
                     if(isActiveHeartRate)
           System.out.println("After just exercising, your heart rate is within your target zone.");
                      else
           System.out.println("After just exercising, your heart rate is not within your target zone.");

    }
}
