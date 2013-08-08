
/**
 * Class that prints the translated message.
 * 
 * @author Ricky Mutschlechner
 * @version 1/2/2011
 */
import java.io.*;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        MorseCode m = new MorseCode("morsecodereference.txt");
        System.out.println(m.getMessage("morsecodemessage.txt"));
    }
}
