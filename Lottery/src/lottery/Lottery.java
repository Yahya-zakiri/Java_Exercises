
/*This is a lottery programme that generate a two digit number and if the user guess the number right
the prize is 10000 dollors, for someone who guesses the digits but in the wrong order the prize is 3000 dollors,
and for someone guess one of the digits right the prize is 1000 dollors. Someone who can't guess the both or one of
digits wins nothing.
Author: Ahamd Yahya Zakiri
Date: 9/23/2025
*/
                                                                                                                                   
package lottery;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int lucky_number = 10 + (int)(Math.random()*90);
        System.out.println(lucky_number);

        
        System.out.print("Enter a number: ");
        int guess_number = input.nextInt();
        int guess_first_digit = guess_number /10;
        int guess_second_digit = guess_number%10;
        int lucky_first_digit = lucky_number /10;
        int lucky_second_digit =lucky_number % 10;
        
        if(guess_number == lucky_number){
                System.out.println("Congratulations! You guessed the \"Lucky Number\"");
                System.out.println("You won 10000 dollors!");
        }
        
        else if(guess_first_digit == lucky_second_digit && guess_second_digit == lucky_first_digit){
            System.out.println("You have guessed the \"Lucky Number\" but in the wrong order!");
            System.out.println("You won 3000 dollors!");
        }
        
        else if( (guess_first_digit == lucky_second_digit ^ guess_second_digit == lucky_first_digit) || (guess_first_digit == lucky_first_digit ^ guess_second_digit == lucky_second_digit)){
            System.out.println("You have guessed on of the \"Lucky Number\" digits right!");
            System.out.println("You won 1000 dollors!");
        }
        
        else{
            System.out.println("Sorry :( You lost the game.");
            System.out.println("Better luck next time!");
        }
    }
    
}
