
/**
 * Constructor and methods of the CarV7 Class.
 * 
 * @author Ricky Mutschlechner
 * @version 11/29/2010
 */
public class CarV7
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
        
    CarV7(String type, int endMi, int startMi, double galUsed, double pricePerGal, double costOfGals, double milesPerGal, double galsPerMile )
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
    public String getType()
    {
        return carType;
    }
    public int getStartMiles()
    {
        return startMiles;
    }
    public int getEndMiles()
    {
        return endMiles;
    }
    public double getGallonsUsed()
    {
        return gallonsUsed;
    }
    public double getPricePerGallon()
    {
        return pricePerGallon;
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
    
    
}