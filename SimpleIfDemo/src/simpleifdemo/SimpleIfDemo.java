package simpleifdemo;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class SimpleIfDemo {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if(number % 5 == 0)
            System.out.println("HiFive");
        if(number%2==0)
            System.out.println("HiEven");
    }
    
}
