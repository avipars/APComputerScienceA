
/**
 * This program creates an invoice for library fines, which displays
 * the Date checked out and respective fine.
 * @author Ricky Mutschlechner
 * @version 10/10/10 (whoa)
 */
import java.util.Scanner;
public class Fines
{
   public static void main(String [ ] args)
  {
      int daysLateValue; //The actual number of days late, parsed from the input.
      double dailyFineValue; //Actual number of the Daily fine, ^
      
      Scanner in;
      in = new Scanner(System.in);
      
      
      System.out.println("Enter name (Last, First) and Social Security Number (###-##-####):");
      String firstName = in.next();
	  String lastName = in.next();
	  String ssn = in.nextLine();
      
      System.out.println();
      
      System.out.println("Enter the title of the book:");
      String bookTitle = in.nextLine();
      
      System.out.println();
      
      System.out.println("Enter the date checked out (mm/dd/yyyy)");
      String checkOutDate = in.nextLine();
      
      System.out.println();
      
      System.out.println("Days Late:");
      String daysLate = in.next();
      daysLateValue = Integer.parseInt(daysLate);
      
      System.out.println();
      
      System.out.println("Daily Fine:");
      String dailyFine = in.next();
      dailyFineValue = Double.parseDouble(dailyFine);
      
      System.out.println("To: "+ lastName + ", " + firstName + ssn);
      System.out.println("============================================");
      System.out.println(bookTitle + " was checked out on " + checkOutDate);
      System.out.println("This book is currently " +daysLateValue+ " days late.");
      System.out.println("Your fine has accumulated to: "+(dailyFineValue * daysLateValue));
      
      
      
    }
}
