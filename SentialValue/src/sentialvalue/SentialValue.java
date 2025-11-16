package sentialvalue;
import java.util.Scanner;
/**
 *
 * @author Ahmad Yahya Zakiri
 */
public class SentialValue {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int number = -1;
        int sum = 0;
        
        while (number != 0){
            System.out.print("Enter an integer(the loop ends by entering 0): ");
            number = input.nextInt();
            sum += number;
        }
        
        System.out.println("The sum is: " + sum);
    }
    
}
