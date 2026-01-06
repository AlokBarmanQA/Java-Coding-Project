package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeated_Character {

	public static void main(String[] args) {
		String input = "   alok    kumar     barman      ";
		first_non_repeated_character(input);
	}
	
	public static void first_non_repeated_character(String input) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(Character chr : input.toCharArray()) {
			if(map.containsKey(chr)) {
				map.put(chr, map.get(chr) + 1);
			}
			else {
				map.put(chr, 1);
			}
		}
		for(Character ch : map.keySet()) {
			if(map.get(ch) == 1) {
				System.out.println("First non-repeated character: " + ch);
				break;
			}
		}
	}
}
