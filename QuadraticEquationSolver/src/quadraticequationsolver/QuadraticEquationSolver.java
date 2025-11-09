package quadraticequationsolver;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class QuadraticEquationSolver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("The general form of a quadratic equation is: (ax^2 + bx + c = 0)");
        System.out.print("Enter a, b and c to solve: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (Math.pow(b, 2) - 4 * a * c);
        double root1 = 0;
        double root2 = 0;
        
        if(discriminant > 0){
        
            root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("This equation has got two roots:");
            System.out.println("The first root is: " + root1);
            System.out.println("The second root is: " + root2);
            
        }
        
        else if (discriminant == 0){
            root1 = root2 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("This equation only have one root and that is: " + root1);
        }
        
        else {
            System.out.println("This equation doesn't have a real root");
        }
    }
    
}
