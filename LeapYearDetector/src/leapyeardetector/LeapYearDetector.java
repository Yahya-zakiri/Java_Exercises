package leapyeardetector;
import java.util.Scanner;

/* This programme detects whether an arbitrary year is leap or not;
Author: Ahmad Yahya Zakiri
Date: 9/22/2025
*/
public class LeapYearDetector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year to check it is leap or not: ");
        int year = input.nextInt();
        
        //A year is leap if it is divisable by 4 and 400 and not divisable by 100
        if(year%4==0 && year%100!=0 || year%400 ==0){
            System.out.println(year + " is a leap year.");
    }
        
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
    
}
