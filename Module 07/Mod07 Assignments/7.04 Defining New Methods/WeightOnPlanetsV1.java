 
/**
 * Calculates your weight on each planet in the solar system.
 * 
 * @author Ricky Mutschlechner
 * @version 11/21/2010
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class WeightOnPlanetsV1
{


    public static double[] readTextFile() throws IOException
    {
        Scanner inFile = new Scanner(new File("gravity1.txt"));
        int index = 0;
        double[] gravities = new double[9];
        while (inFile.hasNext()){
            gravities[index] = inFile.nextDouble();
            index++;
        }
        return gravities;

    }

    public static double[] weightOnPlanet(double weight, double[] gravities)
    {
        double[] planetWeight = new double[9];
        for(int n = 0; n < planetWeight.length; n++)
        {
            planetWeight[n] = weight * gravities[n];
        }
        return planetWeight;
    }
       
       
    public static void main(String[] args) throws IOException
    {
        
        readTextFile();
        Scanner in = new Scanner(System.in);

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

   
        System.out.println("How much do you weigh? (in lbs.): ");
        int weight = in.nextInt();
        
        double[] gravities = readTextFile();
        double[] weights = weightOnPlanet(weight, gravities);
        
        System.out.println("      My Weight on the Planets         ");
        System.out.println("Planet       Gravity        Weight(lbs)");
        System.out.println("---------------------------------------");
        for(int a = 0; a < planets.length; a++)
        {
            System.out.printf("%10s %10.2f %13.2f \n",planets[a],gravities[a],weights[a]);
        }
        
        
        
        
    }
}
        
       
        

        
       