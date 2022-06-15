
public class Circle {

	private double radius;
	
		public void setRadius(double r)
		{
		radius = r;
		}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
	public double getVolume()
	{
		return 3.0 / 4.0 * 3.14 * radius * radius * radius;
		}
}

