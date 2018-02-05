import java.util.function.Consumer;
import java.util.function.Function;

public class MyNumber {

	private int first;
	private int second;
	Compute compute;
	
	// Getters and Setters
	
	public void setFirst(int first) {
		this.first = first;
	}

	public int getFirst() {
		return this.first;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}

	public int getSecond() {
		return this.second;
	}
	
	//Operations

	public int sum() {
		return Compute.add(this.first, this.second);
	}

	public int substract() {
		Compute myCompute = new Compute() {};
		return myCompute.operation(this.first, this.second);
	}

	public int multiply() {
		compute = new Multiply();
		return compute.operation(this.first, this.second);
	}

	public int divide() {
		compute = new Divide();
		return compute.operation(this.first, this.second);
	}

}
