package hexdigit2dec;
import java.util.Scanner;
/**
 *
 * @author Ahamd Yahya Zakiri
 */
public class HexDigit2Dec {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter and hex digit: ");
        String hexString = input.nextLine();
        
        if(hexString.length() != 1){
            System.out.println("You must enter only one character!");
            System.exit(1);
        }
        
        char ch = Character.toUpperCase(hexString.charAt(0));
        
        if ('A' <= ch && 'F' >= ch){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }
        
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
    
}
