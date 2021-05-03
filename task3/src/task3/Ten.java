package task3;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int row = sc.nextInt();
		int c =1;
		for(int i =0; i < row;i++) {
			for(int blnk =1; blnk <= row - i; blnk++) {
				System.out.print(" ");
			}
			for(int j = 0;j <=i; j++) {
				if (i ==0 || j ==0) {
					c=1;
				}
				else {
					c=c*(i-j+1)/j;
				}
				System.out.printf(" "+c);
			}
			System.out.println();
		}
	}
}
