
/**
 * Displays Temperature and Precipitation over a year's time of a given city in Florida.
 * 
 * @author Ricky Mutschlechner
 * @version 11/14/2010
 */
import java.util.Scanner;
public class Weather2
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius)");
        String tempScale = in.nextLine();
        System.out.println("Choose the precipitation scale (i = inches, c = centimeters)");
        String precipScale = in.nextLine();
        
        double inchesToCm = 2.54;
        
        
        //Temps in Fahrenheit.
        double[] janTemp = {52.7, 58.4, 64.9, 54.3, 53.1, 70.3, 68.1, 60.9, 52.0, 50.55, 66.2, 63.0};
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
        int actualCity = (city - 1);
        
        
        
        
        //Averages and Annual Precipitation:
        double averageTempF = ((janTemp[actualCity] + febTemp[actualCity] + marTemp[actualCity] + aprTemp[actualCity] + mayTemp[actualCity] + junTemp[actualCity] + julTemp[actualCity] + augTemp[actualCity] + sepTemp[actualCity] + octTemp[actualCity] + novTemp[actualCity] + decTemp[actualCity]) / 12);
        double annualPrecipI = ((janPrecip[actualCity] + febPrecip[actualCity] + marPrecip[actualCity] + aprPrecip[actualCity] + mayPrecip[actualCity] + junPrecip[actualCity] + julPrecip[actualCity] + augPrecip[actualCity] + sepPrecip[actualCity] + octPrecip[actualCity] + novPrecip[actualCity] + decPrecip[actualCity]));
        double averageTempC = 0.555 * ((averageTempF) - 32);
        double annualPrecipC = inchesToCm * (annualPrecipI);
        
        if(tempScale.equalsIgnoreCase("F") && (precipScale.equals("c")))
        {
        System.out.println("\f");
        System.out.println("                    Climate Data                     ");
        System.out.println("          Location: " + cities[actualCity] + ", Florida");
        System.out.println("                                         ");
        System.out.println("Month         Temperature (F)        Precipication (cm.) ");
        System.out.println("*******************************************************************");
        System.out.printf("Jan.%14.1f%22.1f\n", janTemp[actualCity], (inchesToCm * janPrecip[actualCity]));
        System.out.printf("Feb.%14.1f%22.1f\n", febTemp[actualCity], (inchesToCm * febPrecip[actualCity]));
        System.out.printf("Mar.%14.1f%22.1f\n", marTemp[actualCity], (inchesToCm * marPrecip[actualCity]));
        System.out.printf("Apr.%14.1f%22.1f\n", aprTemp[actualCity], (inchesToCm * aprPrecip[actualCity]));
        System.out.printf("May.%14.1f%22.1f\n", mayTemp[actualCity], (inchesToCm * mayPrecip[actualCity]));
        System.out.printf("Jun.%14.1f%22.1f\n", junTemp[actualCity], (inchesToCm * junPrecip[actualCity]));
        System.out.printf("Jul.%14.1f%22.1f\n", julTemp[actualCity], (inchesToCm * julPrecip[actualCity]));
        System.out.printf("Aug.%14.1f%22.1f\n", augTemp[actualCity], (inchesToCm * augPrecip[actualCity]));
        System.out.printf("Sep.%14.1f%22.1f\n", sepTemp[actualCity], (inchesToCm * sepPrecip[actualCity]));
        System.out.printf("Oct.%14.1f%22.1f\n", octTemp[actualCity], (inchesToCm * octPrecip[actualCity]));
        System.out.printf("Nov.%14.1f%22.1f\n", novTemp[actualCity], (inchesToCm * novPrecip[actualCity]));
        System.out.printf("Dec.%14.1f%22.1f\n", decTemp[actualCity], (inchesToCm * decPrecip[actualCity]));
        System.out.println("*******************************************************************");
        System.out.printf("Average:%8.1f          Annual:%8.1f ", averageTempF, annualPrecipC); 
    }
        
        if(tempScale.equalsIgnoreCase("F") && (precipScale.equalsIgnoreCase("i")))
        {
            
        System.out.println("\f");
        System.out.println("                    Climate Data                     ");
        System.out.println("          Location: " + cities[(city - 1)] + ", Florida");
        System.out.println("                                         ");
        System.out.println("Month         Temperature (F)        Precipication (in.) ");
        System.out.println("*******************************************************************");
        System.out.printf("Jan.%14.1f%22.1f\n",janTemp[actualCity], janPrecip[actualCity]);
        System.out.printf("Feb.%14.1f%22.1f\n",febTemp[actualCity], febPrecip[actualCity]);
        System.out.printf("Mar.%14.1f%22.1f\n",marTemp[actualCity], marPrecip[actualCity]);
        System.out.printf("Apr.%14.1f%22.1f\n",aprTemp[actualCity], aprPrecip[actualCity]);
        System.out.printf("May.%14.1f%22.1f\n",mayTemp[actualCity], mayPrecip[actualCity]);
        System.out.printf("Jun.%14.1f%22.1f\n",junTemp[actualCity], junPrecip[actualCity]);
        System.out.printf("Jul.%14.1f%22.1f\n",julTemp[actualCity], julPrecip[actualCity]);
        System.out.printf("Aug.%14.1f%22.1f\n",augTemp[actualCity], augPrecip[actualCity]);
        System.out.printf("Sep.%14.1f%22.1f\n",sepTemp[actualCity], sepPrecip[actualCity]);
        System.out.printf("Oct.%14.1f%22.1f\n",octTemp[actualCity], octPrecip[actualCity]);
        System.out.printf("Nov.%14.1f%22.1f\n",novTemp[actualCity], novPrecip[actualCity]);
        System.out.printf("Dec.%14.1f%22.1f\n",decTemp[actualCity], decPrecip[actualCity]);
        System.out.println("*******************************************************************");
        System.out.printf("Average:%8.1f          Annual:%8.1f ", averageTempF, annualPrecipI); 
       }
       
         if(tempScale.equalsIgnoreCase("C") && (precipScale.equalsIgnoreCase("i")))
        {
            
        System.out.println("\f");
        System.out.println("                    Climate Data                     ");
        System.out.println("          Location: " + cities[(city - 1)] + ", Florida");
        System.out.println("                                         ");
        System.out.println("Month         Temperature (C)        Precipication (in.) ");
        System.out.println("*******************************************************************");
        System.out.printf("Jan.%14.1f%22.1f\n",(0.555 * (janTemp[actualCity] - 32)), janPrecip[actualCity]);
        System.out.printf("Feb.%14.1f%22.1f\n",(0.555 * (febTemp[actualCity] - 32)), marPrecip[actualCity]);
        System.out.printf("Apr.%14.1f%22.1f\n",(0.555 * (aprTemp[actualCity] - 32)), aprPrecip[actualCity]);
        System.out.printf("May.%14.1f%22.1f\n",(0.555 * (mayTemp[actualCity] - 32)), mayPrecip[actualCity]);
        System.out.printf("Jun.%14.1f%22.1f\n",(0.555 * (junTemp[actualCity] - 32)), junPrecip[actualCity]);
        System.out.printf("Jul.%14.1f%22.1f\n",(0.555 * (julTemp[actualCity] - 32)), julPrecip[actualCity]);
        System.out.printf("Aug.%14.1f%22.1f\n",(0.555 * (augTemp[actualCity] - 32)), augPrecip[actualCity]);
        System.out.printf("Sep.%14.1f%22.1f\n",(0.555 * (sepTemp[actualCity] - 32)), sepPrecip[actualCity]);
        System.out.printf("Oct.%14.1f%22.1f\n",(0.555 * (octTemp[actualCity] - 32)), octPrecip[actualCity]);
        System.out.printf("Nov.%14.1f%22.1f\n",(0.555 * (novTemp[actualCity] - 32)), novPrecip[actualCity]);
        System.out.printf("Dec.%14.1f%22.1f\n",(0.555 * (decTemp[actualCity] - 32)), decPrecip[actualCity]);
        System.out.println("*******************************************************************");
        System.out.printf("Average:%8.1f          Annual:%8.1f ", averageTempC, annualPrecipI); 
       }
        
                if(tempScale.equalsIgnoreCase("C") && (precipScale.equalsIgnoreCase("c")))
        {
        System.out.println("\f");
        System.out.println("                    Climate Data                     ");
        System.out.println("          Location: " + cities[(city - 1)] + ", Florida");
        System.out.println("                                         ");
        System.out.println("Month         Temperature (C)        Precipication (cm.) ");
        System.out.println("*******************************************************************");
        System.out.printf("Jan.%14.1f%22.1f\n",(0.555 * (janTemp[actualCity] - 32)), (inchesToCm * janPrecip[actualCity]));
        System.out.printf("Feb.%14.1f%22.1f\n",(0.555 * (febTemp[actualCity] - 32)), (inchesToCm * febPrecip[actualCity]));
        System.out.printf("Mar.%14.1f%22.1f\n",(0.555 * (marTemp[actualCity] - 32)), (inchesToCm * marPrecip[actualCity]));
        System.out.printf("Apr.%14.1f%22.1f\n",(0.555 * (aprTemp[actualCity] - 32)), (inchesToCm * aprPrecip[actualCity]));
        System.out.printf("May.%14.1f%22.1f\n",(0.555 * (mayTemp[actualCity] - 32)), (inchesToCm * mayPrecip[actualCity]));
        System.out.printf("Jun.%14.1f%22.1f\n",(0.555 * (junTemp[actualCity] - 32)), (inchesToCm * junPrecip[actualCity]));
        System.out.printf("Jul.%14.1f%22.1f\n",(0.555 * (julTemp[actualCity] - 32)), (inchesToCm * julPrecip[actualCity]));
        System.out.printf("Aug.%14.1f%22.1f\n",(0.555 * (augTemp[actualCity] - 32)), (inchesToCm * augPrecip[actualCity]));
        System.out.printf("Sep.%14.1f%22.1f\n",(0.555 * (sepTemp[actualCity] - 32)), (inchesToCm * sepPrecip[actualCity]));
        System.out.printf("Oct.%14.1f%22.1f\n",(0.555 * (octTemp[actualCity] - 32)), (inchesToCm * octPrecip[actualCity]));
        System.out.printf("Nov.%14.1f%22.1f\n",(0.555 * (novTemp[actualCity] - 32)), (inchesToCm * novPrecip[actualCity]));
        System.out.printf("Dec.%14.1f%22.1f\n",(0.555 * (decTemp[actualCity] - 32)), (inchesToCm * decPrecip[actualCity]));
        System.out.println("*******************************************************************");
        System.out.printf("Average:%8.1f          Annual:%8.1f ", averageTempC, annualPrecipC); 
       }
        
        
        
        
    }
}