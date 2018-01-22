package prob3;

public class Circle {
	private double radius;
	private double area;
	Circle()
	{
		radius = 1.0;
		area = Math.PI;
	}
	Circle(double radius)
	{
		this.radius = radius;
		area = Math.PI * radius * radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return area;
	}
	
	public String toString()
	{
		return "[Circle:Radius=" + radius + " Area=" + area + "]";
		
	}
	

}
