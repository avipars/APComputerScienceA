
/**
 * The CalculationsV4 Class is a modified version of CalculationsV3, V2, and V1.
 * Experimenting with plus signs, learned it on the internet actually, to display the Ints in the statement.
 * 
 * 
 * 
 * @author Ricky Mutschlechner
 * @version 09/28/2010
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1 = 15;
        int iNum2 = 10;
        int iNum3 = 5;
        int iNum4 = 234;
        int iNum5 = 6;
        int iNum6 = 12;
        int iNum7 = 3;
        int iNum8 = 11;
        int iNum9 = 24;
        int iNum10 = 17;
        int iNum11 = 2;
        int iNum12 = 480;
        int iNum13 = 200;
        int iNum14 = 20;
        int iNum15 = 8;
        int iNum16 = -2;
			
       
        // Question No. 1
        System.out.println("Question No. 1");
        System.out.println(iNum1+ " divided by 2.5 times " + iNum16 + " plus " + iNum2 + " / " +iNum3 + " equals " + (iNum1 / 2.5 * iNum16 + iNum2/iNum3));
        System.out.println();
        
        // Question No. 2
        System.out.println("Question No. 2");
        System.out.println(iNum4+ " minus (" + iNum4 + " divided by " + iNum5 + " modulus " +iNum6 + ") plus " + iNum7 + " equals " + (iNum4 - (iNum4 / iNum5 % iNum6) + iNum7));
        System.out.println();
        
        // Question No. 3
        System.out.println("Question No. 3");
        System.out.println("(46.2 divided by " + iNum8 + " ) minus " + iNum7 + " plus " + iNum9 + " modulus ( " + iNum10 + " minus " + iNum11 + " times " + iNum7 + ") equals " + ((46.2 / iNum8) - iNum7 + iNum9 % (iNum10 - iNum11 * iNum7)));
        System.out.println();
        
        // Question No. 4
        System.out.println("Question No. 4");
        System.out.println( iNum12 + " divided by " + iNum2 + " divided by " + iNum6 + " plus " + iNum13 + " times 0.5 minus " + iNum14 + " modulus " + iNum15 + " equals " + (iNum12 / iNum2 / iNum6 + iNum13 * 0.5 - iNum14 % iNum15));
        System.out.println();
    
    } // end of main method
} // end of class

