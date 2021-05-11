import java.util.HashMap;
import java.util.Scanner;

public class Six {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Please enter the length of the array");
		  int length = sc.nextInt();
		  int[] values = new int[length];
		  
		  int count_odd = 0;
		  int count_even = 0;
		  for(int i=0; i< length; i++) {
			  values[i] = sc.nextInt();
			  if(values[i] %2 ==0) {
				  count_even++;
			  }
			  else {
				  count_odd++;
			  }
		  }
		  if (count_even ==1) {
			  for(int i = 0; i< length;i++) {
				  if(values[i] %2 ==0) {
					  System.out.println("The number is "+values[i]);
					  break;
				  }
			  }
		  }
		  else {
			  for(int i = 0; i< length;i++) {
				  if(values[i] %2 !=0) {
					  System.out.println("The number is "+values[i]);
					  break;
				  }
			  }
		 }
	}
}

