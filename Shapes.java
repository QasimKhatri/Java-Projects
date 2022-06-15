import javax.swing.JOptionPane;
public class Shapes {
public static void main(String[] args)
{
int AorV, Areachosen, Volumechosen;
double height, width, length, radius, base, base1, base2;
String option;
String input;
String input1;     // To hold user input
String input2;
  String input3;
  String input4;
  double area;
  double volume;
  int option1;
  int option2;

// Create option window for area and volume
  input1 = JOptionPane.showInputDialog("1 - Area\n"
                             + "2 - Volume\n"
                             + "Enter Your choose");

option1 = (int) Double.parseDouble(input1);
//option2 = (int) Double.parseDouble(input1);
if(input1.equals("1")) {
// Within area window, create options for shapes
input = JOptionPane.showInputDialog("1 - Triangle Area\n"
                                             + "2 - Parallelogram Area\n"
                                             + "3 - Rectangle Area\n"
                                             + "4 - Trapezoid Area\n"
                                             + "5 - Circle Area\n"
                                             + "Enter Your Figure number");

//Make switch statement for the chosen shapes and pertaining area calculation with the result.
// switch (option1)
// {
// case 1:
if(input.equals("1")) {
//JOptionPane.showMessageDialog(null,"1. Triangle Area " );
  input2 =JOptionPane.showInputDialog("Enter the base of the triangle ");
  input3 = JOptionPane.showInputDialog("Enter the height of the triangle ");
  base = Double.parseDouble(input2);
  height = Double.parseDouble(input3);
  area = (base*height)/2;
  JOptionPane.showMessageDialog(null, "The area of triangle with base " + base + " and height " + height + " = " + area);//area for triangle

//{
//break;
//}
}

//case 2:
if(input.equals("2")) {
  input2 =JOptionPane.showInputDialog("Enter the Base of the parellogram ");
  input3 = JOptionPane.showInputDialog("Enter the height of the parellogram ");
  base1 = Double.parseDouble(input2);
  height = Double.parseDouble(input3);
  area = (base1*height);
  JOptionPane.showMessageDialog(null, "The area of parellelogram with base " + base1 + " and height " + height + " = " + area);//area for parallelogram

// {
// break;
// }
}

//case 3:
if(input.equals("3")) {
	input2 = JOptionPane.showInputDialog("Enter the width of the Rectangle ");
	input3 = JOptionPane.showInputDialog("Enter the height of the Rectangle ");
	length = Double.parseDouble(input2);
	width = Double.parseDouble(input3);
	area = (length*width);
	JOptionPane.showMessageDialog(null, "The area of Rectangle with length " + length + " and width " + width + " = " + area);//area for rectangle

//{
//break;
//}
}

//case 4:
if(input.equals("4")) {
  input2 =JOptionPane.showInputDialog("Enter the base 1 of the Trapezoid ");
  input3 = JOptionPane.showInputDialog("Enter the base 2 of the Trapezoid ");
  input4 = JOptionPane.showInputDialog("Enter the height of the Trapezoid ");
  base1 = Double.parseDouble(input2);
  base2 = Double.parseDouble(input3);
  height = Double.parseDouble(input4);
  area = 0.5 * (base1 + base2) * height;
  JOptionPane.showMessageDialog(null, "The area of trapezoid with base 1 " + base1 + " base 2 " + base2 + " and height " + height + " = " + area);//area for trapezoid

//{
//break;
//}
}

// case 5: //area for circle
if(input.equals("5")) {
  input2 =JOptionPane.showInputDialog("Enter the radius of the  circle ");
  radius = Double.parseDouble(input2);
  area = Math.PI * (radius * radius);
  JOptionPane.showMessageDialog(null, "The area of circle with radius " + radius + " = " + area);//area for circle

}
//break;
// }
// }
}
/////////////////////
// Create options for volume of shapes
//}
//option2 = (int) Double.parseDouble(input1);

else if(input1.equals("2"))
{
	
//Make switch statement for the chosen shapes and pertaining volume calculation with the result.
input = JOptionPane.showInputDialog("1 - Cone Volume\n"
                                             + "2 - Cylinder Volume\n"
                                             + "3 - Rectangular Prism\n"
                                             + "4 - Trapezoid Prism\n"
                                             + "5 - Sphere Volume\n"
                                             + "Enter Your Figure number");

// switch (option1)
//{

// case 1:
if(input.equals("1")) {
  input2 = JOptionPane.showInputDialog("Enter the radius of the cone ");
  input3 = JOptionPane.showInputDialog("Enter the height of the cone ");
  radius = Double.parseDouble(input2);
  height = Double.parseDouble(input3);
  volume = Math.PI *(radius*radius)*height/3;
  JOptionPane.showMessageDialog(null, "The volume of cone with radius " + radius + " and height " + height + " = " + volume);// volume for cone

}
// {
// break;
// }

// case 2:
if(input.equals("2")) {
  input2 = JOptionPane.showInputDialog("Enter the radius of the Cylinder ");
  input3 = JOptionPane.showInputDialog("Enter the height of the Cylinder ");
  radius = Double.parseDouble(input2);
  height = Double.parseDouble(input3);
  volume = Math.PI *(radius*radius)*height;
  JOptionPane.showMessageDialog(null, "The volume of cylinder with radius " + radius + " and height " + height + " = " + volume);// volume for cylinder
}

// break;
//}
//}

// case 3:
if(input.equals("3")) {
  input2 =JOptionPane.showInputDialog("Enter the length of the rectangular prism ");
  input3 = JOptionPane.showInputDialog("Enter the width of the rectangular prism ");
  input4 = JOptionPane.showInputDialog("Enter the height of the rectangular prism ");
  length = Double.parseDouble(input2);
  width = Double.parseDouble(input3);
  height = Double.parseDouble(input4);
  volume = length * width* height;
  JOptionPane.showMessageDialog(null, "The volume of rectangular prism with length " + length + ", width " + width +
		  " and height " + height + " = " + volume);//volume for rectangular prism

}
//break;
//}
//}

//case 4:
if(input.equals("4")){
  input2 =JOptionPane.showInputDialog("Enter the base 1 of the trapezoid prism ");
  input3 = JOptionPane.showInputDialog("Enter the base 2 of the trapezoid prism ");
  input4 = JOptionPane.showInputDialog("Enter the height of the trapezoid prism ");
  base1 = Double.parseDouble(input2);
  base2 = Double.parseDouble(input3);
  height = Double.parseDouble(input4);
  base= base1 + base2;
  volume = (base * height)/2;
  JOptionPane.showMessageDialog(null, "The volume of trapezoid prism with base 1 " + base1 + ", base 2 " + base2 +
		  " and height " + height + " = " + volume);//volume for trapezoid prism

}
//break;
//}
//}
// }

// case 5:
if(input.equals("5")) {
  input2 =JOptionPane.showInputDialog("Enter the radius of the sphere ");
  radius = Double.parseDouble(input2);
  volume = (4.0/3.0)*Math.PI*(radius*radius*radius);
  JOptionPane.showMessageDialog(null, "The volume of sphere with radius " + radius + " = " + volume);// volume for sphere

}
// break;
// }
// }
// }
////////////////////

// Invalid message for irrelevant input.

}

else {
  JOptionPane.showMessageDialog(null, "Invalid operation...Exiting\n");
   return;
}
}
}
