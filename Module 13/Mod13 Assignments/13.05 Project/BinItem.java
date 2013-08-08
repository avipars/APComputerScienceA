
/**
 * Write a description of class BinItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinItem
{
   private String mySKU;
   private int myQuantity;
   
   public BinItem(String sku, int quantity)
   {
       mySKU = sku;
       myQuantity = quantity;
    }
    
    public String getSKU()
    {
        return mySKU;
    }
    
    public int getQuantity()
    {
        return myQuantity;
    }
    
    public String toString()
    {
        return "SKU " +getSKU() + ": " + getQuantity();
    }
}
