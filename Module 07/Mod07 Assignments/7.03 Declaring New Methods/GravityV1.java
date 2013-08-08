import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Write a description of class GravityV1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GravityV1
{
    public static String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    public static int[] radii = {2439000, 6052000, 6378000, 3397000, 71492000, 60268000, 2559000, 24764000};
    public static double[] masses = {3.30E+23, 4.87E+24, 5.98E+24, 6.42E+23, 1.90E+27, 5.69E+26, 8.69E+25, 1.02E+26};
    public static double gravConstant = 6.67E-11;
    private static PrintWriter out;

    public static double surfaceGravity (int planet)
    {
        return ((gravConstant * masses[planet]) / (Math.pow(radii[planet],2)));
    }

    public static void main (String[] args) throws FileNotFoundException
    {
        out = new PrintWriter(new File("Output.txt"));
        System.out.println("                       Planetary Data                            ");
        System.out.println("Planet          Diameter(km)        Mass(kg)         g (m/s^2)   ");
        System.out.println("-----------------------------------------------------------------");
        for(int i = 0; i < planets.length; i++){
            double surfaceGravity = surfaceGravity(i);
            System.out.printf("%8s %15d %20.2e %16.4f \n",planets[i],(2 *radii[i]),masses[i],surfaceGravity);
            out.println(surfaceGravity);
        }
    }
}



