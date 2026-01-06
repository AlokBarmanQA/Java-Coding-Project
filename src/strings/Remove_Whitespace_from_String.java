package strings;

public class Remove_Whitespace_from_String {

	public static void main(String[] args) {
		String input = "   alok    kumar     barman      ";
		remove_whitespace_using_repalceAll(input);
		remove_whitespace_regular_approach("   alok    kumar     barman      ");
	}
	
	public static void remove_whitespace_using_repalceAll(String input) {
		String output1 = input.trim();
		String output2 = output1.replaceAll(" +", " ");
		System.out.println(output2);
	}
	
	public static void remove_whitespace_regular_approach(String input) {
		String output = "";
		char chr[] = input.toCharArray();
		for(int i=0; i<chr.length; i++) {
			if(chr[i] != ' ') {
				output = output + chr[i];
			}
		}
		System.out.println(output);
	}
}
