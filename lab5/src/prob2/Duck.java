package prob2;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	abstract public void display();
	
	public void swim() {
		System.out.println("\tswimming");
	};
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void fly() {
		this.flyBehavior.fly();
	}
	
	public void quack() {
		this.quackBehavior.quack();
	}
	
}
