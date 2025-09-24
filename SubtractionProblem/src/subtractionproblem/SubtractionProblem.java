package subtractionproblem;

import java.util.Scanner;

public class SubtractionProblem {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        if(number1 > number2){
            
            int Answer = number1 - number2;
            System.out.print("What is: " + number1 + " - " + number2 + " = ");
            int sAnswer = input.nextInt();
            
            if (sAnswer== Answer){
                System.out.println("Welldone!");
            }
            
            else{
                System.out.println("Wrong!");
                System.out.println("The right answer is: " + Answer);
            }
        }
        
        else{
            System.out.println("Something went wrong!");
            System.out.println("Try agian");
        }  
    }
    
}
