package sumofn;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        Scanner InPut = new Scanner(System.in);
        
        int number = InPut.nextInt();
        int total =0;
        for (int i = number; i>0; i--){
            total = total + i;
            
        }
        
        System.out.println(total);
    }
    
    
}
