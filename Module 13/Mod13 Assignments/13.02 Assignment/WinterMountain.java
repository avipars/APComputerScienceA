
/**
 * Winter Mountain terrain.
 * 
 * @author Ricky Mutschlechner
 * @version 12/28/2010
 */
public class WinterMountain extends Mountain
{
    private double temperature;
    public WinterMountain(int l, int w, int m, double temp)
    {
        super(l, w, m);
        temperature = temp;
    }
    
    public double getTemp()
    {
        return temperature;
    }
}
