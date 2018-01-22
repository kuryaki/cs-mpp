package prob3;

public final class Triangle implements Figure {
	
	private final double base;
	private final double height;

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public Triangle(double height, double base) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return (this.base * this.height) / 2;
	}

}
