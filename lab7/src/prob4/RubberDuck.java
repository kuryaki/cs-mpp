package prob4;

public class RubberDuck extends Duck implements Squeak, CannotFly {

	public RubberDuck() {
		super();
	}
	
	@Override
	public void display() {
		System.out.println("Displaying - RubberDuck");
	}

}
