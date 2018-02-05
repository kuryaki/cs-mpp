package prob4;

public abstract interface CannotFly extends FlyBehavior {

	@Override
	public default void fly() {
		System.out.println("\tcannot fly");
	}
}
