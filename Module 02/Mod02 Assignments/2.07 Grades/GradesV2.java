
/**
 * This program is going to average some test scores.
 * 
 * @Ricky Mutschlechner 
 * @V2
 */
public class GradesV2
{

    public static void main(String[] args)
    {
        //local variables
        int totalPoints = 0; //Total Points: for all tests
        int numTests = 1; //counts number of tests
        int testGrade = 0; //individual test grade
        double average = 0.0; //average grade
        
        //Calculate Test Average/Total when n = 1.
        testGrade = 97;
        totalPoints += testGrade;
        average = testGrade / numTests;
        
        System.out.print(" n = " + numTests + "   New Test Grade : " + testGrade + "    Total Points: " + totalPoints + "    Average Score:    " + average);
        System.out.println();
        
        numTests++; //Adds 1 to n.
        
        //Calculate Test Average/Total when  n = 2.
        testGrade = 79;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.println(" n = " + numTests + "   New Test Grade : " + testGrade + "    Total Points: " + totalPoints + "    Average Score:    " + average);
        System.out.println();
        
        numTests++; //Adds 1 to n.
        
        //Calculate Test Average/Total when n = 3.
        testGrade = 83;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.println(" n = " + numTests + "   New Test Grade : " + testGrade + "    Total Points: " + totalPoints + "    Average Score:    " + average);
        System.out.println();
        
        numTests++; //Adds 1 to n.
        
        //Calculate Test Average/Total when n = 4.
        testGrade = 88;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.println(" n = " + numTests + "   New Test Grade :   " + testGrade + "     Total Points: " + totalPoints + "    Average Score: " + average);
        System.out.println();
        
        numTests++; //Adds 1 to n.
        
        //Calculate Test Average/Total when n = 5 (Made up test score, by me.)
        testGrade = 100;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.println(" n = " + numTests + "   New Test Grade : " + testGrade + "     Total Points: " + totalPoints + "    Average Score: " + average);
        System.out.println();   
    }
}

      
        
       
        
    