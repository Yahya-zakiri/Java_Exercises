package taxcalculator;
import java.util.Scanner;

//ahmad-yahya-zakiri
//Calculating monthly tax based on Afghanistan tax system

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter your monthly income: ");
        double income = input.nextDouble();
        double tax = 0;
        
        // 0% tax rate in range of 0 - 5000 per-month
        if(income <= 5000){
            System.out.println("You are exempt from tax.");
        }
        
        // 2% tax rate in range of 5000 - 12500
        else if(income > 5000 && income <= 12500){
            tax = ((income - 5000) * 2)/ 100;
        }
        
        // 10% tax rate in range of 12500 - 100000
        else if(income > 12500 && income <= 100000){
            tax = (12500 - 5000) * (2.0/100) + (income - 12500) * (10/100.0);
        }
        
        // 20% tax rate in range of above 100000
        else {
            tax =(12500 - 5000) * (2.0/100) + (100000 - 12500) * (10/100.0) + (income - 100000) * (20/ 100.0);
        }

           System.out.println("Based on your income you monthly tax would be: " + tax + ", and your annual tax would be: " + tax * 12);

        }
    
}

