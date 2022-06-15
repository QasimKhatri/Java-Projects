public class Clock {

public static void main(String[] args) {
// TODO Auto-generated method stub
/**
* this program uses nested loops to stimulate a clock
*/


 
     // Simulate the clock.
     int count = 0;
     for (int hours = 1; hours <= 24; hours++)
     {
         for (int minutes = 0; minutes <= 59; minutes++)
         {
            for ( int seconds = 0; seconds <= 59; seconds++)
       
            {
            count ++;
            if(hours==07 && minutes ==30 && seconds==00)
            System.out.printf("Breakfast Time\n", hours , minutes , seconds);
            if(hours==12 && minutes==00 && seconds==00)
            System.out.printf("Midday\n" , hours , minutes , seconds);
            if (hours ==01 && minutes ==00 && seconds == 00)
            System.out.printf("Lunch Time\n", hours , minutes , seconds);
            if(hours==05 && minutes==00 && seconds==06)
            System.out.printf("Dinner Time\n" , hours , minutes , seconds );
            if(hours==12 && minutes==00 && seconds==00)
            System.out.printf("Midnight\n" , hours , minutes , seconds);     
        
       }
    }
  }
     System.out.println("The nested loop ran " + count + " times!");
         }
 }