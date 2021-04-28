package task2;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("PLease enter from the following options");
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for division");
		System.out.println("4 for Multiplication");
		System.out.println("5 for Average");
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter two numbers");
		int option = sc.nextInt();
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		
		switch(option) {
			case 1:
				int result = first + second;
				if (result < 0) {
					System.out.println("Oops option" + option + " is returning negative number");
					break;
				}
				System.out.printf("The result is %d", result);
				break;
				
			case 2:
				int result1 = first - second;
				if (result1 < 0) {
					System.out.println("Oops option " + option + " is returning negative number");
					break;
				}
				System.out.printf("The result is %d", (first - second));
				break;
				
			case 3:
				double result2 = first/second;
				if (result2 < 0) {
					System.out.println("Oops option " + option + " is returning negative number");
					break;
				}
				System.out.printf("The result is %d", result2);
				break;
				
			case 4:
				int result3 = first*second;
				if (result3 < 0) {
					System.out.println("Oops option " + option + " is returning negative number");
					break;
				}
				System.out.printf("The result is %d", result3);
				break;
				
			case 5:
				System.out.println("Please enter two more numbers");
				int first1 = sc.nextInt();
				int second1 = sc.nextInt();
				int sum_ = first + second + first1 + second1;
				double avg = (sum_ * 1.0)/4;
				if (avg < 0) {
					System.out.println("Oops option " + option + " is returning negative number");
					break;
				}
				System.out.printf("The result is %f", avg);
				break;
			
		}
		

	}
}
