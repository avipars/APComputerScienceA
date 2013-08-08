public class test 
{
    public static void main(String[] args)
    {
    double cost = 52.32;
    double amtPaid = 100.00;
    double change = 0.00;
    
    change = amtPaid - cost;
    System.out.println("Your change is: $" + change);
    System.out.println();
    
    int twenties = 0, tens = 0, fives = 0, ones = 0, quarters = 0, nickels = 0, dimes = 0, pennies = 0;
    
    
    
    twenties = (int)(change / 20.00);
    if(twenties != 0){
        change -= (20.00 * twenties);
        System.out.println(twenties + " $20 bill(s)");
    }
 
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    tens = (int)(change / 10.00);
    if (tens != 0)
    {
        change -= (tens)*10.00;
        System.out.println(tens + " $10 bill(s)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    fives = (int)(change / 5.00);
    if (fives != 0 )
    {
        change -= ((double)((fives) * 5.00));
        System.out.println(fives + " $5 bill(s)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    ones = (int)change;
    if (ones != 0)
    {
        change -= ones;
        System.out.println(ones + " $1 bill(s)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    quarters = (int)(change/.25);
    if (quarters != 0 )
    {
        change -= (double)((quarters)*.25);
        System.out.println(quarters + " Quarter(s)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    dimes = (int)(change/.1);
    if ( dimes != 0 )
    {
        change -= dimes*.1;
        System.out.println(dimes + " Dime(s)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    nickels = (int)(change/.05);
    if ( nickels != 0 )
    {
        change -= nickels*.05;
        System.out.println(nickels + " Nickel(s)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
    pennies = (int)(change/.01);
    if ( pennies != 0 )
    {
        System.out.println(pennies + " Penny(ies)");
    }
    System.out.println();
    System.out.println(change);
    System.out.println();
    
  }
}
    

