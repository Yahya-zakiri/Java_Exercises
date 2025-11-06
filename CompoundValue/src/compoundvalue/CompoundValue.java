package compoundvalue;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class CompoundValue {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double monthly_saving = input.nextDouble();
        
        System.out.print("Enter the annual rate: ");
        double annual_rate = input.nextDouble() / 100;
        double monthly_rate = annual_rate / 12;
        
        double account_value = 0;
        
        account_value = (account_value + monthly_saving) * (1 + monthly_rate);
        account_value = (account_value + monthly_saving) * (1 + monthly_rate);
        account_value = (account_value + monthly_saving) * (1 + monthly_rate);
        account_value = (account_value + monthly_saving) * (1 + monthly_rate);
        account_value = (account_value + monthly_saving) * (1 + monthly_rate);
        account_value = (account_value + monthly_saving) * (1 + monthly_rate);
        
        System.out.println("After the sixth month, the account value would be: " + account_value);
    }
    
}
