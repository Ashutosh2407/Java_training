package task2;
import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
		System.out.println("PLease enter a number");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		while (true) {
			if (inp>=0){
				System.out.println("Good Going");
				System.out.println("Please enter a number");
				inp = sc.nextInt();
			}
			else {
				System.out.println("Its Over");
				break;
			}
			
			
			
		}

	}

}
