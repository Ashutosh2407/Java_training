package task7;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements of in the array");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int max =Integer.MIN_VALUE;
		int[] values = new int[length];
		for(int i=0; i < length; i++) {
			values[i] = sc.nextInt();
			if (values[i] > max) {
				max = values[i];
			}
		}
		System.out.println("The max values is "+max);

	}

}
