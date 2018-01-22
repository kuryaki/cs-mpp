package prob2;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("\tcannot quack");
	}

}
