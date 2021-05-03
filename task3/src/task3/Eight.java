package task3;
import java.util.Scanner;


public class Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int year = sc.nextInt();
		if(year %4 == 0 ) {
			System.out.println("It's a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}

	}

}
