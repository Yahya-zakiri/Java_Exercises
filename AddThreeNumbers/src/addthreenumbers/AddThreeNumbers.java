package addthreenumbers;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class AddThreeNumbers {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        
        int sum = number1 + number2 + number3;
        
        System.out.print("What is: " + number1 + " + " + number2 + " + " + number3 + " = ");
        int answer = input.nextInt();
        
        if (answer == sum ){
            System.out.println("You are right!");
        }
        
        else {
            System.out.println("You are wrong!");
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + sum + " not " + answer);
        }
    }
    
}
