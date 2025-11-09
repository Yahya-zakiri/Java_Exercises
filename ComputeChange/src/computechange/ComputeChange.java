package computechange;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 * Date: 4/11/2025
 */
public class ComputeChange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of dollors: ");
        double amount = input.nextDouble();
        
        int total_amount = (int)Math.round(amount * 100);
        
        int number_of_dollars = total_amount / 100;
        total_amount %= 100;
        
        int number_of_quarters = total_amount / 25;
        total_amount %= 25;
        
        int number_of_dimes = total_amount / 10;
        total_amount %= 10;
        
        int number_of_nickles = total_amount / 5;
        total_amount %= 5;
        
        System.out.println(amount + " Would be: ");
        System.out.println(number_of_dollars + " dollars");
        System.out.println(number_of_quarters + " quarters");
        System.out.println(number_of_dimes + " dimes");
        System.out.println(number_of_nickles + " nickles");
        System.out.println(total_amount + " pennies");
    }
    
}
