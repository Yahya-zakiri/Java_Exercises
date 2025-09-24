package evenodd;

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class EvenOdd {

 
    public static void main(String[] args) {
        
       Scanner InPut = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = InPut.nextInt();
        int left = number % 2;
        
        if (left == 0){
            System.out.println("This is an even number!");
        }
        
        else{
            System.out.println("This is an odd number!");
        }
        
        }
        
        scanner.close();
    }
    
    
}


