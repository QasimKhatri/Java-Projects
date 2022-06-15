import javax.swing.JOptionPane;

public class Variable {

public static void main(String[] args) {
// TODO Auto-generated method stubpublic class Variable

  //String firstName;
  //String lastName;
  // double Salary;
  //int streetNum;
 // String streetAddress;
 // String City;
//  String State;
//  int zipCode;
//  char gender;
  //Salary = Salary*1.5;
  
 String firstName = JOptionPane.showInputDialog("Please enter first name: ");
 String lastName = JOptionPane.showInputDialog("Please enter your last name: ");
 double Salary = Double.parseDouble(JOptionPane.showInputDialog("Please enter your Salary: "));
 int streetNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Street number: "));
 String streetAddress = JOptionPane.showInputDialog("Please enter your Street address: ");
 String City = JOptionPane.showInputDialog("Please enter your City: ");
 String State = JOptionPane.showInputDialog("Please enter your State: ");
 int zipCode = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Zip code: "));
 char gender = JOptionPane.showInputDialog("Please enter your Gender: ").charAt(0);
 Salary = Salary*1.5;
 System.out.print("Output 1");
     System.out.print("\n\nMy name is " + firstName + " " + lastName + ".");
     System.out.print(" I live at " + streetNum + " " + streetAddress + " " + City + ", " + State+ " " + zipCode +".");
     System.out.print(" My gender is " + gender + ".");
     System.out.print(" My salary is $" + Salary);
     
     System.out.print("\nOutput 2");
     System.out.print("\n\nName: " + firstName + " " + lastName);
     System.out.print("\nAddress: " + streetNum + " " + streetAddress + "\n\t" + City + " , " + State+ " " + zipCode +".");
     System.out.print("\nGender: " + gender);
     System.out.print("\n" + firstName + " " + lastName + " " + "salary is " + "$" + Salary);  
  }

}