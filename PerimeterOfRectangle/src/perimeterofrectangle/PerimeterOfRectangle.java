package perimeterofrectangle;

import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {
        Scanner InPut = new Scanner(System.in);
        
        System.out.print("Enter the length of the recangle: ");
        double length = InPut.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width= InPut.nextDouble();
        
        double perimeter = 2 * (length + width);
        
        System.out.println("The perimeter of the recangle is: " + perimeter);
    }
    
}
