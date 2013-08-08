
/**
 * Main method for the AnnualFuelUse class.
 * 
 * @author Ricky Mutschlechner
 * @version 11/30/2010
 */
public class AnnualFuelUseTester
{

    public static void main(String[] args)
    {
    //declaration of variables:
        int fillUp1, fillUp2, fillUp3, days1, days2, days3, startMiles1, startMiles2,
                startMiles3, endMiles1, endMiles2, endMiles3, distance1, distance2, distance3;
        double gallonsUsed1, gallonsUsed2, gallonsUsed3, mpg1, mpg2, mpg3, price1, price2, price3,
                cost1, cost2, cost3;
                
    //initialization of variables:
    fillUp1 = 1;
    fillUp2 = 2;
    fillUp3 = 3;
    days1 = fillUp1;
    days2 = 9;
    days3 = 14;
    startMiles1 = 108007;
    endMiles1 = 108199;
    startMiles2 = endMiles1;
    endMiles2 = 108302;
    startMiles3 = endMiles2;
    endMiles3 = 108497;
    gallonsUsed1 = 11.7;
    gallonsUsed2 = 10.5;
    gallonsUsed3 = 11.4;
    price1 = 3.09;
    price2 = 3.17;
    price3 = 2.99;

    
    AnnualFuelUse[] years = {new AnnualFuelUse(fillUp1, days1, startMiles1, endMiles1,  gallonsUsed1, price1),
                             new AnnualFuelUse(fillUp2, days2, startMiles2, endMiles2,
                            gallonsUsed2, price2),
                             new AnnualFuelUse(fillUp3, days3, startMiles3, endMiles3,
                            gallonsUsed3, price3)};
                            
          
    //min and max Distance.
    
    
    int minDist = Integer.MAX_VALUE;                        
        for(int i = 0; i < years.length; i++)
    {
       if(years[i].calcDistance() < minDist)
         { 
             minDist = years[i].calcDistance();
          }
    }
    
    
    int maxDist = Integer.MIN_VALUE;
    for(int i = 0; i < years.length; i++)
    {
         if(years[i].calcDistance() > maxDist)
         {
         maxDist = years[i].calcDistance();
         }
    }
    
    
    
    //min and max MPG
    
        double minMPG = Double.MAX_VALUE;                        
        for(int i = 0; i < years.length; i++)
    {
       if(years[i].calcMPG() < minMPG)
         { 
             minMPG = years[i].calcMPG();
          }
    }
    
    
    double maxMPG = Double.MIN_VALUE;
    for(int i = 0; i < years.length; i++)
    {
         if(years[i].calcMPG() > maxMPG)
         {
         maxMPG = years[i].calcMPG();
         }
    }
    
    
    
    
    //min and max Price
    
        double minPrice = Double.MAX_VALUE;                        
        for(int i = 0; i < years.length; i++)
    {
       if(years[i].getPrice() < minPrice)
         { 
             minPrice = years[i].getPrice();
          }
    }
    
    
    double maxPrice = Double.MIN_VALUE;
    for(int i = 0; i < years.length; i++)
    {
         if(years[i].getPrice() > maxPrice)
         {
         maxPrice = years[i].getPrice();
         }
    }
    
    //calc total distance
    int totalDist = 0;
    for(int i = 0; i < years.length; i++)
    {
        totalDist += years[i].calcDistance();
    }
    
    //calc total gallons used
    double totalGalsUsed = 0;
    for(int i = 0; i < years.length; i++)
    {
        totalGalsUsed += years[i].getGalsUsed();
    }
    
    //calc total cost
    double totalCost = 0;
    for(int i = 0; i < years.length; i++)
    {
        totalCost += years[i].calcCost();
    }
    
    //calc annual distance
    int annualDist = 0;
    for(int i = 0; i < years.length; i++)
    {
        annualDist += (years[i].calcDistance() * 96);
    }
    
    //calc annual gallons used
    double annualGals = 0;
        for(int i = 0; i < years.length; i++)
    {
        annualGals += (years[i].getGalsUsed() * 96);
    }
    
    //calc annual MPG
    double annualMPG = 0;
        for(int i = 0; i < years.length; i++)
    {
        annualMPG += (years[i].calcMPG()) / 2.5;
    }
    
    
    //calc annual cost
    double annualCost = 0;
        for(int i = 0; i < years.length; i++)
    {
        annualCost += (years[i].calcCost() * 96);
    }
   
    
    
    
                            
        System.out.println("Fill Up   Days   Start Miles   End Miles   Distance   " +
                "Gallons Used    MPG      Price    Cost");

        for (int i = 0; i < years.length; i++)
        {
            System.out.printf("%4d %8d %12d %12d %8d %12.2f %12.1f %8.2f %8.2f \n",years[i].getFillup(), years[i].getDays(), 
                    years[i].getStartMiles(), years[i].getEndMiles(), years[i].calcDistance(),
                    years[i].getGalsUsed(), years[i].calcMPG(), years[i].getPrice(), years[i].calcCost());

        }
System.out.println();
System.out.printf("Minimum:                                     %3d %25.1f %8.2f\n", minDist, minMPG, minPrice);
        
System.out.printf("Maximum:                                     %3d %25.1f %8.2f\n", maxDist, maxMPG, maxPrice);
System.out.println();
System.out.println();
System.out.printf("Totals:                                      %3d %12.2f %31.2f\n", totalDist, totalGalsUsed, totalCost);   
System.out.printf("Annual Projection:                           %5d %11.2f %12.2f %17.2f", annualDist, annualGals, annualMPG, annualCost);    

}
             
   
                            
    
}

