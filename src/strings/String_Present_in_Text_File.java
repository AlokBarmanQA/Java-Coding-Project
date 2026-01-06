package strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_Present_in_Text_File {

	public static void main(String[] args) {
		String filePath = "../Java-Coding-Project/data/credential.txt";
		check_string_in_file(filePath, "Admin");
		check_string_in_file(filePath, "ajklf");
	}
	
	public static boolean check_string_in_file(String filePath, String value) {	
		try {
			File file = new File(filePath);
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				if(line.contains(value)) {
					System.out.println(value + " <= is present in the text file");
					sc.close();
					return true;
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(value + " <= is NOT present in the text file");
		return false;
	}
}
