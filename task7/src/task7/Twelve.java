package task7;

import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		System.out.println("Enter the length of the array");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] values = new int[len];
		for(int i=0; i < len; i++) {
			values[i] = sc.nextInt();
		}
		System.out.println("Enter the target sum");
		int target = sc.nextInt();
		for(int i= 0; i < len; i++) {
			int summ = 0;
			for(int j = i; j < len;j++) {
				summ+= values[j];
				if(summ == target) {
					System.out.println("The subarray starts from " +i+ " till "+j);
				}
			}
		}

	}

}
