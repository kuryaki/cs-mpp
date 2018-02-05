package prob2;

public class EquilateralTriangle implements Polygon, ClosedCurve {
	
	final private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] getSides() {
		return new double[] { side, side, side };
	}

}
