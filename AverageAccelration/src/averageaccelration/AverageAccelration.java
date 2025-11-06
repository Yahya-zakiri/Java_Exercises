package averageaccelration;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class AverageAccelration {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the v0, v1 and t to calculate the average acceleration: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        double average_acceleration = (v1 - v0) / t;
        
        System.out.println("The average acceleration is: " + average_acceleration);
    }
    
}
