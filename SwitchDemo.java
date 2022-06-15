import java.util.*;    // Needed for Scanner class

/**
   This program demonstrates the switch statement.
*/

public class SwitchDemo
{
   public static void main(String[] args)
 {
   double x = 2.2;
   double y = 2.454;
   double z = 278.3333;
   System.out.printf("%.2f", x);
   System.out.printf(" %.2f ", y);
   System.out.printf(" %.2f ", z);

   Scanner keyboard = new Scanner(System.in);

   System.out.println("\n"+"Enter your numerical month of birth");
   int month = keyboard.nextInt();
   switch(month)
   {
       case 1:
           System.out.println("You have entered January");
           break;
       case 2:
           System.out.println("You have entered February");
           break;
       case 3:
           System.out.println("You have entered March");
           break;
       case 4:
           System.out.println("You have entered April");
           break;
       case 5:
           System.out.println("You have entered May");
           break;
       case 6:
           System.out.println("You have entered June");
           break;
       case 7:
           System.out.println("You have entered July");
           break;
       case 8:
           System.out.println("You have entered August");
           break;
       case 9:
           System.out.println("You have entered September");
           break;
       case 10:
           System.out.println("You have entered October");
           break;
       case 11:
           System.out.println("You have entered November");
           break;
       case 12:
           System.out.println("You have entered December");
           break;
       default:
           System.out.println("That is not a month of the year");
   }

   System.out.println("Type your letter grade");
   String Grade = keyboard.next();
   Grade = Grade.toUpperCase();
   switch(Grade)
   {
       case "A":
       case "B":
       case "C":
       case "D":
       case "F":
           System.out.println("Your letter grade is " + Grade);
           break;
       default:
           System.out.println("That is not a valid letter grade");
   }

   System.out.println("Type a day of the week");
   String Day = keyboard.next();
   Day = Day.toLowerCase();
   switch(Day)
   {
       case "monday":
       case "tuesday":
       case "wednesday":
       case "thursday":
       case "friday":
           System.out.println("This day is a weekday");
           break;
       case "saturday":
       case "sunday":
           System.out.println("This day is a weekend");
           break;
       default:
           System.out.println("This is not a day of the week");


   }
}



public static void main1(String[] args) {
   double x = 2.2;
   double y = 2.454;
   double z = 278.3333;
   System.out.printf("%.2f", x);
   System.out.printf(" %.2f ", y);
   System.out.printf(" %.2f ", z);

   Scanner keyboard = new Scanner(System.in);

   System.out.println("\n"+"Enter your numerical month of birth");
   int month = keyboard.nextInt();
   switch(month){
       case 1:
           System.out.println("You have entered January");
           break;
       case 2:
           System.out.println("You have entered February");
           break;
       case 3:
           System.out.println("You have entered March");
           break;
       case 4:
           System.out.println("You have entered April");
           break;
       case 5:
           System.out.println("You have entered May");
           break;
       case 6:
           System.out.println("You have entered June");
           break;
       case 7:
           System.out.println("You have entered July");
           break;
       case 8:
           System.out.println("You have entered August");
           break;
       case 9:
           System.out.println("You have entered September");
           break;
       case 10:
           System.out.println("You have entered October");
           break;
       case 11:
           System.out.println("You have entered November");
           break;
       case 12:
           System.out.println("You have entered December");
           break;
       default:
           System.out.println("That is not a month of the year");
   }

   System.out.println("Type your letter grade");
   String Grade = keyboard.next();
   Grade = Grade.toUpperCase();
   switch(Grade){
       case "A":
       case "B":
       case "C":
       case "D":
       case "F":
           System.out.println("Your letter grade is " + Grade);
           break;
       default:
           System.out.println("That is not a valid letter grade");
   }

   System.out.println("Type a day of the week");
   String Day = keyboard.next();
   Day = Day.toLowerCase();
   switch(Day){
       case "monday":
       case "tuesday":
       case "wednesday":
       case "thursday":
       case "friday":
           System.out.println("This day is a weekday");
           break;
       case "saturday":
       case "sunday":
           System.out.println("This day is a weekend");
           break;
       default:
           System.out.println("This is not a day of the week");


   }
}
}
