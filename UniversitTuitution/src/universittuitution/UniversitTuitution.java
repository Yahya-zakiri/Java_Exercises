package universittuitution;

public class UniversitTuitution {

    public static void main(String[] args) {
        double tuitution =10000;
        int year_count = 0;
        
        while(tuitution < 20000){
            tuitution = tuitution * 1.07;
            year_count++;
        }
        System.out.println("The tuitution will be doubled in " + year_count + " years.");
        System.out.println("The tuitution will be "+ tuitution + "$ after " + year_count +" years;");
    }
    
}