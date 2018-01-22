package prob3;

public class InheritanceCylinder extends Circle {
	private double height;
	private double volume;
	public InheritanceCylinder() {
		super(1.0);
		height = 1.0;
		volume = getArea() * height;
	}

	public InheritanceCylinder(double radius) {
		super(radius);
		this.height = 1.0;
		volume = getArea() * height;
	}
	public InheritanceCylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
		volume = getArea() * height;
		
	}
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		return volume;
	}

}
