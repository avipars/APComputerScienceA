
/**
 * Methods and Constructor for the Catapult program.
 * 
 * @author Ricky Mutschlechner
 * @version 12/8/2010
 */
public class Catapult
{
    private double velocity, degrees, distance;
    
    /**
     * Default constructor for the Catapult object.
     */
    public Catapult(double v, double deg)
    {
        velocity = v;
        degrees = deg;
    }
    
    /**
     * Gets Velocity.
     */
    public double getVelocity(){
        return velocity;
    }
    
    /**
     * Gets Degrees.
     */
    public double getDegrees(){
        return degrees;
    }
    
    public double getDistance(){
        return distance;
    }
    
    public void calcDistance(){
        distance = (Math.pow(velocity, 2) * Math.sin( 2 * Math.toRadians(degrees)) / 9.8);
    }
    
    
}
