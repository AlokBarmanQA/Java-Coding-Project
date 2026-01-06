package strings;

public class Palindrome_Check {

	public static void main(String[] args) {
		check_palindrome("Madam");
		check_palindrome("madan");
	}
	
	public static void check_palindrome(String input) {
		String reverse = "";
		String temp = input;
		for(int i=input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		if(reverse.equalsIgnoreCase(temp)) {
			System.out.println(temp + " is Palindrome string");
		}
		else {
			System.out.println(temp + " is NOT Palindrome string");
		}
	}
}
