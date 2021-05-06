import java.util.HashMap;

public class Nine {

	public static void main(String[] args) {
		int[] values = {1,2,3,4,5,6};
		int target = 6;
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0; i < values.length; i++) {
			if(hm.get(values[i]) != null) {
				System.out.print("The values are " +(values[i])+" and "+hm.get(values[i]));
				break;
			}
			else {
				hm.put(target-values[i], values[i]);
			}
		}
	}

}
