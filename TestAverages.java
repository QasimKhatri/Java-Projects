package TestScoreReader;

import java.io.*;  // Needed for IOException

/**
   This program uses the TestScoreReader class
   to read test scores from a file and get
   their averages.
*/

public class TestAverages
{
   public static void main(String[] args)
                      throws IOException
   {
      double average;         // Test average
      int studentNumber = 1;  // Control variable
      double total;
      int studentNumber1 = 1;  // Control variable
     
      
      // Create a TestScoreReader object.
      TestScoreReader scoreReader =
                  new TestScoreReader("/Users/qasimkhatri/eclipse-workspace/GradeSystem/Grades.csv");
      TestScoreReader scoreReader1 =
              new TestScoreReader("/Users/qasimkhatri/eclipse-workspace/GradeSystem/Grades.csv");
      
      // Display the averages.
      while (scoreReader.readNextLine())
      {
         // Get the average from the TestScoreReader.
         average = scoreReader.getAverage();
         //sum = scoreReader.getSum();
         // Display the student's average.
         System.out.println("Average for student " +
                            studentNumber + " is " +
                            average);

         // Increment the student number.
         studentNumber++;
      }
      scoreReader.close();
      System.out.println("No more scores.");
      
      while (scoreReader1.readNextLine())
      {
         // Get the sum from the TestScoreReader.
         total = scoreReader1.getSum();
         // Display the student's sum.
         System.out.println("sum for student " +
                            studentNumber1 + " is " +
                            total);

         // Increment the student number.
         studentNumber1++;
      }
      
      // Close the TestScoreReader.
      scoreReader.close();
      System.out.println("No more scores.");
   }
}
