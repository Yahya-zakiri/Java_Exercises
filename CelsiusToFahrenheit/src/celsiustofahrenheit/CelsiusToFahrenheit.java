package celsiustofahrenheit;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 * Date: 4/11/2025
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in celsius: ");
        double celsius_degree = input.nextDouble();
        
        double fahrenheit_degree = (9/5.0) * celsius_degree + 32;
        
        System.out.println(celsius_degree + "celsius degrees would be " + fahrenheit_degree + " degrees.");
    
    }
    
}
