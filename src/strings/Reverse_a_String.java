package strings;

public class Reverse_a_String {

	public static void main(String[] args) {
		String input = "Alok Kumar Barman";
		reverse_string_to_character(input);
		reverse_string_to_character_using_StringBuilder(input);
		reverse_string_to_word(input);
		reverse_string_preserve_whitespace(input);
	}
	public static void reverse_string_to_character(String input) {
		char chr[] = input.toCharArray();
		String reverse = "";
		for(int i=chr.length-1; i>=0; i--) {
			reverse = reverse + chr[i];
		}
		System.out.println(reverse);
	}
	public static void reverse_string_to_character_using_StringBuilder(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println(sb.toString());
	}
	public static void reverse_string_to_word(String input) {
		String words[] = input.split(" ");
		String reverse = "";
		for(int i=words.length-1; i>=0; i--) {
			reverse = reverse + words[i] + " ";
		}
		System.out.println(reverse);
	}
	public static void reverse_string_preserve_whitespace(String input) {
		char chr[] = input.toCharArray();
		int start = 0;
		int end = chr.length-1;
		while(end > start) {
			if(chr[start] == ' ') {
				start++;
			}
			else if(chr[end] == ' ') {
				end--;
			}
			else {
				char temp = chr[start];
				chr[start] = chr[end];
				chr[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(chr);
	}
}
