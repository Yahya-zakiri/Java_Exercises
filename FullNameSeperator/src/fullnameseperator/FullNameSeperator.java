package fullnameseperator;
import java.util.Scanner;
/**
 *
 * @author Ahamd Yahya Zakiri
 */
public class FullNameSeperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String full_name = input.nextLine();
        
        int k =full_name.indexOf(" ");
        
        String name = full_name.substring(0,k);
        String last_name = full_name.substring(k + 1);
        
        System.out.println("Your first name is: " + name + " and your last name is: " + last_name);    
    
    }
    
}
