import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

/**
   This program writes data to a file. It makes sure the
   specified file does not exist before opening it.
*/

public class WriteDemo2
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // File name
      String friendName;    // Friend's name
      int numFriends;       // Number of friends
      String filename1;
      int numbers;
      int readNumbers;
      String filename2;
      int characters;
      char[] readCharacters;
      

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();
      
//      System.out.print("How many numbers would you like to put in the file? ");
//      numbers = keyboard.nextInt();

      // Consume the remaining newline character.
      keyboard.nextLine();
      
      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
      // Make sure the file does not exist.
      File file = new File(filename);
      if (file.exists())
      {
         System.out.println("The file " + filename +
                            " already exists.");
         System.exit(0);
      }

      // Open the file.
      PrintWriter outputFile = new PrintWriter(file);

      // Get data and write it to the file.
      for (int i = 1; i <= numFriends; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter the name of friend " +
                          "number " + i + ": ");
         friendName = keyboard.nextLine();

         // Write the name to the file.
         outputFile.println(friendName);
      }
      
      outputFile.close();
      System.out.println("Data written to the file.");
	  
      Scanner keyboard1 = new Scanner(System.in);
	  
      System.out.print("How many numbers would you like to put in the file? ");
      numbers = keyboard1.nextInt();
      keyboard1.nextLine();

      System.out.print("Enter the filename: ");
      filename1 = keyboard1.nextLine();
      
      // Make sure the file does not exist.
      File file1 = new File(filename1);
      if (file1.exists())
      {
         System.out.println("The file " + filename1 +
                            " already exists.");
         System.exit(0);
      }
      PrintWriter outputFile1 = new PrintWriter(file1);
     
//      System.out.print("How many numbers would you like to put in the file? ");
//      numbers = keyboard.nextInt();
      
      for (int i = 1; i <= numbers; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter " +
                          "number " + i + ": ");
         readNumbers = keyboard1.nextInt();

         // Write the name to the file.
         outputFile1.println(readNumbers);
      }

      // Close the file.
      outputFile1.close();
      System.out.println("Data written to the file.");
      
      Scanner keyboard2 = new Scanner(System.in);
	  
      System.out.print("How many charactes would you like to put in the file? ");
      characters = keyboard2.nextInt();
      keyboard2.nextLine();

      System.out.print("Enter the filename: ");
      filename2 = keyboard2.nextLine();
      
      // Make sure the file does not exist.
      File file2 = new File(filename2);
      if (file2.exists())
      {
         System.out.println("The file " + filename2 +
                            " already exists.");
         System.exit(0);
      }
      PrintWriter outputFile2 = new PrintWriter(file2);
          
//      System.out.print("How many numbers would you like to put in the file? ");
//      numbers = keyboard.nextInt();
      
      for (int i = 1; i <= characters; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter " +
                          "character " + i + ": ");
         readCharacters = keyboard2.next().toCharArray();

         // Write the name to the file.
         outputFile2.println(readCharacters);
      }

      // Close the file.
      outputFile2.close();
      System.out.println("Data written to the file.");

   }
}


