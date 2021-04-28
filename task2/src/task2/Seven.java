package task2;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		
			System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in);
			int inp = sc.nextInt();
			if (inp%2 !=0) {
				System.out.println("NEW");
			}
			else if(inp%2 ==0 && 2<=inp && inp <=5) {
				System.out.println("OLD");
			}
			else if(inp%2 ==0 && 6<=inp && inp <=30) {
				System.out.println("NEW");
			}
			else if(inp%2 ==0 && inp >30) {
				System.out.println("OLD");
			}
		}

	

}
