package functional.interfaces;

public class Main {

	public static void main(String[] args) {
		Log logger = new Log() {

		    @Override
		    public void log(String text) {
		        System.out.println(text);
		    }
		};
		
		logger.log("Hello World!!");
	}

}
