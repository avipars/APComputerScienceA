/**
 * CO2FromWaste main method and ArrayList.
 * 
 * @author Ricky Mutschlechner
 * @version 12/7/2010
 */
import java.util.ArrayList;
public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWaste> waste = new ArrayList<CO2FromWaste>();
       waste.add(new CO2FromWaste(3, true, false, true, true));
       waste.add(new CO2FromWaste(1, false, false, false, false));
       waste.add(new CO2FromWaste(2, true, true, true, true));
       waste.add(new CO2FromWaste(4, true, true, false, true));
       waste.add(new CO2FromWaste(6, false, true, false, true));
       
       
       
       System.out.println("|       |        |                                 |          Pounds of CO2           |");
       System.out.println("|       |        |    Household Waste Recycled     |  Total   |            |    Net   |");
       System.out.println("| Index | People | Paper | Plastic | Glass |  Cans | Emission |  Reduction | Emission |");
       
       CO2FromWaste dataRecord;
       for(int index = 0; index < waste.size(); index++)
       {
           dataRecord = waste.get(index);
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteEmission();
        }
           
           
       for(int index = 0; index < waste.size(); index++)
       {
           dataRecord = waste.get(index);
           System.out.printf("%5d %8d %9b %8b %8b" +
               " %8b %9.2f %10.2f %12.2f\n", index,
               dataRecord.getNumPeople(), dataRecord.getRecyclingPaper(), 
               dataRecord.getRecyclingPlastic(), dataRecord.getRecyclingGlass(), 
               dataRecord.getRecyclingCans(), dataRecord.getGrossWasteEmission(),
               dataRecord.getWasteReduction(), dataRecord.getNetWasteEmission());
       }
       
    }
       
}
