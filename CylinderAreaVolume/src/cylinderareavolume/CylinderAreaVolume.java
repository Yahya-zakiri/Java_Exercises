package cylinderareavolume;
import java.util.Scanner;
/**
 *
 * @author ahmad-yahya-zakiri
 */
public class CylinderAreaVolume {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius and length of the cylinder: ");
        double raduis = input.nextDouble();
        double length = input.nextDouble();
        
        double area = Math.pow(raduis, 2) * Math.PI;
        double volume = area * length;
        
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    
    }
    
}
