
/**
 * Cipher Class, which Encrypts the message.
 * 
 * @author Ricky Mutschlechner
 * @version 1/7/2011
 */
import java.util.ArrayList;
import java.util.Random;
public class RickyMutschlechnerCipher
{
    private ArrayList<Character> randomChars;
    private ArrayList<Character> alphabet;

    public RickyMutschlechnerCipher(ArrayList<Character> randomChars, ArrayList<Character> alphabet){
        this.randomChars = randomChars;
        this.alphabet = alphabet;
    }
    
    public char getEncryptedChar(char c){
        int index = alphabet.indexOf(c);
        return randomChars.get(index);
    }
    
    
    public String encrypt(String message)
    {
        String encryptedMessage = "";
        char encryptedChar = 0; 
        for(int i = 0; i < message.length(); i++){
            char nextChar = message.charAt(i);
            if(nextChar == (' ')){
             encryptedMessage += ' ';
            }
            else if(nextChar > 'z' || nextChar < 'a'){
               encryptedMessage += nextChar;
           }
            else{
            encryptedChar = getEncryptedChar(nextChar);
            encryptedMessage += encryptedChar;
           }
        }
        return encryptedMessage;
    }
    

    

}
