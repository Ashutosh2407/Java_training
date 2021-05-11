
public class Two {

	public static void main(String[] args) {
		int[] values = {1,2,3,4,5,6,7,8,9};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i =0; i < values.length; i++) {
			sum+=values[i];
			if(values[i] > max) {
				max = values[i];
			}
			if(values[i] < min) {
				min = values[i];
			}
		}
		System.out.println("The sum is " +(sum -max-min));

	}

}
