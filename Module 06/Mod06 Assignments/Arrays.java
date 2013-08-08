
/**
 * Write a description of class Arrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Arrays
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Temps in Fahrenheit.
        double[] janTemp = {52.7, 58.4, 64.9, 54.3, 53.1, 70.3, 68.1, 60.9, 52.0, 51.8, 66.2, 63.0};
        double[] febTemp = {55.3, 60.0, 66.0, 57.0, 55.8, 70.8, 69.1, 62.6, 54.9, 54.8, 67.2, 63.9};
        double[] marTemp = {60.7, 64.7, 69.9, 62.5, 61.6, 73.8, 72.4, 67.4, 61.0, 61.1, 70.6, 67.7};
        double[] aprTemp = {66.8, 68.9, 73.6, 67.6, 66.6, 77.0, 75.7, 71.5, 66.9, 66.4, 73.8, 71.5};
        double[] mayTemp = {74.1, 74.8, 78.8, 74.3, 73.4, 80.7, 79.6, 77.1, 74.6, 74.4, 78.2, 76.2};
        double[] junTemp = {80.0, 79.7, 82.2, 79.2, 79.1, 83.4, 82.4, 81.2, 80.6, 80.4, 81.2, 80.4};
        double[] julTemp = {81.9, 81.7, 83.0, 80.9, 81.6, 84.5, 83.7, 82.4, 82.6, 82.4, 82.5, 81.7};
        double[] augTemp = {81.7, 81.5, 83.1, 80.4, 80.8, 84.4, 83.6, 82.5, 82.2, 82.1, 82.8, 81.6};
        double[] sepTemp = {79.1, 79.9, 82.1, 77.8, 77.8, 83.4, 82.4, 81.1, 78.7, 78.9, 81.7, 80.7};
        double[] octTemp = {70.2, 74.0, 77.5, 70.1, 69.4, 80.2, 78.8, 75.3, 69.5, 69.1, 78.1, 76.4};
        double[] novTemp = {62.0, 67.0, 71.7, 62.8, 61.7, 76.3, 74.4, 68.8, 60.7, 60.4, 73.1, 70.5};
        double[] decTemp = {55.2, 60.8, 66.4, 56.3, 55.0, 72.0, 69.9, 63.0, 54.1, 53.7, 68.3, 64.7};
        
        
        //Precipitation in inches.
        
        double[] janPrecip = {4.9, 3.1, 2.2, 3.5, 3.7, 2.2, 1.9, 2.4, 5.3, 5.4, 3.8, 2.9};
        double[] febPrecip = {3.8, 2.7, 2.1, 3.4, 3.2, 1.5, 2.1, 2.4, 4.7, 4.6, 2.6, 2.5};
        double[] marPrecip = {5.0, 3.8, 2.7, 4.3, 3.9, 1.9, 2.6, 3.5, 6.4, 6.5, 3.7, 4.2};
        double[] aprPrecip = {3.0, 2.5, 1.7, 2.9, 3.1, 2.1, 3.4, 2.4, 3.9, 3.6, 3.6, 2.9};
        double[] mayPrecip = {2.6, 3.3, 3.4, 3.2, 3.5, 3.5, 5.5, 3.7, 4.4, 5.0, 5.4, 3.8};
        double[] junPrecip = {4.3, 5.7, 9.8, 5.8, 5.4, 4.6, 8.5, 7.4, 6.4, 6.9, 7.6, 6.0};
        double[] julPrecip = {7.3, 5.2, 9.0, 6.1, 6.0, 3.3, 5.8, 7.2, 8.0, 8.0, 6.0, 6.5};
        double[] augPrecip = {7.3, 6.1, 9.5, 6.6, 6.9, 5.4, 8.6, 6.3, 6.9, 7.0, 6.7, 6.0};
        double[] sepPrecip = {7.1, 6.6, 7.9, 4.4, 7.9, 5.5, 8.4, 5.8, 5.8, 5.0, 8.1, 6.8};
        double[] octPrecip = {4.2, 4.5, 2.6, 2.5, 3.9, 4.3, 6.2, 2.7, 4.1, 3.3, 5.5, 5.0};
        double[] novPrecip = {3.6, 3.0, 1.7, 2.2, 2.3, 2.6, 3.4, 2.3, 4.5, 3.9, 5.6, 3.0};
        double[] decPrecip = {3.5, 3.7, 1.6, 2.6, 2.6, 2.1, 2.2, 2.3, 4.0, 4.1, 3.1, 2.2};
        
        
       //City Names.
       
      String[] cities = {"Apalachiola", "Daytona Beach", "Fort Myers", "Gainesville", "Jacksonville", "Key West", "Miami", "Orlando", "Pensacola", "Tallahassee", "West Palm Beach", "Vero Beach"};
        
        
        
        //The Code:
        
        System.out.println("Please choose a city: ");
        System.out.println("1: " +cities[0]);
        System.out.println("2: " +cities[1]);
        System.out.println("3: " +cities[2]);
        System.out.println("4: " +cities[3]);
        System.out.println("5: " +cities[4]);
        System.out.println("6: " +cities[5]);
        System.out.println("7: " +cities[6]);
        System.out.println("8: " +cities[7]);
        System.out.println("9: " +cities[8]);
        System.out.println("10: " +cities[9]);
        System.out.println("11: " +cities[10]);
        System.out.println("12: " +cities[11]);
        int city = in.nextInt();
        
        System.out.println("\f");
        System.out.println("                    Climate Data                     ");
        System.out.println("          Location: " + cities[(city - 1)] + ", Florida");
        System.out.println("                                         ");
        System.out.println("Month         Temperature (F)        Precipication (in.) ");
        System.out.println("Jan.          "+janTemp[city]+"                "+ janPrecip[city]);
        System.out.println("Feb.          "+febTemp[city]+"                "+ febPrecip[city]);
        System.out.println("Mar.          "+marTemp[city]+"                "+ marPrecip[city]);
        System.out.println("Apr.          "+aprTemp[city]+"                "+ aprPrecip[city]);
        System.out.println("May.          "+mayTemp[city]+"                "+ mayPrecip[city]);
        System.out.println("Jun.          "+junTemp[city]+"                "+ junPrecip[city]);
        System.out.println("Jul.          "+julTemp[city]+"                "+ julPrecip[city]);
        System.out.println("Aug.          "+augTemp[city]+"                "+ augPrecip[city]);
        System.out.println("Sep.          "+sepTemp[city]+"                "+ sepPrecip[city]);
        System.out.println("Oct.          "+octTemp[city]+"                "+ octPrecip[city]);
        System.out.println("Nov.          "+novTemp[city]+"                "+ novPrecip[city]);
        System.out.println("Dec.          "+decTemp[city]+"                "+ decPrecip[city]);
        
        
        
        
        
        
    }
}