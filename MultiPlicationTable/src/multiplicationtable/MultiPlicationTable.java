package multiplicationtable;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class MultiPlicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Till which number you want the tables: ");
        int number = input.nextInt();
        
        for(int i = 0; i <= number; i++){
            for(int j=1; j <= 10; j++){
                System.out.print(j + " x " + i + " = " + i*j + "\n");
            }
            System.out.println("\n\n");
        }
    }
    
}
