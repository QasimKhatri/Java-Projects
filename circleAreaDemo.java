
public class circleAreaDemo {

	public static void main(String[] args) 
	{
		// Create a Circle object.
		Circle cr = new Circle();
		
		// Call the object's setRadius method, passing 10.0
		// as an argument.
		cr.setRadius(10.0);
		
		// Display the object's length and width.
		System.out.println("The radius is " +
		                  cr.getRadius());
		System.out.println("The area is " +
		                  cr.getArea
		                  ());
		System.out.println("The volume is " +
		                  cr.getVolume());

	}

}
