package task7;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		System.out.println("PLease enter the string");
		Scanner sc= new Scanner(System.in);
		//String str = sc.nextLine();
		char[] input = "1214".toCharArray();
		char[] output = new char[100];
		printCombinations(input,0,output,0);

	}
	
	
	
	static void printCombinations(char[] input, int index, char[] output, int outLength) {
		if(input.length == index) {
			System.out.println(String.valueOf(output));
			return;
		}
		output[outLength] = input[index];
		output[outLength + 1] = ' ';
		printCombinations(input,index +1, output, outLength +1);
		
		if(input.length!= index+1)
			printCombinations(input,index+1,output,outLength+1);
		
	}

}
