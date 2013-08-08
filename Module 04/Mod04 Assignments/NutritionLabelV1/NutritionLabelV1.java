
/**
 * The purpose of this program is to tell you whether your meals go above the Recommended Daily allowances or not.
 * 
 * ©FLVS 2007
 * @author Ricky Mutschlechner
 * @version 10/11/10
 */
import java.util.Scanner;
public class NutritionLabelV1
{
    public static void main(String[] args)
    {
        String foodItem;                            //food item
        
        int dailyTotalCalories = 2000;              //max daily calories
        int dailyTotalGramsFat = 65;           //fat DRV    
        int dailyTotalCarbs = 300;             //carbohydrates DRV       
        int dailyTotalFiber = 25;                   //fiber DRV
        int dailyTotalProtein = 50;                 //protein DRV
  
        //object to use the keyboard input methods
        Scanner in;
        in = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();
        
        //serving size
        System.out.print("How many servings will you eat? ");
        int servingSize = in.nextInt();
        
        //calories
        System.out.print("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / dailyTotalCalories;
        boolean isTotalCalories = totalCalories < dailyTotalCalories;
        
        //fat
        System.out.print("Enter grams of Total Fat per Serving: ");
        int totalGramsFat = in.nextInt();
        totalGramsFat = totalGramsFat * servingSize;
        int percentTotalGramsFat = totalGramsFat * 100 / dailyTotalCalories;
        boolean isTotalGramsFat = totalGramsFat < dailyTotalGramsFat;
        
        
        //carbs
        System.out.print("Enter grams Carbohydrate per serving: ");
        int totalCarbs = in.nextInt();
        totalCarbs = totalCarbs * servingSize;
        int percentTotalCarbs = totalCarbs * 100 / dailyTotalCarbs;
        boolean isTotalCarbs = totalCarbs < dailyTotalCarbs;
        
        //fiber
        System.out.print("Enter grams Fiber per serving: ");
        int totalFiber = in.nextInt();
        totalFiber = totalFiber * servingSize;
        int percentTotalFiber = totalFiber * 100 / dailyTotalFiber;
        boolean isTotalFiber = totalFiber < dailyTotalFiber;
        
        //protein
        System.out.print("Enter grams Protein per serving: ");
        int totalProtein = in.nextInt();
        totalProtein = totalProtein * servingSize;
        int percentTotalProtein = totalProtein * 100 / dailyTotalProtein;
        boolean isTotalProtein = totalProtein < dailyTotalProtein;
        
        //output
        
        
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        

        
        System.out.println();
        System.out.println("Component           Total          Percent          Less than Daily Value ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Calories           " + totalCalories + "             " + percentTotalCalories + "          " + isTotalCalories);
        System.out.println("Fat                " + totalGramsFat + "                " + percentTotalGramsFat + "          " + isTotalGramsFat);
        System.out.println("Carboydrate        " + totalCarbs + "              " + percentTotalCarbs + "          " + isTotalCarbs);
        System.out.println("Dietary Fiber      " + totalFiber + "                " + percentTotalFiber + "          " + isTotalFiber);
        System.out.println("Protein            " + totalProtein + "                " + percentTotalProtein + "       " + isTotalProtein);
       
        
        
    }//end of main method    
}//end of class
