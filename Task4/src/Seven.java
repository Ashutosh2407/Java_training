import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Please enter the number of elements in array");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] values = new int[length];
		System.out.println("Please enter the elements of in array");
		for(int i =0; i < length; i++) {
			values[i] = sc.nextInt();
		}
		for(int i =0; i < length;i++) {
			if (values[i] > max) {
				max = values[i];
			}
			
			if(values[i] < min) {
				min = values[i];
			}
		}
		System.out.println("The difference between the largest and smallest element is "+(max-min));
	}

}
