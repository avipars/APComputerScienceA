/**
 * Main method for the Catapult class.
 * 
 * @author Ricky Mutschlechner
 * @version 12/8/2010
 */
public class CatapultTester
{
    public static void main(String[] args)
    {
        
        Catapult[][] catapults = new Catapult[7][7];
         int speed;
         
        for(int row = 0; row < catapults.length; row++)
        {
            speed = 20 + 5 * row;
            for(int column = 0; column <catapults.length; column++)
            {
                catapults[row][column] = new Catapult(speed, 25 + 5 * column);
            }
        }
        System.out.println("                      Projectile Distance (feet)                      ");
        System.out.println("MPH   25 Deg   30 Deg   35 Deg   40 Deg   45 Deg   50 Deg   55 Deg    ");
        System.out.println();
        System.out.println("======================================================================");

        for(int row = 0; row < catapults.length; row++)
        {
            System.out.printf( "%2.0f ", catapults[row][0].getVelocity());
            for(int column = 0; column < catapults.length; column++)
            {
                catapults[row][column].calcDistance();
                System.out.printf( "%8.1f ", catapults[row][column].getDistance());
            }
            System.out.printf("\n");
        }
        
        
        
    }
}