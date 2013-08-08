/**
 * The CurrencyConversionV2 class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current 
 * exchange rate. Now, with added Input support!
 * 
 *
 * ©CSA/FLVS 2007
 * @author Maria Vieta Jacquard
 * @modified by: Ricky Mutschlechner
 * @version 10/06/2010
 */
 import java.util.Scanner; //imports Scanner methods
public class CurrencyConversionV2
{   
    public static void main(String [ ] args)
    {
      //construct a Scanner Object
      Scanner in;
      in = new Scanner(System.in);
        
        double usdToPeso = 12.5379;
        double usdToYen = 83.6814;
        double usdToEuro = 0.733577;
        
        
        System.out.println("Please enter your Starting US Dollars:   ");
        double startingUsDollars = in.nextDouble();      // local variable for US Dollars
        
        
        System.out.println("Please enter the amount of Pesos you have spent:    ");
        double pesosSpent = in.nextDouble();             // local variable for Mexican pesos spent
        
        
        double remainingPesos = 0;
        
        
        double dollarsSpentInMexico = (pesosSpent / usdToPeso);         // local variable for dollars spent in Mexico
        
        System.out.println("How much did you spend in Japan? In USD:    ");
        
        double dollarsSpentInJapan = in.nextDouble();
        
        System.out.println("How much did you spent in Europe? In USD:    ");
        
        double dollarsSpentInEurope = in.nextDouble();
        
        System.out.println();
        
      
        
        //Started with
      
       System.out.println("Started with " + startingUsDollars + " dollars");
       
         //USD to Pesos
       
       System.out.println();
       System.out.println(startingUsDollars + " American Dollars = " + (startingUsDollars * usdToPeso) + " Mexican Pesos");
       System.out.println("dollars spent: " + (dollarsSpentInMexico) + "          pesos spent: "+ pesosSpent);
       System.out.println();
       
       
       //USD To Yen
       
      
       System.out.println((startingUsDollars - dollarsSpentInMexico) + " American Dollars = " +((startingUsDollars - dollarsSpentInMexico) * usdToYen)+ " Japanese Yen");
       System.out.println("dollars spent = " + dollarsSpentInJapan+ "        yen spent: " + (dollarsSpentInJapan * usdToYen));
       System.out.println();
       
       
       //USD To Euros
       
       System.out.println((startingUsDollars - dollarsSpentInMexico - dollarsSpentInJapan) + " American Dollars = " +((startingUsDollars - dollarsSpentInMexico - dollarsSpentInJapan) * usdToEuro)+ " Euros");
       System.out.println("dollars spent = " +dollarsSpentInEurope+ "        Euros spent: " + (dollarsSpentInEurope * usdToEuro));
       System.out.println();
       
       //Last Snippet
       System.out.println("Returned with: " +(startingUsDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInEurope)+ " American dollars.");
      
       
      
    } // end of main method
} // end of class     

