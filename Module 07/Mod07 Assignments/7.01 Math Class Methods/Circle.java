

/**
 * Finds the values of x1, x2, y1, and y2 using the Pythagorean Theorem.
 * 
 * @author Ricky Mutschlechner
 * @version 11/18/2010
 */
public class Circle
{
    public static void main (String [] args)
    {
        
        double radius = 1.0;
        double x = 1.0;
        double y = 1.0;
       
        
        System.out.println("Points on a Circle of Radius " +radius);
        System.out.println("x1     y1              x2       y2");
        System.out.println("---------------------------------------");
        for(int counter = 0; counter < 20; counter++){
            x-= 0.1;
            double solveForY = Math.sqrt((Math.pow(radius, 2) - Math.pow(x, 2))); 
            System.out.printf("%5.2f     %5.2f            %5.2f     %5.2f\n" , x, solveForY, x, -1 * solveForY);
        }

    }
}

