package numbers;

public class Swap_Two_Number {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a: " + a + " ; " + "Value of b: " + b);
		
		int x = 30;
		int y = 40;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Value of x: " + x + " ; " + "Value of y: " + y);
	}

}
