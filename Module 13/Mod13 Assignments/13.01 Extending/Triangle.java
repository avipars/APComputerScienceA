
/**
 * Main Triangle superclass and constructor.
 * 
 * @author Ricky Mutschlechner
 * @version 12/27/2010
 */
public class Triangle
{
    // instance variables
    private double sideA, sideB, sideC;
    
    public Triangle(double sideA, double sideB, double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public double getSideA()
    {
        return sideA;
    }
    
    public double getSideB()
    {
        return sideB;
    }
    
    public double getSideC()
    {
        return sideC;
    }
}
