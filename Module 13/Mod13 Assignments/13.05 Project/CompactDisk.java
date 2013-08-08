
/**
 * Write a description of class Compactdisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompactDisk extends Disk
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class CompactDisk
     */
    public CompactDisk(String title, String artist, String sku)
    {
        super(title, artist, sku);
    }

    public String toString()
    {
        return "CD - " + getTitle() + " (" + getArtist() + ")";
    }
    
}
