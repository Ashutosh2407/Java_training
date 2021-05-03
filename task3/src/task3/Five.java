package task3;
import java.util.Scanner;
public class Five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a long type number");
		long input = sc.nextLong();
		int sum = 0;
		int count = 0;
		if (input < 0) {
			input *=-1;
		}
		while (input != 0) {
			long num = input % 10;
			input = input /10;
			sum+=num;
			count++;
		}
		System.out.println("The number of digits is "+count);
		System.out.println("The sum is "+sum);
	}

}
