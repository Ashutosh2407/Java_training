import java.util.HashMap;

public class Eight {

	public static void main(String[] args) {
		int[] values = {1,2,5,6,3,9,9,5,1,2,3};
		int length = 0;
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		for(int i =0; i < values.length; i++) {
			if (hm.get(values[i]) == null) {
				hm.put(values[i], true);
				length++;
			}
		}
		System.out.println("Length of unique array is " +length);
	}

}
