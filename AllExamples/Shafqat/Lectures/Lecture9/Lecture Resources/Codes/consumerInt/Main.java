package lesson9.lecture.consumerInt;
import java.util.function.Supplier;
public class Main {

  public static void main(String[] args) {
    Supplier<String> i  = ()-> "This is string";
    
    System.out.println(i.get());

  }
}
 
