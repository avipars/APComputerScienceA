

/**
 * Uses OOP to display the stats and performance of a/my car.
 * 
 * @author Ricky Mutschlechner
 * @version 11/29/2010
 */
public class CarV5
{
    //instance variables
        private String carType;
        private int endMiles;
        private int startMiles;
        private double gallonsUsed;
        private double pricePerGallon;
        private double costOfTrip;
        private double milesPerGallon;
        private double gallonsPerMile;
        
    /**
     * Constructor for objects of class CarV5
     */
    public CarV5(String type, int endMi, int startMi, double galUsed, double pricePerGal, double costOfGals, double milesPerGal, double galsPerMile )
    {
        carType = type;
        endMiles = endMi;
        startMiles = startMi;
        gallonsUsed = galUsed;
        pricePerGallon = pricePerGal;
        costOfTrip = costOfGals;
        milesPerGallon = milesPerGal;
        gallonsPerMile = galsPerMile;
    }
    
    
    //Distance Calculating Method
    public int calcDistance()
    {
        return endMiles - startMiles;
    }
    
    
    
    //MPG Calculating Method
    public double calcMPG()
    {
        return ((double)calcDistance()) / gallonsUsed;
    }
    
    //GPM Calculating Method
    public double calcGPM()
    {
        return ((double)gallonsUsed)/calcDistance();
    }
    
    //Cost Calculating Method
    public double calcCost()
    {
        double cost = (gallonsUsed * pricePerGallon);
        return cost;
    }
    
    
    
    
    //main method
    public static void main (String[] args)
    {

        //declaration of variables
        double gals;
        int sMiles;
        int eMiles;
        int distance;
        double mpg;
        String car;
        double price;
        double cost;
        
        
        gals = 10.4;
        sMiles = 107603;
        eMiles = 107706;
        price = 3.05;

        car = "97 Pontiac Grand Prix";
        
        
        
        CarV5 car1 = new CarV5(car, eMiles, sMiles, gals, price, gals *price, ((eMiles - sMiles)/gals), gals/price) ; //declaration of object
        //initialization of variables
        
        cost = car1.calcCost(); //one last calculation, needed to be done post-creation.
        
        
        //calling methods, cont. initialization
        distance = car1.calcDistance();
        mpg = car1.calcMPG();
        

        //Printing results
        System.out.println("                             Gas Mileage Calculations                     ");
        System.out.println("      Type of Car         Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal   Gal/Mile");
        System.out.println("===========================================================================================================");
        System.out.printf("%3s %10d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car1.carType, car1.startMiles, car1.endMiles, car1.calcDistance(), car1.gallonsUsed, car1.pricePerGallon,  car1.calcCost(), car1.calcMPG(), car1.calcGPM());

    }
}
