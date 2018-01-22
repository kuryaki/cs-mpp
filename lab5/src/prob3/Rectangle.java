package prob3;

public final class Rectangle implements Figure {
	
	private final double base;

	private final double height;

	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		return base * height;
	}

}
