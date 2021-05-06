import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements in array");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] values = new int[length];
		int[] result = new int[length];
		System.out.println("Please enter the number of elements in array");
		for(int i =0; i < length; i++) {
			values[i] = sc.nextInt();
		}
		Arrays.sort(values);
		int low = 0;
		int i =0;
		int high = length - 1;
		boolean sw = true;
		while (low < high && i < length) {
			if (sw) {
				result[i] = values[high];
				sw = false;
				high--;
			}
			else {
				result[i] = values[low];
				sw = true;
				low++;
			}
			i++;
		}
		for(int p = 0; p < length ; p++) {
			System.out.print(result[p] + " ");
		}
	}

}
