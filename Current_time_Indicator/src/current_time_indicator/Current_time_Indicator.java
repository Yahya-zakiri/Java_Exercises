/* This programe is built to show the current time of afghanistan 
in 12 hours format. To create this app I have used */


package current_time_indicator;

public class Current_time_Indicator {

   public static void main(String[] args) {
       
           long current_milseconds = System.currentTimeMillis();
           long total_seconds = current_milseconds / 1000;
           long current_seconds = total_seconds % 60;
           long total_minutes = total_seconds /60;
           long current_minutes = total_minutes % 60;
           long total_hours = total_minutes / 60;
           long current_hours =  total_hours % 24;
           long af_hour = current_hours + 4;
           long af_minutes = current_minutes + 30;
           

           if(af_hour > 24){
               
              af_hour = af_hour % 24;
           }
           
           if(af_minutes > 59){
               
               
               af_minutes = af_minutes % 60;
               af_hour +=1;
           }
           
                      if (current_hours >12){
               current_hours = current_hours%12;
               System.out.println("The current universal time is: " + current_hours + ":" + current_minutes + ":" + current_seconds + "PM");
               //System.out.println("The current Afghanistan time is" + ": " + af_hour + ":" + af_minutes + ":" + current_seconds + "PM");
   }
                      else{
           System.out.println("The current universal time is: " + current_hours + ":" + current_minutes + ":" + current_seconds);
           //System.out.println("The current Afghanistan time is" + ": " + af_hour + ":" + af_minutes + ":" + current_seconds);
                      }
                      
                                            if (af_hour >12){
               af_hour = af_hour%12;
               //System.out.println("The current universal time is: " + current_hours + ":" + current_minutes + ":" + current_seconds + "PM");
               System.out.println("The current Afghanistan time is" + ": " + af_hour + ":" + af_minutes + ":" + current_seconds + "PM");
   }
                      else{
          // System.out.println("The current universal time is: " + current_hours + ":" + current_minutes + ":" + current_seconds);
           System.out.println("The current Afghanistan time is" + ": " + af_hour + ":" + af_minutes + ":" + current_seconds);
                      }
    }
}
