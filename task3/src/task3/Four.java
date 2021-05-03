package task3;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println("The sum is "+sum);
	}

}
