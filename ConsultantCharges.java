/**

   This program demonstrates the conditional operator.

*/


import javax.swing.JOptionPane;  // Needed for JOptionPane



public class ConsultantCharges

{

   public static void main(String [] args)

   {

      double hoursworker;     // To hold the hours worked
      double hoursconsultant;
      double hoursupperconsultant,

             charges1, charges2, charges3;   // To hold the charges

      String input1;     // To hold user input
      String input2;
      String input3;



      // Get the number of hours worked.

      input1 = JOptionPane.showInputDialog("How many hours were worked by worker? ");
      input2 = JOptionPane.showInputDialog("How many hours were worked by consultant? ");
      input3 =JOptionPane.showInputDialog("How many hours were worked by Upper level consultant? ");

      hoursworker = Double.parseDouble(input1);
      hoursconsultant = Double.parseDouble(input2);
      hoursupperconsultant = Double.parseDouble(input3);



      // Make sure hours is at least 5.

      // In the following statement, if the value in hours is less

      // than 5, then 5 is stored in hours. Otherwise hours is assigned

      // the value it already has.

      hoursworker = hoursworker < 7 ? 7 : hoursworker;
      hoursconsultant = hoursconsultant < 5 ? 5 : hoursconsultant;
      hoursupperconsultant = hoursupperconsultant < 3 ? 3 : hoursupperconsultant;



      // Calculate and display the charges. The variable hours will not

      // have a value less than 5 because of the previous statement.

      charges1 = 15.0 * hoursworker;
      charges2 = 50.0 * hoursconsultant;
      charges3 = 70.0 * hoursupperconsultant;

      JOptionPane.showMessageDialog(null, "The charges for worker are  $" + charges1);
      JOptionPane.showMessageDialog(null, "The charges for Consultant are  $" + charges2);
      JOptionPane.showMessageDialog(null, "The charges for Super Consultant are $" + charges3);

      

      System.exit(0);

   }

}