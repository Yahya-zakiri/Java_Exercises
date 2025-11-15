package energycalculator;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class EnergyCalculator {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms: ");
        double water_amount = input.nextDouble();
        
        System.out.print("Enter the initial temprature: ");
        double initial_temprature = input.nextDouble();
        
        System.out.print("Enter the final temprature: ");
        double temprature = input.nextDouble();
        
        double energy = water_amount * (temprature - initial_temprature) * 4184;
        
        System.out.println("The energy needed is: " + energy);
    }
    
}
