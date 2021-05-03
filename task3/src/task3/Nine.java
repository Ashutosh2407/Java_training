package task3;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j =1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
