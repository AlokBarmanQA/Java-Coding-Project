package strings;

public class Remove_all_specific_occurance {

	public static void main(String[] args) {
		String input = "alok    kumar     barman      ";
		remove_all_a_from_given_string(input);
	}
	 public static void remove_all_a_from_given_string(String input) {
		 String output = "";
		 for(Character ch : input.toLowerCase().toCharArray()) {
			 if(ch != 'a') {
				 output = output + ch;
			 }
		 }
		 System.out.println(output);
	 }
}
