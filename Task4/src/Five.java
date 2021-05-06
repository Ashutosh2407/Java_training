
public class Five {

	public static void main(String[] args) {
		int[] arr = {5,1,5,2,0,0,3,69,7,52,0,7,0,14,15};
		
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
}
