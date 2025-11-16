package computeangles;
import java.util.Scanner;
/**
 *
 * @author Ahmad Yahya Zakiri
 */
public class ComputeAngles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three point (the order shold be like this: x1 y1 x2 y2 x3 y3): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        
        double A = Math.toDegrees((Math.acos((a * a - b * b - c * c) / (-2 * b * c))));
        double B = Math.toDegrees((Math.acos((b * b - a * a - c * c) / (-2 * a * c))));
        double C = Math.toDegrees((Math.acos((c * c - b * b - a * a) / (-2 * b * a))));
        
        System.out.println("A angle is: " + A);
        System.out.println("B angle is: " + B);
        System.out.println("C angle is: " + C);
    }
    
}
