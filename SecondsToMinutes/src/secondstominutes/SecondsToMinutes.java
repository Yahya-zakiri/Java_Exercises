package secondstominutes;
import java.util.Scanner;

/**
 *
 * @author ahmad-yahya-zakiri
 * This program obtains minutes and remaining
 * seconds from an amount of time in seconds;
 */
public class SecondsToMinutes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of time in seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        int remain_seconds = seconds % 60;
        
        System.out.println(seconds + " second(s) would be " + minutes + " minute(s) and " + remain_seconds + " second(s).");
    
    }
    
}
