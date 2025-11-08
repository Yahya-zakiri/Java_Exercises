package bmicalculation;
import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter you age: ");
        int age = input.nextInt();
        
        if(age >= 16){
        
            System.out.print("Enter you wieght in Kilo Grams: ");
            double weight  = input.nextDouble();
        
            System.out.print("Enter your height in Meter: ");
            double height= input.nextDouble();
            
            //BMI calculating formula
            double bmi = weight /(Math.pow(height, 2));
        
            System.out.println("Your BMI is: " + bmi);
            
            if (bmi < 18.5){
                System.out.println("Based on your BMI you are underweight!");
            }
            
            else if(bmi >= 18.5 && bmi < 25){
                System.out.println("Based on your BMI you are normal!");
            }
            
            else if(bmi>= 25.5 && bmi < 30){
                System.out.println("Based on yout BMI you are overweight!");
            }
            
            else{
                System.out.println("Based on your BMI you are obese!");
            }
        }
        
        else{
            System.out.println("This programme is not able to calculate under age 16!");
        }
    }
    
}

