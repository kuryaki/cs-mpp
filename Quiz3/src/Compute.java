
public interface Compute {
	
	static int add(int first, int second) {
		return first + second;
	};

	default int operation(int first, int second) {
		return first - second;
	};

}
