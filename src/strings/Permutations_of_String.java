package strings;

public class Permutations_of_String {

	public static void main(String[] args) {
		print_parmutations("abc", "");
	}
	
	public static void print_parmutations(String input, String answer) {
		if(input.length()==0) {
			System.out.println(answer);
			return;
		}
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			String ilpart = input.substring(0, i);
			String irpart = input.substring(i+1);
			String ros = ilpart + irpart;
			print_parmutations(ros, answer + ch);
		}
	}
}
