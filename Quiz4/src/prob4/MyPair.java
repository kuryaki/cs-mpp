package prob4;

public class MyPair implements Pair<String, Integer> {
	
	private String key;
	private Integer value;

	public MyPair(String key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String getK() {
		return this.key;
	}

	@Override
	public Integer getV() {
		return this.value;
	}

}
