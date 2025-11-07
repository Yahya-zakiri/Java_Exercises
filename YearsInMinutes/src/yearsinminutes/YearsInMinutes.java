package yearsinminutes;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class YearsInMinutes {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextInt();
        long total_days = minutes / 1440;
        int years = (int) (total_days / 365);
        int remaining_days =(int) (total_days % 365);
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remaining_days + " days.");
    
    }
    
}
