package prob4;

public interface QuackBehavior {
	default void quack() {
		System.out.println("\tquacking");
	};
}
