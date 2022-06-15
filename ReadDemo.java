import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

/**
   This program reads data from a file.
*/

public class ReadDemo
{
   public static void main(String[] args) throws IOException
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the filename.
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();

      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      // Read lines from the file until no more are left.
      while (inputFile.hasNext())
      {
         // Read the next name.
         String friendName = inputFile.nextLine();

         // Display the last name read.
         System.out.println(friendName);
      }
      
      System.out.print("Enter the filename: ");
      String filename1 = keyboard.nextLine();

      // Open the file.
      File file1 = new File(filename1);
      Scanner inputFile1 = new Scanner(file1);

      while (inputFile1.hasNext())
      {
         // Read the next name.
         int readNumbers = inputFile1.nextInt();

         // Display the last name read.
         System.out.println(readNumbers);
      }
      
      System.out.print("Enter the filename: ");
      String filename2 = keyboard.nextLine();

      // Open the file.
      File file2 = new File(filename2);
      Scanner inputFile2 = new Scanner(file2);

      while (inputFile2.hasNext())
      {
         // Read the next name.
         char readCharacters = inputFile2.next().charAt(0);

         // Display the last name read.
         System.out.println(readCharacters);
      }


      // Close the file.
      inputFile.close();
      inputFile1.close();
      inputFile2.close();

   }
}
