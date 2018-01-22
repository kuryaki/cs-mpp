package probC;

public final class Paycheck {
	
	private final double grossPay = 0;
	private final double fica = 1 - 0.23;
	private final double state = 1 - 0.05;
	private final double local = 1 - 0.01;
	private final double medicare = 1 - 0.03;
	private final double socialSecurity = 1 - 0.075;
	
	public String print() {
		return "";
	}
	
	public double getNetPay(double compensation) {
		return (grossPay + compensation) * fica * state * local * medicare * socialSecurity ;
	}
	
}
