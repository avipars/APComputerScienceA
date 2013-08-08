
/**
 * Methods and constructor for calculating the CO2 emitted from waste.
 * 
 * @author Ricky Mutschlechner
 * @version 12/6/2010
 */
public class CO2FromWaste
{
    private int numPeople;
    private boolean recyclePaper, recyclePlastic, recycleGlass, recycleCans;
    
   private double grossWasteEmission, netWasteEmission, wasteReduction;
    
    /**
     * Default constructor for the CO2FromWaste class.
     * 
     */
    public CO2FromWaste(int people, boolean paper, boolean plastic, boolean glass, boolean cans){
        numPeople = people;
        recyclePaper = paper;
        recyclePlastic = plastic;
        recycleGlass = glass;
        recycleCans = cans;
    }
    
    public int getNumPeople(){
        return numPeople;
    }
    
    public boolean getRecyclingPaper(){
        return recyclePaper;
    }
    
    public boolean getRecyclingPlastic(){
         return recyclePlastic;   
    }
    
    public boolean getRecyclingGlass(){
        return recycleGlass;
    }
    
    public boolean getRecyclingCans(){
       return recycleCans;
    }
    
    /**
     * Method to calculate Gross Waste Emission of CO2.
     * 
     */
    public void calcGrossWasteEmission(){
        grossWasteEmission = (numPeople * 1018);
    }
    
    /**
     * Method to calculate Waste Reduction.
     */
    public void calcWasteReduction(){
        wasteReduction = 0;
        
        if(recyclePaper == true){
         wasteReduction += (numPeople * 184);
        }
        if(recyclePlastic == true){
         wasteReduction += (numPeople * 25.6);
        }
        if(recycleGlass == true){
         wasteReduction += (numPeople * 46.6);
        }
        if(recycleCans == true){
         wasteReduction += (numPeople * 165.8);
        } 
        
    }
    
    /**
     * Method to calculate the Net Waste Reduction using the last two methods.
     */
    public void calcNetWasteEmission(){
        calcGrossWasteEmission();
        calcWasteReduction();
        netWasteEmission = grossWasteEmission - wasteReduction;
    }

    public double getGrossWasteEmission() {
        // TODO Auto-generated method stub
        return grossWasteEmission;
    }

    public double getWasteReduction() {
        // TODO Auto-generated method stub
        return wasteReduction;
    }

    public double getNetWasteEmission() {
        // TODO Auto-generated method stub
        return netWasteEmission;
    }
}






