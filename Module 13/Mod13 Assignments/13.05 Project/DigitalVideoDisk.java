
/**
 * Write a description of class DigitalVideoDisk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitalVideoDisk extends Disk
{
    /**
     * Constructor for objects of class DigitalVideoDisk
     */
    public DigitalVideoDisk(String title, String artist, String sku)
    {
        super(title, artist, sku);
    }

    public String toString(){
        return "DVD - " + getTitle() + " (" + getArtist() + ")";
    }
}
