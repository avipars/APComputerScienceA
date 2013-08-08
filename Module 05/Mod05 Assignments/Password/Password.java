
/**
 * Random Secure Password Generator.
 * 
 * @author Ricky Mutschlechner 
 * @version 11/10/2010
 */
import java.util.Scanner;
import java.util.Random;
public class Password
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       Random rand = new Random();
       String password = "";
       char nextChar = '\0';
       
       System.out.println("                  Password Generation Menu                    ");
       System.out.println("**************************************************************");
       System.out.println("*         [1] Lowercase Letters                              *");
       System.out.println("*         [2] Lowercase & Uppercase Letters                  *");
       System.out.println("*         [3] Lowercase, Uppercase, and Numbers              *");
       System.out.println("*         [4] Lowercase, Uppercase, Numbers and Punctuation  *");
       System.out.println("*         [5] Quit                                           *");
       System.out.println("**************************************************************");
       
       System.out.println("Enter Selection (1-5):");
       int selection = in.nextInt();
       
       //Before asking for the length, seeing as if you quit, no length is required.
       if(selection == 5){
       System.out.println("Thanks for using the Password Generator. Good Bye!");
       return;
    }
       System.out.println("Password Length? (1-14):");
       int length = in.nextInt();
       
       //Selections
       if(selection == 1)
       {
            for(int i = 0; i <= length; i++)
            {
                int randNum = rand.nextInt(26);
                nextChar = (char)('a' + randNum);
                password += nextChar;
            }
        }
        
        if(selection == 2)
        {
            for(int i = 0; i <= length; i++)
            {
                int randNum = rand.nextInt(52);
                if(randNum >= 0 && randNum <= 25){
                    nextChar = (char)('a' + randNum);
                }
                
                if(randNum >= 26 && randNum <= 51){
                    nextChar = (char)('A' + randNum - 26);
                }
                    password += nextChar;
                
            }

        }
        
        if(selection == 3)
        {
            for(int i = 0; i <= length; i++)
            {
                int randNum = rand.nextInt(62);
                if(randNum >= 0 && randNum <= 25){
                    nextChar = (char)('a' + randNum);
                }
                
                if(randNum >= 26 && randNum <= 51){
                    nextChar = (char)('A' + randNum - 26);
                }
                
                if(randNum >= 52 && randNum <= 61){
                    nextChar = (char)('0' + randNum - 52);
                }
                password += nextChar;
            }
    }
    
        if(selection == 4)
        {
            for(int i = 0; i <= length; i++)
            {
                int randNum = rand.nextInt(83);
                if(randNum >= 0 && randNum <= 25){
                    nextChar = (char)('a' + randNum);
                }
                
                if(randNum >= 26 && randNum <= 51){
                    nextChar = (char)('A' + randNum - 26);
                }
                
                if(randNum >= 52 && randNum <= 61){
                    nextChar = (char)('0' + randNum - 52);
                }
                
                if(randNum >= 62 && randNum <= 71){
                    nextChar = (char)(':' + randNum - 62);
                }
                
                if(randNum >= 72 && randNum <= 78){
                    nextChar = (char)('[' + randNum - 72);
                }
                    
                if(randNum >= 79 && randNum <= 82){
                    nextChar = (char)('{' + randNum - 79);
                }
                    
                        password += nextChar;
                
                    
    
  }
}

System.out.println("Your new password is: " +password);

System.out.println("Thanks for using the Password Generator. Good Bye!");


}
}