package calculating_loan;
import java.util.Scanner;

public class Calculating_Loan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the loan amount: ");
        double loan_amount = input.nextDouble();
        
        System.out.print("Enter the annual rate: ");
        double annual_rate = input.nextDouble()/100;
        
        System.out.print("Enter the number of years you would be holding the loan: ");
        double number_of_years = input.nextDouble();
        
        double montly_rate = annual_rate /12;
        
        double montly_payment = (loan_amount * montly_rate)/(1 - (1/(Math.pow(1 + montly_rate, number_of_years * 12))));
        double total_payment = montly_payment * number_of_years * 12;
        
        System.out.println("The amount of montly payment would be: " + montly_payment);
        System.out.println("The amount of total payment would be: " + total_payment);
    }
    
}

