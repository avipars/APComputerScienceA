
/**
 * Translates Piecewise functions into recursive methods.
 * 
 * @author Ricky Mutschlechner 
 * @version 12/27/2010
 */
public class Recursion
{
    public static void main(String[] args)
    {
        
        System.out.println("#1: The value of f(25) is: " + fOf1(25));
        System.out.println("#2: The value of f(30) is: " + fOf2(25));
        System.out.println("#4: The value of f(500) is: " + fOf4(25));
    }
    
    public static int fOf1(int x)
    {
        //base case
        if(x <= 10)
        return -7;
        //recursive call
        if(x > 10)
        return fOf1(x - 4) + 2;
        //"Error catching"
        else 
        return -1;
    }
    
    public static int fOf2(int x)
    {
        //base case
        if(x <= 25)
        return 20;
        //recursive call
        if(x > 25)
        return fOf2((x/12) + 5) -3;
        //"Error catching"
        else 
        return -1;
    }
    
    public static int fOf4(int x)
    {
        //base case
        if(x > 20)
        return -100;
        //recursive call
        if(x <= 20)
        return fOf4(x*2) - 4;
        //"Error catching"
        else return -1;
    }
}
   