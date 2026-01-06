package strings;

public class Vowel_is_Present {

	public static void main(String[] args) {
		check_vowel("qwert");
		check_vowel("zxcvb");
	}
	
	public static boolean check_vowel(String input) {
		boolean isPresent =  input.toLowerCase().matches(".*[aeiou].*");
		System.out.println(isPresent);
		return isPresent;
	}
}
