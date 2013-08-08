
/**
 * Constructor and getters for Annual Fuel Usage projections.
 * 
 * @author Ricky Mutschlechner
 * @version 11/30/2010
 */
public class AnnualFuelUse
{
//this class contains all of the methods.

//instance variables
    private int fillUp, days, startMiles, endMiles, distance;
    private double gallonsUsed, mpg, price, cost;
    
    AnnualFuelUse(int fill, int day, int startMi, int endMi, double galUsed, double pricePerGal)
    {
    fillUp = fill;
    days = day;
    startMiles = startMi;
    endMiles = endMi;
    gallonsUsed = galUsed;
    price = pricePerGal;
    }
    
    public int getFillup()
    {
        return fillUp;
    }
    
    public int getDays()
    {
        return days;
    }
    
    public int getStartMiles()
    {
        return startMiles;
    }
    
    public int getEndMiles()
    {
        return endMiles;
    }
    
    public int calcDistance()
    {
        distance = endMiles - startMiles;
        return distance;
    }
    
    public double getGalsUsed()
    {
        return gallonsUsed;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public double calcCost()
    {
      cost = gallonsUsed * price; 
      return cost;
    }
    
    public double calcMPG()
    {
        mpg = ((double)distance) / gallonsUsed;
        return mpg;
    }
       

    
    
    




}
