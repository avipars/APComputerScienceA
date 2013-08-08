
/**
 * TextMessageCoverterV2 - This program converts standard writing into "Text speak" for the purpose of 
 * compression. (ie. laugh out loud to LOL, be right back to BRB, etc..) Now, with added Input support!
 *@author Ricky Mutschlechner
 *@version 10/06/2010
 */
import java.util.Scanner;
public class TextMessageConverterV2
{   
    public static void main(String [ ] args)
    {
     
	 
	 Scanner in;
     in = new Scanner(System.in);
	
	//Original Message
	System.out.print("Please Enter a Text Message:");
	String message1 = in.nextLine();
	System.out.println("Original Message: " + message1);
	System.out.println("message length: " + message1.length() + " characters");
	System.out.println();
	//Converts Original Message
         String result = message1.replaceAll("(?:laughing out loud)", "LOL");
         result = result.replaceAll("(?:because)", "cuz");
         result = result.replaceAll("(?:be right back)", "BRB");
         result = result.replaceAll("(?:i don't know)", "404");
         result = result.replaceAll("(?:right)", "rite");
         result = result.replaceAll("(?:know)", "kno");
         result = result.replaceAll("(?:what's up)", "sup");
         result = result.replaceAll("(?:how are you)", "hru");
         result = result.replaceAll("(?:for your information)", "fyi");
	//Revised Message
	System.out.println("New Message:");
	System.out.println(result);
	System.out.println("message length: " + result.length() + " characters");
	
	
	
	
    } // end of main method
} // end of class