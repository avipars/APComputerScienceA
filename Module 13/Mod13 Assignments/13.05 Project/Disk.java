
/**
 * Write a description of class Disk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disk extends MusicMedia
{
    public Disk(String title, String artist, String sku){
        super(title, artist, sku);
    }

    public String toString()
    {
        return "Disk - " + getTitle() + " ("+getArtist() + ")";
    }
}
