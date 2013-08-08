
/**
 * Methods and constructor for calculating CO2 emissions from annual electricity usage.
 * 
 * @author Ricky Mutschlechner
 * @version 12/5/2010
 */
import java.util.ArrayList;
public class CO2FromElectricity{

    /**
     * Default constructor to create an object from the CO2FromElectricity class.
     */
    CO2FromElectricity(){
        
    }
    /**
     * Method that calculates the average electricity bill over the span of one year.
     * @param ArrayList<Double>
     * @returns double Average Monthly Bill
     */
    double calcAverageBill(ArrayList<Double> monthlyBill){
        double total = 0;
        for( Double d: monthlyBill){
            total += d;
        }
        return total/monthlyBill.size();
    }
    /**
     * Method that calculates the average price per KWH over the span of one year.
     * @param ArrayList<Double>
     * @returns double Average KWH Price
     */
    double calcAveragePrice(ArrayList<Double> monthlyPrice){
        double total = 0;
        for(Double d : monthlyPrice){
            total += d;
        }
         return total/monthlyPrice.size();
        
    }
    /**
     * Method that calculates the CO2 burned per year relative to electricity used.
     * @param double avgBill, avgPrice
     * @returns double CO2 Burned
     */
    double calcElectricityCO2(double avgBill, double avgPrice){
        return (avgBill / avgPrice)* 1.37 * 12;
    }
        
    }

