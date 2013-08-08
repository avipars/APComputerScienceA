
/**
 * Creates an Isosceles Triangle, using the Triangle Class.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IsoscelesRight extends Triangle
{
    public IsoscelesRight(double sides)
    {
        super(sides, sides, (sides * Math.sqrt(2)));
    }
}
