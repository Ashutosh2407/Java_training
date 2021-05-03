package task3;
import java.util.Scanner;


public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		while (count<10) {
			System.out.println("Please enter a number");
			int input = sc.nextInt();
			sum+=input;
			count++;
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+(sum/count));

	}

}
