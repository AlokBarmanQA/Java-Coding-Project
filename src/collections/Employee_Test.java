package collections;

import java.util.Arrays;

public class Employee_Test {

	public static void main(String[] args) {

		Employee[] employees = {
				new Employee(14, "Alok", 90000),
				new Employee(13, "Nilaav", 50000),
				new Employee(10, "Argha", 80000),
				new Employee(12, "Goutam", 40000),
				new Employee(11, "Ananya", 70000)
		};
		System.out.println("Before sorting: " + Arrays.toString(employees));
		
		Arrays.sort(employees);
		
		System.out.println("After sorting: " + Arrays.toString(employees));
	}

}
