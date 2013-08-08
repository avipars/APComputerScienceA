
/**
 * Write a description of class CO2FromElectricityTester here.
 * 
 * @author Ricky Mutschlechner
 * @version 12/05/2010
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
    public static void main(String[] args)
    {
        
    CO2FromElectricity coElec = new  CO2FromElectricity();
        
    ArrayList<Double>monthlyBill = new ArrayList();
    monthlyBill.add(192.53);
    monthlyBill.add(185.77);
    monthlyBill.add(188.81);
    monthlyBill.add(176.91);
    monthlyBill.add(201.58);
    monthlyBill.add(220.72);
    monthlyBill.add(215.63);
    monthlyBill.add(199.66);
    monthlyBill.add(199.27);
    monthlyBill.add(190.13);
    monthlyBill.add(192.24);
    monthlyBill.add(195.16);
    
    double averageBill = coElec.calcAverageBill(monthlyBill);
    
    ArrayList<Double>monthlyCost = new ArrayList();
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    monthlyCost.add(0.126110);
    
    double averagePrice = coElec.calcAveragePrice(monthlyCost);
    
    double emissions = coElec.calcElectricityCO2(averageBill, averagePrice);
    
    System.out.printf("Average Monthly Electricity Bill: %3.2f", averageBill);
    System.out.println();
    System.out.printf("Average Monthly Electricity Price: %1.2f", averagePrice);
    System.out.println();
    System.out.printf("Annual CO2 Emissions from Electricity Usage: %5.1f pounds",emissions);
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
