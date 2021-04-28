package task1;

import java.util.Scanner;

public class ValueGivenByUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer value");
		int a = sc.nextInt();
		System.out.println("Please enter float value");
		float b = sc.nextFloat();
		System.out.println("Please enter short value");
		short c = sc.nextShort();
		System.out.println("Please enter double value");
		double d = sc.nextDouble();
		System.out.println("Please enter boolean value");
		boolean e = sc.nextBoolean();
		System.out.println("Please enter long value");
		long f = sc.nextLong();
		System.out.println("Please enter character value");
		char g = sc.next().charAt(0);
		System.out.println("Please enter byte value");
		byte h = sc.nextByte();

	}

}
