package ordertwocities;
import java.util.Scanner;
/**
 *
 * @author Ahmad Yahya Zakiri
 */
public class OrderTwoCities {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        
        if (city1.compareTo(city2) < 0){
            System.out.println("The cities you entered are: " + city1 + " and " + city2);
        }
        
        else {
            System.out.println("The cities you entered are: " + city2 + " and " + city1);
        }
    }
    
}
