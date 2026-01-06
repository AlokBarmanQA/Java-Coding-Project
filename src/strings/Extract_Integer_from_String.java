package strings;

public class Extract_Integer_from_String {

	public static void main(String[] args) {
		String input = "   Alok        373712345678901ank            233456677ert   ionn    ";
		extract_number_using_regex(input);
		extract_number(input);
	}
	public static void extract_number_using_regex(String input) {
		String output = input.replaceAll("[^0-9]", "");
		System.out.println(output);
	}
	public static void extract_number(String input) {
		input = input.replaceAll("[^\\d]", "");
		System.out.println(input);
	}
}
