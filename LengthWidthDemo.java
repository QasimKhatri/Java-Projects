public class LengthWidthDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Create a Rectangle object.
	      Rectangles box = new Rectangles();

	      // Call the object's setLength method, passing 10.0
	      // as an argument.
	      box.setLength(10.0);
	      
	      // Call the object's setWidth method, passing 20.0
	      // as an argument.
	      box.setWidth(20.0);
	    
		

	      // Display the object's length and width.
	      System.out.println("The box's length is " +
	                         box.getLength());
	      System.out.println("The box's width is " +
	                         box.getWidth());
	      System.out.println("The box's area is " + box.getArea());
              
              }

}