package calculating_loan;
import java.util.Scanner;

public class Calculating_Loan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of money you want to loan: ");
        double loan_amount = input.nextDouble();
        
        System.out.print("Enter the interest rate of the bnak: ");
        double interest_rate = input.nextDouble()/100;
        
        System.out.print("Enter the number of the years: ");
        double years = input.nextDouble();
        
        double monthly_payment = (loan_amount*interest_rate)/(1-((1)/(Math.pow(1+interest_rate, years * 12))));
        double total_amount = (years*12)*monthly_payment;
        
        System.out.println("The montly payment for this loan would be: " + monthly_payment);
        System.out.println("The total amount of money would be: " + total_amount);
    }
    
}
