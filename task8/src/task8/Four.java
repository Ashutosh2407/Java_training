package task8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Four {

	public static void main(String[] args) {
		int[] a = {121,545,451,2,84,5,3,45,45,400,498,41};
		IntStream s = Arrays.stream(a);
		System.out.println(s.average());
			
	}

}
