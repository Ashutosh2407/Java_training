import java.util.HashMap;

public class Six {
	
	public static void movezeroback(int[] arr) {
		int count = 0;  
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; 
        while (count < arr.length)
            arr[count++] = 0;	
        
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
       
	}

	public static void main(String[] args) {
		int[] arr = {2,2,3,3,4,4,4,11,11,11,11};
		HashMap<Integer,Boolean> chk = new HashMap<Integer, Boolean>();
		for(int i =0; i < arr.length;i++) {
			if(chk.get(arr[i]) == null) {
				chk.put(arr[i], true);
			}
			else {
				arr[i] = 0;
			}
		}
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		movezeroback(arr);

	}

}
