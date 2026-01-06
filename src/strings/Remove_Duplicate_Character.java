package strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate_Character {

	public static void main(String[] args) {
		String input = "alok    kumar     barman      ";
		remove_duplicate_character_using_LinkedHashSet(input);
		remove_duplicate_character_using_ArrayList(input);
	}
	public static void remove_duplicate_character_using_LinkedHashSet(String input) {
		Set<Character> set = new LinkedHashSet<>();
		for(Character chr : input.toCharArray()) {
			set.add(chr);
		}
		System.out.println(set);
		String output = "";
		for(Character ch : set) {
			output = output + ch;
		}
		System.out.println(output);
	}
	public static void remove_duplicate_character_using_ArrayList(String input) {
		List<Character> list = new ArrayList<>();
		String output = "";
		for(Character chr : input.toCharArray()) {
			if(!list.contains(chr)) {
				list.add(chr);
				output = output + chr;
			}
		}
		System.out.println(list);
		System.out.println(output);
	}
}
