package sumofdigits;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class SumOfDigits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        int first_digit = number % 10;
        int remain_digits = number / 10;
        int second_digit = remain_digits % 10;
        int third_digit = remain_digits / 10;
        
        int sum_of_digits = first_digit + second_digit + third_digit;
        
        System.out.println("The sum of digits would be: " + sum_of_digits);
    }
    
}
