
/**
 * Main method of the CO2FootprintV1 Model.
 * 
 * @author Ricky Mutschlechner
 * @version 12/03/2010
 */
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        //declaration of variables
        double gals, tonsCO2, poundsCO2;
        
        //initialization of variables
        gals = 1492.63;
        
        CO2FootprintV1 footprint = new CO2FootprintV1(gals);
        
        //calling all the methods.
        footprint.calcTonsCO2();
        footprint.convertTonsToPoundsCO2();
        tonsCO2 = footprint.getTonsCO2();
        poundsCO2 = footprint.getPoundsCO2();
        
        System.out.println("             CO2 Emissions       ");
        System.out.println("Gallons   Pounds      Tons       ");
        System.out.println("of Gas    from Gas   from Gas    ");
        System.out.println("******************************   ");
        System.out.printf("%6.1f    %8.2f    %4.3f",gals, poundsCO2, tonsCO2);
        
    
    }
}
