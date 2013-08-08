/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 * 
 *      Sample Calculation:
 *        1 mile = 5280 ft, therefore    6230 ft / 5280 = 1.7992 miles
 *                      
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 * 
 * Modified by: Ricky Mutschlechner
 * Date: 9/29/2010
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {    
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        double liters;                  // weight in liters
        double gallons;                 // weight in gallons
        //...finish declaring local variables here, including end of line 
        //...comments doccumenting purpose of each variable
       
        
        
        System.out.println("**********************************************************");
        System.out.println("***********************This Program **********************");
        System.out.println("*************************Is Used**************************");
        System.out.println("************************To Make***************************");
        System.out.println("************************Conversions***********************");
        System.out.println("**********************************************************");
        //convert feet to miles
        feet = 6230;
        miles = feet / 5280;
        System.out.println(feet + " ft. = " + miles + " mi. ");
        
        //convert miles to feet
		miles = 2;
		feet = 5280 * miles;
		System.out.println(miles + " mi. = " + feet + " ft. ");
        
        //convert miles to kilometers
        miles = 3.5;
        kilometers = miles * 1.609344;
        System.out.println(miles + " mi. = " + kilometers + " km. ");
       
        //convert kilometers to miles
        kilometers = 4.2;
        miles = kilometers / 1.609344;
        System.out.println(kilometers + " km. = " + miles + " mi. ");
       
        //convert pounds to kilograms
        pounds = 26.25;
        kilograms = pounds * 2.204;
        System.out.println(pounds + " lbs. = " + kilograms + " kg. ");
        
        //convert kilograms to pounds
        
        kilograms = 55.44;
        pounds = kilograms / 2.204;
        System.out.println(kilograms + " kg. = " + pounds + " lbs. ");
        
        //convert gallons to liters
        gallons = 10;
        liters = gallons / 0.2642;
        System.out.println(gallons + " gal. = " + liters + " l. ");
        
        //convert liters to gallons
        liters = 42;
        gallons = liters * 0.2642;
        System.out.println(liters + " l. = " + gallons + " gal. ");
        
        
        
        
        
    }//end of main method
}//end of class

