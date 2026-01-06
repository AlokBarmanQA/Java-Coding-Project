package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate_Character_Count {

	public static void main(String[] args) {
		String input = "   alok    kumar     barman      ";
		duplicate_character_count(input);
	}
	
	public static void duplicate_character_count(String input) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(Character ch : input.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Character ch : map.keySet()) {
			if(map.get(ch) > 1) {
				System.out.println(ch + " <==> " + map.get(ch));
			}
		}
	}
}
