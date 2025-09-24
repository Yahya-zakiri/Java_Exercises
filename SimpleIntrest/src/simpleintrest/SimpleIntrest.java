package simpleintrest;

import java.util.Scanner;

public class SimpleIntrest {

    public static void main(String[] args) {
        
        Scanner InPut = new Scanner(System.in);
        
        System.out.print("How much money have you put in the bank: ");
        double principle = InPut.nextDouble();
        
        System.out.print("What is the intrest rate of the bank: ");
        double rate = InPut.nextDouble();
        
        System.out.print("How many years would you be holding your many in the bank: ");
        int time = InPut.nextInt();
        
        double simple_interest = (principle * time * rate) / 100;
        
        System.out.println("Based your information your interest would be: " + simple_interest);
        
    }
    
}
