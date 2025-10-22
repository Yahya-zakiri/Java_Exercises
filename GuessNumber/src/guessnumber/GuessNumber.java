package guessnumber;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int answer = -1;

        while (answer != number) {
            System.out.print("Guess the number: ");
            answer = input.nextInt();

            if (answer > number) {
                System.out.println("It is too high");
            } else {
                System.out.println("It is too low");
            }

        }
        System.out.println("You got it :)");

    }

}
