package fahrenheittocelsius;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 * 
 * This program converts fahrenheit to
 * celsius using (5/9)(Fahrenheit - 32).
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter degrees in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = (5.0/9)*(fahrenheit - 32);
        
        System.out.println(fahrenheit + " fahrenheit degrees would be " + celsius + " celsius degrees.");
    
    }
    
}
