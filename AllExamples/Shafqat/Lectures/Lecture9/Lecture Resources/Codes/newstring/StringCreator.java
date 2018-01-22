package lesson9.lecture.newstring;
import java.util.function.*;
public class StringCreator {
	public static void main(String[] args) {
      Function<char[], String> myFunc = String::new;
	  char[] charArray = 
              {'s','p','e','a','k','i','n','g','c','s'};
	  System.out.println(myFunc.apply(charArray));
    }

}
