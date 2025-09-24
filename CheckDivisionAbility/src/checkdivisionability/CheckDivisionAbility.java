package checkdivisionability;
import java.util.Scanner;

public class CheckDivisionAbility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number to check its devisablity: ");
        int number = input.nextInt();
        
        if(number%2==0 && number%3==0){
            System.out.println("This number is divisable by both 2 and 3.");
        }
        
        else if (number%2 == 0 ^ number%3==0){
            System.out.println("This number is divisable by 2 or 3.");
            
            if(number%2==0){
                System.out.println("This number is divisable by 2.");
            }
            else if(number%3==0){
                System.out.println("This number is divisable by 3.");
            }
                
        }
        
        else{
            System.out.println("This is a prime number.");
        }
    }
    
}
