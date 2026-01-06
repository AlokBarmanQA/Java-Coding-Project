package numbers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Date {

	public static void main(String[] args) {
		print_date();
	}
	
	public static void print_date() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		String date = formatter.format(new Date());
		System.out.println(date);
	}
}
