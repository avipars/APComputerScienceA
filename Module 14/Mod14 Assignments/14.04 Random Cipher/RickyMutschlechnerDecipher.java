
/**
 * Decipher Class, which Decrypts the class (only in the same instance that is Encrypted!)
 * 
 * @author Ricky Mutschlechner
 * @version 1/7/2011
 */
import java.util.ArrayList;
public class RickyMutschlechnerDecipher
{
    private ArrayList<Character> randomChars;
    private ArrayList<Character> alphabet;
    
    public RickyMutschlechnerDecipher(ArrayList<Character> randomChars, ArrayList<Character> alphabet){
        this.randomChars = randomChars;
        this.alphabet = alphabet;
    }
    
     public char getDecryptedChar(char c){
        int index = randomChars.indexOf(c);    
        return alphabet.get(index);
    }
    
    public String decrypt(String message)
    {
        String decryptedMessage = "";
        char decryptedChar = 0;
        for(int i = 0; i < message.length(); i++){
            char nextChar = message.charAt(i);
            if(nextChar == (' ')){
            decryptedMessage += ' ';
           }
            else if(nextChar > 'z' || nextChar < 'a'){
               decryptedMessage += nextChar;
           }
            else{
            decryptedChar = getDecryptedChar(nextChar);
            decryptedMessage += decryptedChar;
            }
        }
        return decryptedMessage;
    }
}
