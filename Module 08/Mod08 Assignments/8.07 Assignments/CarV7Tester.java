
/**
 * Main method of the CarV7 class, along with an output. Compares 3 cars side by side.
 * 
 * @author Ricky Mutschlechner
 * @version 11/29/2010
 */
public class CarV7Tester
{
 //main method
    public static void main (String[] args)
    {

        //declaration of variables
        int sMiles, sMiles2, sMiles3, eMiles, eMiles2, eMiles3, distance;
        double mpg, gals, gals2, gals3, price, cost;
        String type, type2, type3;

        
        //initialization of variables for first car
        gals = 10.4;
        sMiles = 107603;
        eMiles = 107706;
        price = 3.05;
        type = "97 Pontiac Grand Prix";
        
        //initialization for second car
        gals2 = 11.9;
        sMiles2 = 13206;
        eMiles2 = 13991;
        type2 = "10 Toyota Prius";
        
        //initialization for third car
        gals3 = 18.5;
        sMiles3 = 21632;
        eMiles3 = 21806;
        type3 = "10 BMW M5";
        
        
        
        CarV7 car1 = new CarV7(type, eMiles, sMiles, gals, price, gals *price, ((eMiles - sMiles)/gals), gals/price) ; //declaration of object
        CarV7 car2 = new CarV7(type2, eMiles2, sMiles2, gals2, price, gals2 *price, ((eMiles2 - sMiles2)/gals2), gals2/price) ; //declaration of object
        CarV7 car3 = new CarV7(type3, eMiles3, sMiles3, gals3, price, gals3 *price, ((eMiles3 - sMiles3)/gals3), gals3/price) ; //declaration of object

        
        cost = car1.calcCost(); //one last calculation, needed to be done post-creation.
      
        

        //Printing results
        System.out.println("                             Gas Mileage Calculations                     ");
        System.out.println("      Type of Car         Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal   Gal/Mile");
        System.out.println("===========================================================================================================");
        System.out.printf("%3s %10d %11d %10d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car1.getType(), car1.getStartMiles(), car1.getEndMiles(), car1.calcDistance(), car1.getGallonsUsed(), car1.getPricePerGallon(),  car1.calcCost(), car1.calcMPG(), car1.calcGPM());
        System.out.printf("%3s %15d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car2.getType(), car2.getStartMiles(), car2.getEndMiles(), car2.calcDistance(), car2.getGallonsUsed(), car2.getPricePerGallon(),  car2.calcCost(), car2.calcMPG(), car2.calcGPM());
        System.out.printf("%3s %21d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car3.getType(), car3.getStartMiles(), car3.getEndMiles(), car3.calcDistance(), car3.getGallonsUsed(), car3.getPricePerGallon(),  car3.calcCost(), car3.calcMPG(), car3.calcGPM());
    }
}