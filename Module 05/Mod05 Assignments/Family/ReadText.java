/**
 * Reads text and sorts it.
 * 
 * @author Ricky Mutschlechner 
 * @version 10/24/2010
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadText
{
    public static void main(String[] args) throws IOException
    {
        int girlBoy = 0;
        int girlGirl = 0;
        int boyBoy = 0;
        String token = "";
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        while (inFile.hasNext())
        {
                token = inFile.next();
                if(token.equals("GB"))
                girlBoy ++;
                
                    else if(token.equals("BG"))
                    girlBoy ++;
                    
                    else if(token.equals("GG"))
                    girlGirl ++;
                    
                    else if(token.equals("BB"))
                    boyBoy ++;
        }
        System.out.println("Sample Size: " + (girlBoy + girlGirl + boyBoy));
        System.out.println("One boy and one girl: " +girlBoy);
        System.out.println("Two girls: " +girlGirl);
        System.out.println("Two boys: " +boyBoy);

        inFile.close();
    }
}