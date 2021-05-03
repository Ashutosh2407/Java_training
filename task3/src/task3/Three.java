package task3;

import java.util.HashMap;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		HashMap<Integer, Integer> months = new HashMap<Integer, Integer>();
		months.put(1, 31);
		months.put(2,28);
		months.put(3, 31);
		months.put(4, 30);
		months.put(5, 31);
		months.put(6, 30);
		months.put(7, 31);
		months.put(8, 31);
		months.put(9, 30);
		months.put(10, 31);
		months.put(11, 30);
		months.put(12, 31);
		if (months.get(number) == null) {
			System.out.println("Invalid Details");
		}
		else {
			System.out.println(months.get(number));
		}
	}

}
