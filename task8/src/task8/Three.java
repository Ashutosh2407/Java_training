package task8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Three {

	public static void main(String[] args) {
		int a[] = {1,2,5,9,384,54156,165,4,3215,41,1,56};
		IntStream s = Arrays.stream(a);
		System.out.println(s.max());

	}

}
