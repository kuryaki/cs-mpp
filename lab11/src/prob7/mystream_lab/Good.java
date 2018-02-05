package prob7.mystream_lab;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
		
		System.out.println(String.format("Friends with names that start"
				+ " with 'N': "+ good.findStartsWithLetter(Folks.friends, "N")));
		
		System.out.println(String.format("Editors with names that start"
				+ " with 'N'", good.findStartsWithLetter(Folks.editors, "N")));
	}
	
	public List<String> findStartsWithLetter(List<String> list, String letter) {
		return 
		     MyStream.of(list)   //convert list to stream
         	     .filter(name -> name.startsWith(letter)) //returns filtered stream
         	     .map(name -> name.toUpperCase())  //maps each string to upper case string
         	     .asList(); //organizes into a list		
	}
}
