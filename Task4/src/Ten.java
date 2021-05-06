import java.util.Arrays;
import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		int diff = Integer.MAX_VALUE;
		int num1= 0;
		int num2 = 0;
		System.out.println("Please enter the number of elements in array");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] values = new int[length];
		System.out.println("Please enter the number of elements in array");
		for(int i =0; i < length; i++) {
			values[i] = sc.nextInt();
		}
		int low =0;
		int high = length - 1;
		for(int i =0; i < values.length;i++) {
			for(int j = i+1;j < values.length-1;j++) {
				if(Math.abs(values[low] - values[high]) < diff) {
					num1 = values[low];
					num2 = values[high];

				}
				
			}
		}
		System.out.println(num1 + " " + num2);


	}

}
