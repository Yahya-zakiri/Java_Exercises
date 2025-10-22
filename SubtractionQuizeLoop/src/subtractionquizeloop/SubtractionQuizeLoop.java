package subtractionquizeloop;
import java.util.Scanner;

public class SubtractionQuizeLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NumberOfQuistions = 5;
        int counter = 0;
        int correct_counter = 0;
        String user_answers = " ";
        long start = System.currentTimeMillis();
        
        while(counter < NumberOfQuistions){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);
            
            if(number1 < number2){
                int change = number1;
                number1 = number2;
                number2 = change;
            }
            System.out.print("What is: " + number1 + " - " + number2 + " = ");
            int answer=input.nextInt();
            
            if(number1 -number2 ==answer){
                counter++;
                correct_counter++;
            }
            
            else{
                counter++;

            }
                          user_answers += "\n" + number1 + " - " + number2 + " = " + answer +" "+ ((number1-number2==answer)? "correct":"wrong");

        }
        long end = System.currentTimeMillis();
        long final_time = end - start;
        final_time /= 1000;
        
        System.out.println("Correct answers are: " +correct_counter+"\n"+ "You answers are: \n" + user_answers + "\n" + "Exam duration time: " + final_time + " 4"
                + "seconds");

    }
    
}