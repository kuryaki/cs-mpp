package lesson8.lecture.functionalprogramming;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class LackReferentialTransparency {
	private HashMap<Character, Integer> allLetterCount = new HashMap<>();
	private List<HashMap<Character,Integer>> l = new ArrayList<HashMap<Character,Integer>>();
	
	/* stateful */
	public void recordWord(String word) {
		char[] chars = word.toCharArray();
		HashMap<Character, Integer> temp = new HashMap<>();
		for(char c: chars) {
			recordLetter(c);
			updateMap(temp, c);
		}
		l.add(temp);
	}
	
	/* Lacks referential transparency -- calling recordLetter('a')
	 * twice yields two distinct outputs.
	 * 
	 */
	// This method updates the allLetterCount map, and returns
	// the current value in the map that is matched with the char c
	private int recordLetter(char c) {
		updateMap(allLetterCount, c);
		return allLetterCount.get(c);
	}
	
	private void updateMap(HashMap<Character,Integer> map, Character c) {
		if(map.containsKey(c)) {
			int val = map.get(c);
			map.put(c,  val+1);
		} else {
			map.put(c, 1);
		}
	}
	
	public static void main(String[] args) {
		//shows how recordLetter lacks referential transparency
		LackReferentialTransparency lrt = new LackReferentialTransparency();
		System.out.printf("first call: %s", lrt.recordLetter('a'));
		System.out.printf("\nsecond call: %s", lrt.recordLetter('a'));
	}
	
	
	
}
