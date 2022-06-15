import java.util.Scanner;



/**

   This program displays the number of letters,

   digits, and whitespace characters in a string.

*/



public class StringAnalyzer

{

   public static void main(String [] args)

   {

      String input;        // To hold input

      char[] array;        // Array for input

      int letters = 0;     // Number of letters

      int digits = 0;      // Number of digits

      int whitespaces = 0; // Number of whitespaces

      

      // Create a Scanner object for keyboard input.

      Scanner keyboard = new Scanner(System.in);

      // Prompt the user to enter a line of input.

      System.out.print("Enter a string: ");

      input = keyboard.nextLine();
      String strArray[] = input.split(" ");
      
      //System.out.println("String : " + input);
      System.out.print("String array : [ ");

      // Iterating over the string
      for (int i = 0; i < strArray.length; i++) {
          // Printing the elements of String array
          System.out.print(strArray[i] + ", ");
      }
      
      System.out.println("]");
      System.out.println(input.toUpperCase());
      System.out.println(input.replaceAll("\\s+", "-"));
      System.out.println(input);
      System.out.println("Number of elements present in given array: " + strArray.length);
      // Convert the string to a char array.

      array = input.toCharArray();



      // Analyze the characters.

      for (int i = 0; i < array.length; i++)

      {

         if (Character.isLetter(array[i]))

            letters++;

         else if (Character.isDigit(array[i]))

            digits++;

         else if (Character.isWhitespace(array[i]))

            whitespaces++;

      }



      // Display the results.

      System.out.println("That string contains " +

                         letters + " letters, " +

                         digits + " digits, and " +

                         whitespaces + 

                         " whitespace characters.");

   }

}

   