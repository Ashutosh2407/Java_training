package task7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Three {
	
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersect = new HashSet<>();
		for(int i =0; i < nums1.length;i++) {
			set.add(nums1[i]);
		}
		
		for(int i =0; i < nums2.length;i++) {
			if(set.contains(nums2[i])) {
				intersect.add(nums2[i]);
			}
		}
		int[] result = new int[intersect.size()];
		int i =0;
		for(Integer num : intersect) {
			result[i] = num;
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of first array");
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int[] arr1 = new int[l1];
		System.out.println("Enter the elements in the array");
		for(int i =0; i < l1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the length of second array");
		int l2 = sc.nextInt();
		int[] arr2 = new int[l1];
		System.out.println("Enter the elements in the array");
		for(int i =0; i < l2;i++) {
			arr2[i] = sc.nextInt();
		}
		int[] inter = intersection(arr1,arr2); 
		System.out.println("The intersection of the array is");
		for(int i = 0; i< inter.length; i++) {
			System.out.print(inter[i]+ " ");
		}

	}

}
