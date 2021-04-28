package task2;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter a floating point number");
		float input = sc.nextFloat();
		if (input == 0) {
			System.out.println("Zero");
		}
		else if(input > 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		if(Math.abs(input) < 1) {
			System.out.println("small");
		}
		else if((Math.abs(input) > 1000000)) {
			System.out.println("large");
		}

	}

}
