// This program demonstrates a few of the String methods.
import java.util.Scanner;
import javax.swing.JOptionPane;
public class StringMethod
{
   public static void main(String[] args)
   {
	      
	   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       String message1;
       String message2;
       System.out.println("Enter message");
       message1 = myObj.nextLine();
       String upper = message1.toUpperCase();
       int stringSize1 = message1.length();
       char letter1 = message1.charAt(0);
       System.out.println(upper);
       System.out.println(stringSize1);
       System.out.println(letter1);
       message2 = JOptionPane.showInputDialog("Enter another message ");
       JOptionPane.showMessageDialog(null, message2);
       System.out.println(message2);
       String lower = message2.toLowerCase();
       int n = message2.length();
       int stringSize2 = message2.length();
       char letter2 = message2.charAt(n-1);
       System.out.println(lower);
       System.out.println(stringSize2);
       System.out.println(letter2);
   }
}