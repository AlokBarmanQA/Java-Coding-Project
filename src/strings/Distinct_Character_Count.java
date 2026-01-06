package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Distinct_Character_Count {

	public static void main(String[] args) {
		String input = "   alok    kumar     barman      ";
		distinct_character_count(input);
	}
	public static void distinct_character_count(String input) {
		char chr[] = input.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer> ();
		for(Character ch : chr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Character ch : map.keySet()) {
			System.out.println(ch + " <==> " + map.get(ch));
		}
	}
}
