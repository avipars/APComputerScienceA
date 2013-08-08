
/**
 * Forest terrain.
 * 
 * @author Ricky Mutschlechner
 * @version 12/28/2010
 */
public class Forest extends Terrain
{
    private int trees;
    public Forest(int l, int w, int t)
    {
        super(l, w);
        trees = t;
    }
    
    public int getTrees()
    {
        return trees;
    }
}
