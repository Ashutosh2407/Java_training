package task7;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		int num,og_num,remainder, n =0;
		float result = 0.0f;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(og_num = num; og_num !=0;++n) {
			og_num/= 10;
		}
		for(og_num = num;og_num !=0;og_num/=10) {
			remainder = og_num % 10;
			result += Math.pow(remainder, n);
		}
		if((result) == num) {
			System.out.println("The number is armstrong number");
		}
		else {
			System.out.println("The number is not armstrong number");
		}

	}

}
