package prob2;

public interface Polygon {
	
	double[] getSides();
	
	default double computePerimeter() {
		double perimeter = 0;
		
		for(double side : getSides()) {
			perimeter += side;
		}
		
		return perimeter;
	};

}
