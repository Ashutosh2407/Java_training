import java.util.HashMap;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int length = sc.nextInt();
		int[] values = new int[length];
		for(int i = 0; i < length; i++) {
			values[i] = sc.nextInt();
		}
		System.out.println("The array is ");
		for(int i = 0; i < length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		System.out.println("The unique array is ");
		removeDuplicate(values, length);
		
	}
	
	public static void removeDuplicate(int[] values, int length) {
		
		HashMap<Integer, Boolean> num = new HashMap<Integer, Boolean>();
		for(int i = 0; i < length; i++) {
			if (num.get(values[i]) == null) {
				System.out.print(values[i] + " ");
				num.put(values[i], true);
			}
		}
	}

}
