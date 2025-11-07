package windchilltemprature;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class WindChillTemprature {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temprature in Fahrenheit between -58*F and 41*F: ");
        double outside_temp = input.nextDouble();
        
        System.out.print("Enter the speed of the wind (>= 2) in miles per hour: ");
        double wind_speed = input.nextDouble();
        
        double wind_chill = 35.74 + 0.6215 * outside_temp - 35.75 * Math.pow(wind_speed, 0.16) + 0.4275 * outside_temp * Math.pow(wind_speed, 0.16);
        
        System.out.println("The wind chill is: " + wind_chill);
    }
    
}
