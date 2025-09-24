package swapnumber;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        Scanner InPut = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int first_number = InPut.nextInt();
        System.out.print("Enter the second number: ");
        int second_number = InPut.nextInt();
        
        first_number = first_number + second_number;
        second_number = first_number - second_number;
        first_number = first_number - second_number;
        
        System.out.println("The first number is: " + first_number);
        System.out.println("The second number is: " + second_number);
    }
    
}
