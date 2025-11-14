package lottery_game;

import java.util.Scanner;

/**
 *
 * @author Ahamd Yahya Zakiri
 */
public class Lottery_Game {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        String lottery_number = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        
        System.out.print("Enter your lottery number (Must be two digits): ");
        String guess = input.nextLine();
        
        char lottery_first_digit = lottery_number.charAt(0);
        char lottery_second_digit = lottery_number.charAt(1);
        
        char guess_first_digit = guess.charAt(0);
        char guess_second_digit = guess.charAt(1);
        
        System.out.println("The lottery number is: " + lottery_number);
        
        if (lottery_number.equals(guess)){
            System.out.println("You guessed it righ\nYou won $10000");
        }
        
        else if (guess_first_digit == lottery_first_digit 
                || guess_first_digit == lottery_second_digit 
                || guess_second_digit == lottery_first_digit 
                || guess_second_digit == lottery_second_digit){
            System.out.println("You guessed one of the digits right\nYou won $3000");
        }
        
        else {
            System.out.println("You have guessed none of the digits right\nYou won $0");
        }
    }
    
}
