
/**
 *  Takes in a String, Encrypts it using a random cipher, prints it to a file,
 *  and then decrypts it if necessary.
 *  
 * @author Ricky Mutschlechner 
 * @version 1/7/2011
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class RickyMutschlechnerCipherTester
{
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> cipher = randomListGenerator();
        ArrayList<Character> alphabet = regularAlphabet();
        RickyMutschlechnerCipher c = new RickyMutschlechnerCipher(cipher, alphabet);
        RickyMutschlechnerDecipher d = new RickyMutschlechnerDecipher(cipher, alphabet);
        System.out.println("Enter a String that is to be encrypted.");
        
        String plaintext = in.nextLine();
        
        String cryptedtext = c.encrypt(plaintext.toLowerCase());

        PrintWriter outFile = new PrintWriter (new File("message.txt")); //file printing stuff
        outFile.println(plaintext); //file printing stuff
        outFile.println(cryptedtext); // file printing stuff
        outFile.close(); // file printing end
        
        System.out.println("Your Encrypted String is: " + cryptedtext + 
                ".\n It has been added to a text file named \"message.txt\"\n along with " +
                        " the Plaintext String in the current directory.");
                        
        Thread.sleep(5000);  //JavaDocs are awesome.  
        
        System.out.println("\f Would you like to see your Decrypted String? \"y\" or \"n\".");
        String input = in.nextLine();
        if(input.equalsIgnoreCase("y")){
        System.out.println(d.decrypt(cryptedtext));
       }
        else{
            System.out.println("Good Bye!");
        }
    }
    
    public static ArrayList<Character> randomListGenerator()
    {
        ArrayList<Character> randList = new ArrayList<Character>();
        Random rand = new Random();
        char randAdd;
        for(int i = 0; i < 26; i++)
        {
            do{
            randAdd = (char)(rand.nextInt(26) + 'a');
            }
           while((randList.contains(randAdd)));
           randList.add(randAdd);
       }
        
        return randList;
    }
    
    public static ArrayList<Character> regularAlphabet()
    {
        ArrayList<Character> regularAlphabet = new ArrayList<Character>();
        for(int i = 0; i < 26; i++){
            regularAlphabet.add((char)('a' + i));
        }
        
        return regularAlphabet;
    }
}
