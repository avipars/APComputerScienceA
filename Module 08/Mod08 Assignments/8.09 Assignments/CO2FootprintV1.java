
/**
 * CO2 Footprint Model methods and instance variables.
 * 
 * @author Ricky Mutschlechner
 * @version 12/03/2010
 */
public class CO2FootprintV1
{
    //declaration of instance variables
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;
    
    /**
     * Constructor for CO2Footprint Model.
     * @param gals - gallons used
     */
    CO2FootprintV1(double gals)
    {
        myGallonsUsed = gals;
    } 
    /**
     * Method to get the tons of CO2.
     * @return double Tons CO2
     */
    public double getTonsCO2()
    {
    return myTonsCO2;
    }
    
    /**
     * Method to get Pounds of CO2.
     * @return double pounds CO2
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
    
    /**
     * Method to calculate metric tons of CO2 emitted per gallon of gas.
     * Initializes myTonsCO2.
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (myGallonsUsed * (8.78E-3));
    }
    
    /**
     * Method to calculate pounds of CO2 emitted per gallon of gas.
     * initializes myPoundsCO2.
     */
    public void convertTonsToPoundsCO2()
    {
        myPoundsCO2 = (myTonsCO2 * 2000);
    }
    
}
    
    