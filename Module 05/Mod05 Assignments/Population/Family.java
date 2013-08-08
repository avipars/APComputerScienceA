
/**
 * Write a description of class Family here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        String token = "";
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        while (inFile.hasNext())
        {
            token = inFile.next( );
            System.out.println(token);
        }
        inFile.close();
    }
}
         

