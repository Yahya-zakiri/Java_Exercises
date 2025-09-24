package circlearea;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
                Scanner InPut = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = InPut.nextDouble();
        final double pi = 3.14;
        double area = radius * radius * pi;
        
        System.out.println("The area of the circle is: " + area);
        
    }
    
}
