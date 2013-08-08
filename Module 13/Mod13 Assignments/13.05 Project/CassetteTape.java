
/**
 * Write a description of class CassetteTape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CassetteTape extends MusicMedia
{
    public CassetteTape(String title, String artist, String sku)
    {
        super(title, artist, sku);
    }
    
    public String toString(){
        return "Cassette - " + getTitle() + " (" + getArtist() + ")"; 
    }
}
