package tipcalculator;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class TipCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble()/100;
        
        double gratuity = gratuity_rate * subtotal;
        double total = gratuity + subtotal;
        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    
    }
    
}
