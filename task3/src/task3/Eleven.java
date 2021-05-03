package task3;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		double first = sc.nextDouble();
		System.out.println("Please enter second number");
		double second = sc.nextDouble();
		if (Math.abs(first-second) <= 0.01) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}

}
