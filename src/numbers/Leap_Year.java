package numbers;

public class Leap_Year {

	public static void main(String[] args) {
		check_leap_year(2000);
		check_leap_year(1900);
	}
	public static void check_leap_year(int year) {
		if(year%4==0 && (year%400==0 || year%100 !=0)) {
			System.out.println(year + " is Leap Year");
		}
		else {
			System.out.println(year + " is not Leap Year");
		}
	}
}
